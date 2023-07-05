package com.zzpzaf.se.devxperiences.posts.externalvalues.Properties;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.context.properties.EnableConfigurationProperties;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotEmpty;



// @Component
@ConfigurationProperties(prefix="set1")
@Validated
public class DataBaseObjectNames {
    
    //@NotEmpty
    private String categoriesTable;
    @NotEmpty
    private String itemsTable;
    @NotEmpty
    private String vendorsTable;
    @NotEmpty
    private String vendorCategoriesTable;


    public  DataBaseObjectNames(@DefaultValue("categories") String categoriesTable, String itemsTable, String vendorsTable, String vendorCategoriesTable) {
        this.categoriesTable=categoriesTable;
        this.itemsTable=itemsTable;
        this.vendorsTable=vendorsTable;
        this.vendorCategoriesTable=vendorCategoriesTable;
    } 

    public String getCategoriesTable() {
        return categoriesTable;
    }
    // public void setCategoriesTable(String categoriesTable) {
    //     this.categoriesTable = categoriesTable;
    // }
    public String getItemsTable() {
        return itemsTable;
    }
    // public void setItemsTable(String itemsTable) {
    //     this.itemsTable = itemsTable;
    // }
    public String getVendorsTable() {
        return vendorsTable;
    }
    // public void setVendorsTable(String vendorsTable) {
    //     this.vendorsTable = vendorsTable;
    // }
    public String getVendorCategoriesTable() {
        return vendorCategoriesTable;
    }
    // public void setVendorCategoriesTable(String vendorCategoriesTable) {
    //     this.vendorCategoriesTable = vendorCategoriesTable;
    // }

}
