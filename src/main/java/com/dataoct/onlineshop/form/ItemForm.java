package com.dataoct.onlineshop.form;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Created By Dataoct Team on 3/11/2018.
 */
@Data
public class ItemForm {
    @Min(value = 1)
    private Integer quantity;
    @NotEmpty
    private String productId;
}
