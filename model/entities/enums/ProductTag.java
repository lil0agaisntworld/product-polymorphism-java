package model.entities.enums;

public enum ProductTag {
    COMMON ("PRODUTO NOVO"),
    USED ("PRODUTO USADO"),
    IMPORTED ("PRODUTO IMPORTADO");

    private String tag;

    ProductTag(String tag){
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

}
