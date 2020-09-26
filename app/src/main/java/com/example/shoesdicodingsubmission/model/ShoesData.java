package com.example.shoesdicodingsubmission.model;

import com.example.shoesdicodingsubmission.R;

import java.util.ArrayList;

public class ShoesData {

    private static String[] shoesNames = {
            "Men's Air Jordan Retro 1 Low SE",
            "Women's Nike Air Max 270",
            "Women's Nike Free Metcon 3",
            "Big Kids' Nike Air Max 270",
            "Men's Nike Air Force 1 '07 Independence Day",
            "Men's Nike Air Force 1 Low",
            "Women's Nike Air Force 1 Low",
            "Big Kids' Nike Air Force 1 Mid",
            "Men's Adidas Originals ZX 750",
            "Little Kids Converse Chuck Taylor Low Top"
    };

    private static double[] price = {
            100.00,
            150.00,
            120.00,
            120.00,
            90.00,
            90.00,
            90.00,
            85.00,
            90.00,
            35.00
    };

    private static String[] type = {
            "Casual",
            "Casual",
            "Training",
            "Casual",
            "Casual",
            "Casual",
            "Casual",
            "Casual",
            "Casual",
            "Casual"
    };

    private static String[] size = {
            "8.0 | 9.0 | 10.0 | 11.0 | 12.0 | 13.0",
            "6.0 | 6.5 | 7.0 | 8.0 | 9.0",
            "5.5 | 6.0 | 7.0 | 9.0 | 9.5 | 10.0",
            "4.0 | 4.5 | 5.0 | 5.5 | 6.0 | 6.5 | 7.0",
            "9.0 | 9.5 | 10.0 | 10.5 | 11.0 | 12.0",
            "10.0 | 10.5 | 11.0 | 11.5 | 12.0 | 13.0",
            "6.0 | 6.5 | 7.5 | 8.0 | 8.5",
            "4.0 | 4.5 | 5.0 | 5.5 | 6.0 | 6.5 | 7.0",
            "9.0 | 9.5 | 10.0 | 10.5 | 11.0 | 12.0",
            "11.0 | 11.5 | 12.0 | 13.0 | 13.5"
    };

    private static String[] shoesDetails = {
            "Add a new flavor to your Jordan wardrobe with the Men's Air Jordan Retro 1 Low SE Casual Shoes. Bright colors and new trim details team up to make this classic a modern-day muse.",
            "The iconic Air Max 180 and Air Max 93 are immortalized on the all new Women's Nike Air Max 270 Casual Shoes. This fresher-than-ever model was originally named the Air Max 273 – a mathematical nod to 180 + 93. However, the silhouette was changed to reflect all 270 degrees of visible Air on the heel. Featuring an exaggerated tongue, large volume Max Air unit and heritage branding, these sneakers offer the best of both worlds - old school details and modern comfort.\n" +
                    "\n" +
                    "Get athleisure vibes with plenty of performance in the newest addition to the Nike Air Max Collection: The Women's Nike Air Max 270 Casual Shoes. Featuring comfort with every step and an exaggerated silhouette, these sneakers are a must for all-day wear.",
            "Multi-directional, intense training calls for a performance powerhouse pair of sneakers that offer rock-solid support and enhanced breathability. Enter the Women's Nike Free Metcon 3 Training Shoes. The third iteration of Nike's much-loved Metcon model is designed to offer stability and flexibility as you push yourself through your toughest workouts.",
            "The iconic Air Max 180 and Air Max 93 are immortalized on the all new Big Kids' Nike Air Max 270 Casual Shoes. This fresher-than-ever model was originally named the Air Max 273 – a mathematical nod to 180 + 93. However, the silhouette was changed to reflect all 270 degrees of visible Air on the heel. Featuring an exaggerated tongue, large volume Max Air unit and heritage branding, these sneakers offer the best of both worlds - old school details and modern comfort.",
            "Nothing says summer like a little red, white and blue. Slip into the Men's Nike Air Force 1 '07 Independence Day Casual Shoes for an OG look that brings the summer heat.",
            "Making its way onto the hardwood in 1982, the Nike Air Force 1 was the first shoe featuring the now-iconic Nike Air cushioning. Step up your style game when you step out in the cult-like classic AF1 sneakers from Nike and experience the head-turning style that’s made its way through pop culture for decades. Being an icon isn’t easy, but the Nike Air Force 1 Casual Shoes help you along the way. Named after the United States President’s personal air craft carrier fleet, these sneakers have been, and continue to remain, a true leader in the footwear industry.\n" +
                    "\n" +
                    "Are you ready to take your street style to the next level? Slip into a pair of Air Force 1 Low sneakers today and experience the silhouette that changed the sneaker game infinitely.",
            "From an iconic hip-hop song—shout out to Nelly—to the streets to the courts, the Nike Air Force 1 has dominated the footwear game for decades. Named for the President’s air craft, and with premium details and crisp design, these Nike Air Force 1s celebrate iconic style and heritage Nike DNA. Today, the Women’s Air Force 1 Lows are a staple in the wardrobes of some of the most stylish girls on the block.\n" +
                    "\n" +
                    "Whether you rock them with shorts or leggings, or add an edge to your skirts and dresses, the Air Force 1 is a versatile sneaker for style-savvy ladies everywhere.",
            "Boasting a supple leather upper and a clean, timeless design, these sneakers look as good as they feel. A full-length Air Sole unit teams up with a foam midsole for extra cushioning and support on the playground, in gym class or at basketball practice. They'll also get plenty of traction, thanks to the rubber outsole with pivot points.\n" +
                    "\n" +
                    "With its classic style and iconic shape, it's no wonder that the Big Kids' Nike Air Force 1 Mid Basketball Shoe is a sneaker head's first and last word in basketball shoes.",
            "The newest iteration from the adidas ZX family has arrived. The Men's adidas Originals ZX 750 Casual Shoes features iconic street styling styling along with retro runner appeal.",
            "The classic, iconic Chuck Taylor Low Top is back and as stylish as ever on this coveted little kids' model."
    };

    private static int[] photo = {
            R.drawable.s1,
            R.drawable.s2,
            R.drawable.s3,
            R.drawable.s4,
            R.drawable.s5,
            R.drawable.s6,
            R.drawable.s7,
            R.drawable.s8,
            R.drawable.s9,
            R.drawable.s10,
    };

    public static ArrayList<Shoes> getAllShoes(){
        ArrayList<Shoes> list = new ArrayList<>();
        for(int i=0; i<shoesNames.length; i++){
            Shoes shoes = new Shoes();
            shoes.setName(shoesNames[i]);
            shoes.setDetail(shoesDetails[i]);
            shoes.setPhoto(photo[i]);
            shoes.setPrice(price[i]);
            shoes.setSize(size[i]);
            shoes.setType(type[i]);
            list.add(shoes);
        }
        return list;
    }
}

