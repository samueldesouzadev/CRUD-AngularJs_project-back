package com.cadastro.cliente.api.mapping;

public class UriMappingConstants {

    public static final class Controller{
        public static final String API = "api";
    }

    public static final class Cliente{
        public static final String FINDALL = "/save";
        public static final String SAVE = "/save";
        public static final String EDIT = "/save";
        public static final String DELETE = "/cliente/{id}";
        public static final String FINDBYID = "/findBy/{id}";
        public static final String FINDBYNAME = "/findBy/{nome}";
    }
}
