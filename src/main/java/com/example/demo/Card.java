package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
public class Card {
        public static final char[] types = {'\u2663', '\u2666', '\u2665', '\u2660'};
        int point;
        int type;

        public Card(int index){
                point = index % 13 +1;
                type = index / 13;
        }

        public Card(int point, int type){
                this.point = point;
                this.type = type;
        }
/*
        @Override
        public String toString(){
                return ((point < 10) ? " " : "") + point + types[type];
        }*/

}
