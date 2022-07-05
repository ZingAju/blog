package com.zingscoop.inheritance;

class InitConfig {
    public InitConfig() {
        System.out.println("Init Config constructor called");
    }
}
class DynamicConfig extends InitConfig {
}

class InitConfigTest {
    public static void main(String args[]){
        DynamicConfig dc = new DynamicConfig();
    }
}


