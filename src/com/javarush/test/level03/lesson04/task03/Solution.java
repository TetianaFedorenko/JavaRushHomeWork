package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg zerg1 = new Zerg ();
        zerg1.name = "zxfg";
        Zerg zerg2 = new Zerg ();
        zerg2.name = "zhfj";
        Zerg zerg3 = new Zerg ();
        zerg3.name = "thgfxh";
        Zerg zerg4 = new Zerg ();
        zerg4.name = "dgf";
        Zerg zerg5 = new Zerg ();
        zerg5.name = "bvn";
        Zerg zerg6 = new Zerg ();
        zerg6.name = "jkjk";
        Zerg zerg7 = new Zerg ();
        zerg7.name = "zxdf";
        Zerg zerg8 = new Zerg ();
        zerg8.name = "nmm";
        Zerg zerg9 = new Zerg ();
        zerg9.name = "qwere";
        Zerg zerg10 = new Zerg ();
        zerg10.name = "zsdgbh";

        Protos protos1 = new Protos();
        protos1.name = "gfh";
        Protos protos2 = new Protos();
        protos2.name = "pljh";
        Protos protos3 = new Protos();
        protos3.name = "iofh";
        Protos protos4 = new Protos();
        protos4.name = "mnf";
        Protos protos5 = new Protos();
        protos5.name = "pldfk";

        Terran terran1 = new Terran();
        terran1.name = "poldflfl";
        Terran terran2 = new Terran();
        terran2.name = "sklkld";
        Terran terran3 = new Terran();
        terran3.name = "odjnjd";
        Terran terran4 = new Terran();
        terran4.name = "jhff";
        Terran terran5 = new Terran();
        terran5.name = "tdfd";
        Terran terran6 = new Terran();
        terran6.name = "dzsgf";
        Terran terran7 = new Terran();
        terran7.name = "tygh";
        Terran terran8 = new Terran();
        terran8.name = "uiut";
        Terran terran9 = new Terran();
        terran9.name = "tmnm";
        Terran terran10 = new Terran();
        terran10.name = "tzsd";
        Terran terran11 = new Terran();
        terran11.name = "szer";
        Terran terran12 = new Terran();
        terran12.name = "zsert";
/*
        Zerg[] zerg = new Zerg[10];
        zerg[0].name = "z1";
        zerg[1].name = "z2";
        zerg[2].name = "z3";
        zerg[3].name = "z4";
        zerg[4].name = "z5";
        zerg[5].name = "z6";
        zerg[6].name = "z7";
        zerg[7].name = "z8";
        zerg[8].name = "z9";
        zerg[9].name = "z10";

        Protos[] protos = new Protos[5];
        protos[0].name = "p1";
        protos[1].name = "p2";
        protos[2].name = "p3";
        protos[3].name = "p4";
        protos[4].name = "p5";

        Terran[] terran = new Terran[12];
        terran[0].name = "t1";
        terran[1].name = "t2";
        terran[2].name = "t3";
        terran[3].name = "t4";
        terran[4].name = "t5";
        terran[5].name = "t6";
        terran[6].name = "t7";
        terran[7].name = "t8";
        terran[8].name = "t9";
        terran[9].name = "t10";
        terran[10].name = "t11";
        terran[11].name = "t12";
*/
    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}