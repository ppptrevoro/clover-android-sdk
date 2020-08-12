package com.clover.sdk.v3.inventory;

import com.clover.sdk.v3.inventory.Attribute;
import com.clover.sdk.v3.inventory.Category;
import com.clover.sdk.v3.inventory.Discount;
import com.clover.sdk.v3.inventory.Item;
import com.clover.sdk.v3.inventory.ItemGroup;
import com.clover.sdk.v3.inventory.Modifier;
import com.clover.sdk.v3.inventory.ModifierGroup;
import com.clover.sdk.v3.inventory.Option;
import com.clover.sdk.v3.inventory.OptionItem;
import com.clover.sdk.v3.inventory.Tag;
import com.clover.sdk.v3.inventory.TaxRate;
import com.clover.sdk.v1.ResultStatus;

/**
 * An interface for interacting with the Clover inventory service. The inventory
 * service is a bound AIDL service. Bind to this service as follows:
 * <pre>
 * <code>
 * Intent serviceIntent = new Intent(InventoryIntent.ACTION_INVENTORY_SERVICE_V3);
 * serviceIntent.putExtra(Intents.EXTRA_ACCOUNT, CloverAccount.getAccount(context));
 * serviceIntent.putExtra(Intents.EXTRA_VERSION, 3);
 * context.bindService(serviceIntent);
 * </code>
 * </pre>
 * For more information about bound services, refer to
 * the Android documentation:
 * <a href="http://developer.android.com/guide/components/bound-services.html#Binding">
 * Bound Services
 * </a>.
 * <p>
 * You may also interact with this service through the
 * {@link InventoryConnector} class, which handles binding and
 * asynchronous invocation of service methods.
 * <p>
 * Prefer the {@link InventoryContract} over the getter methods in this class, the contract offers
 * better performance and is not subject to large inventory limitations that can cause the getter
 * methods here to fail.
 * <p>
 * This service is backed by a local database which is synced to cloud. Thus changes made
 * by calling methods here will be reflected on all of a merchant's devices and on the web.
 * <p>
 * Typically a merchant customizes their inventory either by importing data from a spreadsheet or
 * manually entering their inventory data on the web or through the Clover Inventory app.
 * <p>
 * Invoking methods through this service generally requires INVENTORY_R and/or INVENTORY_W
 * permission. See <a href="https://docs.clover.com/clover-platform/docs/permissions">Clover app
 * permissions</a>
 * <p>
 * <h2>Items</h2>
 * <p>
 * The basic unit of a merchant's inventory is the {@link Item}. Items could be goods such as shoes
 * and socks, or services such as a haircut. Merchants that simply take payments on their devices
 * may have no inventory items at all.
 * <p>
 * <h2>Discounts</h2>
 * <p>
 * A {@link Discount} may be associated with an entire Order subtotal or an individual Item.
 * Discounts are named and given either a percentage value or fixed amount. Discounts appear as
 * choices in Clover Register and are printed on bills.
 * <p>
 * <h2>Tax Rates</h2>
 * <p>
 * A {@link TaxRate} is used to add taxes to an Order when computing the total. Default tax rates
 * are applied to all items that do not override the defaults. An Item may override the default tax
 * rates and be associated with specific (or no) tax rates.
 * <p>
 * <h2>Categories</h2>
 * <p>
 * Categories alter the user interface of the Clover Register app. Items appear in the Clover
 * Register app within categories they are members of. Items may be associated with no, one or many
 * categories. Items are displayed in Clover Register in the order in which they are added to a category.
 * Categories are displayed in Register using the sort order value for each category. Categories
 * are designed only to be use for anything other modifying the user experience of Register, for a
 * more generic organization mechanism see the section on Tags.
 * <p>
 * <h2>Modifier Groups and Modifiers</h2>
 * <p>
 * Modifiers are used by Clover Register to make adjustments to associated items. A modifier may or
 * may not increase the price of an item. For example a <i>Burger</i> item may be associated with
 * the <i>Condiment</i> modifier group which contains <i>mayo</i> (no charge) and <i>avocado</i>
 * (additional $2.00). A modifier group may specify that an exact number of modifiers be selected
 * when an item is selected in Clover Register. Modifiers are printed on bills and order receipts.
 * <p>
 * <h2>Item Groups (aka Item with variants), Attributes and Options</h2>
 * <p>
 * Item Groups help merchants create and manage large groups of related items. This is described to
 * merchants as an 'Item with variants'. For example a merchants may sell a t-shirt that is
 * available in numerous various sizes and colors. Each of the t-shirt variations is an item and
 * belongs to the t-shirt item group. Once an item group is created it appears in Register as a
 * single button and tapping it brings up a choice of which variation is to be sold. Before adding
 * items to an item group you first need to create the item group, then create attributes ('size',
 * 'color') and then options for each attribute ('small', 'blue'), then associate options with an
 * item and then associate items with an item group. The name of an item which is a member of an
 * item group is automatically generated by the Clover server as a combination of the item group
 * name and the name of all the options associated with that item. It cannot be changed. If the
 * item group name is changed, or if an option name is changed, then the item names will be
 * automatically regenerated. An item can only be a member of a single item group and once it is
 * part of an item group it can never be removed or moved to another item group, it can only be
 * deleted.
 * <p>
 * <h2>Tags (aka Labels)</h2>
 * <p>
 * Similarly to how they are described by wikipedia, tags are an informal way of establishing a
 * relationship. Tags currently may be associated with items and printers. When an tag is
 * associated with both an item and a printer that establishes a special relationship that results
 * in those items being printed out on the associated printer when printing an order. Other than
 * that special case there is no effect when an item is associated with a tag. Developers may use
 * tags to establish a relationship meaningful for their needs.
 * <p>
 * @see InventoryConnector
 */
