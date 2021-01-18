package com.amazon.basic;

import basic.LearnAccessModifier;

public class Pizza {
    public static void main(String[] args) {

        LearnAccessModifier lm = new LearnAccessModifier();
   //     lm.name //public access modifier
        LearnAccessModifier.display();
        System.out.println(lm.name);
        
    }
}
