package com.cadastro.cliente.api.mapping;

public class UriMappingConstants {

    public static final class Controller{
        public static final String API = "api";
        public static final String CLIENTE = "cliente";
        public static final String CONTATO = "contato";
    }

    public static final class Standard{
        public static final String FINDALL = "/findAll";
        public static final String SAVE = "/save";
        public static final String EDIT = "/edit";
        public static final String DELETE = "/delete";
        public static final String FINDBYID = "/findBy/{id}";
        public static final String FINDBYNAME = "/findBy/{nome}";
    }
}