interface IInventoryService {

  /**
   * @deprecated Many merchants have a large inventory of items that cannot be retrieved in a
   * single shot due to binder and memory limits. As a precaution always use the
   * {@link com.clover.sdk.v3.inventory.InventoryContract} to retrieve the entire set of inventory
   * items.
   * <p/>
   * This method will return a maximum of 500 items before returning a fault.
   */
  List<Item> getItems(out ResultStatus resultStatus);

  /**
   * @deprecated See note on {@link #getItems(ResultStatus).
   */
  List<Item> getItemsWithCategories(out ResultStatus resultStatus);

  /**
   * @deprecated See note on {@link #getItems(ResultStatus).
   */
  List<String> getItemIds(out ResultStatus resultStatus);

  /**
   * Retrieve an individual item using the item ID. If the item is not in the local database, an
   * attempt will be made to fetch the item from the server.
   */
  Item getItem(in String itemId, out ResultStatus resultStatus);

  /**
   * Same as {@link #getItem(String, ResultStatus)} but also includes the list of categories to
   * which the item belongs.
   */
  Item getItemWithCategories(in String itemId, out ResultStatus resultStatus);

  /**
   * Inserts a new item into the database. If the client is in offline mode, the item will be inserted
   * into the local cache and a request to create the new item on the server will be queued until
   * the client is online again. Returns the newly created item as it exists in the local content
   * provider/cache.
   */
  Item createItem(in Item item, out ResultStatus resultStatus);

  /**
   * Updates an existing item. You may update the following fields: name (unless this item is in an
   * item group), alternateName, price, priceWithoutVat, code, priceType, unitName, defaultTaxRates,
   * cost, sku, hidden, isRevenue.
   */
  void updateItem(in Item item, out ResultStatus resultStatus);

  /**
   * Deletes an existing item.
   */
  void deleteItem(in String itemId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of categories.
   * <p>
   * Prefer to use the {@link InventoryContract} over this method since this method will fail for
   * large result sets that exceed binder limitations.
   */
  List<Category> getCategories(out ResultStatus resultStatus);

  /**
   * Adds a new category.
   */
  Category createCategory(in Category category, out ResultStatus resultStatus);

  /**
   * Updates an existing category.
   */
  void updateCategory(in Category category, out ResultStatus resultStatus);

  /**
   * Deletes an existing category.
   */
  void deleteCategory(in String categoryId, out ResultStatus resultStatus);

  /**
   * Adds an item to a category.
   */
  void addItemToCategory(in String itemId, in String categoryId, out ResultStatus resultStatus);

  /**
   * Removes an item from a category.
   */
  void removeItemFromCategory(in String itemId, in String categoryId, out ResultStatus resultStatus);

  /**
   * Moves an item's position within an existing category. If 'direction' is negative, the item is moved to the left.
   */
  void moveItemInCategoryLayout(in String itemId, in String categoryId, in int direction, out ResultStatus resultStatus);

  /**
   * Retrieve the list of all modifier groups.
   * <p>
   * Prefer to use the {@link InventoryContract} over this method since this method will fail for
   * very large result sets that exceed binder limitations.
   * <p>
   * Note that the returned ModifierGroup instances will not contain all the individual modifiers,
   * invoke {@link #getModifiers(String)} to retrieve the  individual modifiers for each particular
   * ModifierGroup.
   */
  List<ModifierGroup> getModifierGroups(out ResultStatus resultStatus);

  /**
   * Adds a new modifier group.
   */
  ModifierGroup createModifierGroup(in ModifierGroup group, out ResultStatus resultStatus);

  /**
   * Updates an existing modifier group.
   */
  void updateModifierGroup(in ModifierGroup group, out ResultStatus resultStatus);

  /**
   * Deletes an existing modifier group.
   */
  void deleteModifierGroup(in String groupId, out ResultStatus resultStatus);

  /**
   * Associates a modifier group with an item.
   */
  void assignModifierGroupToItem(in String modifierGroupId, in String itemId, out ResultStatus resultStatus);

  /**
   * Removes a modifier group association from an item.
   */
  void removeModifierGroupFromItem(in String modifierGroupId, in String itemId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of modifiers belonging to a modifier group.
   */
  List<Modifier> getModifiers(in String modifierGroupId, out ResultStatus resultStatus);

  /**
   * Adds a new modifier.
   */
  Modifier createModifier(in String modifierGroupId, in Modifier modifier, out ResultStatus resultStatus);

  /**
   * Updates an existing modifier.
   */
  void updateModifier(in Modifier modifier, out ResultStatus resultStatus);

  /**
   * Deletes an existing modifier.
   */
  void deleteModifier(in String modifierId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of tax rates for an item.
   */
  List<TaxRate> getTaxRatesForItem(in String itemId, out ResultStatus resultStatus);

  /**
   * Assign a list of tax rates (identified by their unique ID) to an item.
   */
  void assignTaxRatesToItem(in String itemId, in List<String> taxRates, out ResultStatus resultStatus);

  /**
   * Remove a list of tax rates (identified by their unique ID) from an item.
   */
  void removeTaxRatesFromItem(in String itemId, in List<String> taxRates, out ResultStatus resultStatus);

  /**
   * Gets all defined tax rates for the merchant.
   */
  List<TaxRate> getTaxRates(out ResultStatus resultStatus);

  /**
   * Gets a single tax rate identified by its unique ID.
   */
  TaxRate getTaxRate(in String taxRateId, out ResultStatus resultStatus);

  /**
   * Creates a new tax rate.
   */
  TaxRate createTaxRate(in TaxRate taxRate, out ResultStatus resultStatus);

  /**
   * Updates an existing tax rate.
   */
  void updateTaxRate(in TaxRate taxRate, out ResultStatus resultStatus);

  /**
   * Deletes a tax rate.
   */
  void deleteTaxRate(in String taxRateId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of discounts.
   */
  List<Discount> getDiscounts(out ResultStatus resultStatus);

  /**
   * Gets a single discount identified by its unique ID.
   */
  Discount getDiscount(in String discountId, out ResultStatus resultStatus);

  /**
   * Adds a new discount.
   */
  Discount createDiscount(in Discount discount, out ResultStatus resultStatus);

  /**
   * Updates an existing discount.
   */
  void updateDiscount(in Discount discount, out ResultStatus resultStatus);

  /**
   * Deletes a discount.
   */
  void deleteDiscount(in String discountId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of modifier groups for a particular item.
   */
  List<ModifierGroup> getModifierGroupsForItem(in String itemId, out ResultStatus resultStatus);

  /**
   * Gets all defined tags for the merchant.
   * <p/>
   * This method will return a maximum of 500 values before returning a fault.
   */
  List<com.clover.sdk.v3.inventory.Tag> getTags(out ResultStatus resultStatus);

  /**
   * Gets a single tag identified by its unique ID.
   */
  com.clover.sdk.v3.inventory.Tag getTag(in String tagId, out ResultStatus resultStatus);

  /**
   * Creates a new tag.
   */
  com.clover.sdk.v3.inventory.Tag createTag(in com.clover.sdk.v3.inventory.Tag tag, out ResultStatus resultStatus);

  /**
   * Updates an existing tag.
   */
  void updateTag(in com.clover.sdk.v3.inventory.Tag tag, out ResultStatus resultStatus);

  /**
   * Deletes a tag.
   */
  void deleteTag(in String tagId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of tags for an item.
   */
  List<com.clover.sdk.v3.inventory.Tag> getTagsForItem(in String itemId, out ResultStatus resultStatus);

  /**
   * Assign a list of tags (identified by their unique ID) to an item.
   */
  void assignTagsToItem(in String itemId, in List<String> tags, out ResultStatus resultStatus);

  /**
   * Remove a list of tags (identified by their unique ID) from an item.
   */
  void removeTagsFromItem(in String itemId, in List<String> tags, out ResultStatus resultStatus);

  /**
   * Retrieve the list of tags for a printer.
   */
  List<com.clover.sdk.v3.inventory.Tag> getTagsForPrinter(in String printerMac, out ResultStatus resultStatus);

  /**
   * Assign a list of tags (identified by their unique ID) to a printer.
   */
  void assignTagsToPrinter(in String printerUid, in List<String> tags, out ResultStatus resultStatus);

  /**
   * Remove a list of tags (identified by their unique ID) from a printer.
   */
  void removeTagsFromPrinter(in String printerUid, in List<String> tags, out ResultStatus resultStatus);

  /**
   * Assign a list of items (identified by their unique ID) to a tag.
   */
  void assignItemsToTag(in String tagId, in List<String> items, out ResultStatus resultStatus);

  /**
   * Remove a list of items (identified by their unique ID) from a tag.
   */
  void removeItemsFromTag(in String tagId, in List<String> items, out ResultStatus resultStatus);

  /**
   * Update modifier sort order for a modifier group.
   */
  void updateModifierSortOrder(in String modifierGroupId, in List<String> modifierIds, out ResultStatus resultStatus);

  /**
   * Update stock count for an item. This is the old way of updating stock that takes a long, the new way is
   * updateItemStockQuantity and takes a double.
   */
  void updateItemStock(in String itemId, in long stockCount, out ResultStatus resultStatus);

  /**
   * Remove stock count for an item.
   */
  void removeItemStock(in String itemId, out ResultStatus resultStatus);

  /**
   * Gets all defined attributes for the merchant.
   * <p>
   * Prefer to use the {@link InventoryContract} over this method.
   * <p>
   * This method will return a maximum of 500 values before returning a fault.
   * <p>
   * Note that the returned Attribute instances will not contain all the individual options.
   * To obtain the options for a particular attribute use the contract, for example:
   * <pre>{@code
   * try (Cursor c = getContentResolver()
   *       .query(InventoryContract.Option.contentForItemsUriWithAccount(acct),
   *              null, InventoryContract.Option.ATTRIBUTE_UUID + " = ?",
   *              new String[] { attribute.getId() }, null)) {
   *     // each row in the cursor is an option for the given attribute
   * }
   * }</pre>
   */
  List<com.clover.sdk.v3.inventory.Attribute> getAttributes(out ResultStatus resultStatus);

  /**
   * Gets a single attribute identified by its unique ID.
   */
  com.clover.sdk.v3.inventory.Attribute getAttribute(in String attributeId, out ResultStatus resultStatus);

  /**
   * Creates a new attribute.
   */
  com.clover.sdk.v3.inventory.Attribute createAttribute(in com.clover.sdk.v3.inventory.Attribute attribute, out ResultStatus resultStatus);

  /**
   * Updates an existing attribute.
   */
  void updateAttribute(in com.clover.sdk.v3.inventory.Attribute attribute, out ResultStatus resultStatus);

  /**
   * Deletes an attribute, deletes all the options in that attribute and removes all the associations between those options and items.
   */
  void deleteAttribute(in String attributeId, out ResultStatus resultStatus);

  /**
   * Gets all defined options for the merchant.
   * <p>
   * Prefer to use the {@link InventoryContract} over this method.
   * <p>
   * This method will return a maximum of 500 values before returning a fault.
   */
  List<com.clover.sdk.v3.inventory.Option> getOptions(out ResultStatus resultStatus);

  /**
   * Gets a single option identified by its unique ID.
   */
  com.clover.sdk.v3.inventory.Option getOption(in String optionId, out ResultStatus resultStatus);

  /**
   * Creates a new option.
   */
  com.clover.sdk.v3.inventory.Option createOption(in com.clover.sdk.v3.inventory.Option option, out ResultStatus resultStatus);

  /**
   * Updates an existing option.
   */
  void updateOption(in com.clover.sdk.v3.inventory.Option option, out ResultStatus resultStatus);

  /**
   * Deletes an option and removes all the associations between that option and items.
   */
  void deleteOption(in String optionId, out ResultStatus resultStatus);

  /**
   * Retrieve the list of options for an item.
   */
  List<com.clover.sdk.v3.inventory.Option> getOptionsForItem(in String itemId, out ResultStatus resultStatus);

  /**
   * Associate the given options with an item.
   */
  void assignOptionsToItem(in String itemId, in List<String> optionIds, out ResultStatus resultStatus);

  /**
   * Remove the association between the given options and an item.
   */
  void removeOptionsFromItem(in String itemId, in List<String> optionIds, out ResultStatus resultStatus);

  /**
   * Gets a single item group identified by its unique ID.
   */
  com.clover.sdk.v3.inventory.ItemGroup getItemGroup(in String itemGroupId, out ResultStatus resultStatus);

  /**
   * Creates a new item group.
   */
  com.clover.sdk.v3.inventory.ItemGroup createItemGroup(in com.clover.sdk.v3.inventory.ItemGroup itemGroup, out ResultStatus resultStatus);

  /**
   * Updates an existing item group.
   */
  void updateItemGroup(in com.clover.sdk.v3.inventory.ItemGroup itemGroup, out ResultStatus resultStatus);

  /**
   * Deletes an item group, but does not delete the items in a group, they become items without an item group.
   */
  void deleteItemGroup(in String itemGroupId, out ResultStatus resultStatus);

  /**
   * Update stock for an item.
   */
  void updateItemStockQuantity(in String itemId, in double quantity, out ResultStatus resultStatus);

  /**
   * Updates the sort orders for a list of modifier groups.
   */
  void updateModifierGroupSortOrders(in List<ModifierGroup> groups, out ResultStatus resultStatus);

  /**
   * Retrieve the list of tax rates excluded for an item, given the order-type-id
   */
  List<TaxRate> getTaxRatesExcludedForItem(in String orderTypeId, in String itemId, out ResultStatus resultStatus);

}
