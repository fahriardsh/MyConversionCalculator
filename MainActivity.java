package com.example.myconversioncalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText meters, inches, feet, yards, miles, nautical, kilograms, ounches, pounds, troy, stones,
             shortTons, longTons, liters, fluid, quarts, gallons, imperial;
    Button calculate1,calculate2,calculate3;

    int a = 0;
    double nmMeters;
    double nmInches;
    double nmFeet;
    double nmYards;
    double nmMiles;
    double nmNautical;

    int b = 0;
    double nmKilograms;
    double nmOunches;
    double nmPounds;
    double nmTroy;
    double nmStones;
    double nmShortTons;
    double nmLongTons;

    int c = 0;
    double nmLiters;
    double nmFluid;
    double nmQuarts;
    double nmGallons;
    double nmImperial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meters = findViewById(R.id.numMeters);
        inches = findViewById(R.id.numInches);
        feet = findViewById(R.id.numFeet);
        yards = findViewById(R.id.numYards);
        miles = findViewById(R.id.numMiles);
        nautical = findViewById(R.id.numNautical);

        calculate1 = findViewById(R.id.calculate1);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 1;
            }
        });

        inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 2;
            }
        });

        feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 3;
            }
        });

        yards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 4;
            }
        });

        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 5;
            }
        });

        nautical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 6;
            }
        });

        calculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == 1){
                    nmMeters = Double.parseDouble(meters.getText().toString());

                    nmInches = nmMeters * 39.3701;
                    nmFeet = nmMeters *  3.28084;
                    nmYards = nmMeters * 1.09361;
                    nmMiles = nmMeters * 0.00062;
                    nmNautical = nmMeters * 0.00054;

                    inches.setText(String.format("%.3f", nmInches));
                    feet.setText(String.format("%.3f", nmFeet));
                    yards.setText(String.format("%.3f", nmYards));
                    miles.setText(String.format("%.3f", nmMiles));
                    nautical.setText(String.format("%.3f", nmNautical));

                } else if (a == 2){
                    nmInches = Double.parseDouble(inches.getText().toString());

                    nmMeters = nmInches * 0.02540;
                    nmFeet = nmInches *  0.08333;
                    nmYards = nmInches * 0.02778;
                    nmMiles = nmInches * 0.00002;
                    nmNautical = nmInches * 0.00001;

                    meters.setText(String.format("%.3f", nmMeters));
                    feet.setText(String.format("%.3f", nmFeet));
                    yards.setText(String.format("%.3f", nmYards));
                    miles.setText(String.format("%.3f", nmMiles));
                    nautical.setText(String.format("%.3f", nmNautical));

                } else if (a == 3){
                    nmFeet = Double.parseDouble(feet.getText().toString());

                    nmMeters = nmFeet * 0.30480;
                    nmInches = nmFeet * 12;
                    nmYards = nmFeet * 0.33333;
                    nmMiles = nmFeet * 0.00019;
                    nmNautical = nmFeet * 0.00016;

                    meters.setText(String.format("%.3f", nmMeters));
                    inches.setText(String.format("%.3f", nmInches));
                    yards.setText(String.format("%.3f", nmYards));
                    miles.setText(String.format("%.3f", nmMiles));
                    nautical.setText(String.format("%.3f", nmNautical));

                } else if (a == 4){
                    nmYards = Double.parseDouble(yards.getText().toString());

                    nmMeters = nmYards *  0.91440;
                    nmInches = nmYards * 36.0000;
                    nmFeet = nmYards * 3.000000;
                    nmMiles = nmYards * 0.00057;
                    nmNautical = nmYards * 0.00049;

                    meters.setText(String.format("%.3f", nmMeters));
                    inches.setText(String.format("%.3f", nmInches));
                    feet.setText(String.format("%.3f", nmFeet));
                    miles.setText(String.format("%.3f", nmMiles));
                    nautical.setText(String.format("%.3f", nmNautical));

                } else if (a == 5){
                    nmMiles = Double.parseDouble(miles.getText().toString());

                    nmMeters = nmMiles *  1609.34;
                    nmInches = nmMiles * 63360.0 ;
                    nmFeet = nmMiles * 5280.00;
                    nmYards = nmMiles * 1760.00;
                    nmNautical = nmMiles * 0.86898;

                    meters.setText(String.format("%.3f", nmMeters));
                    inches.setText(String.format("%.3f", nmInches));
                    feet.setText(String.format("%.3f", nmFeet));
                    yards.setText(String.format("%.3f", nmYards));
                    nautical.setText(String.format("%.3f", nmNautical));

                } else if (a == 6){
                    nmNautical = Double.parseDouble(nautical.getText().toString());

                    nmMeters = nmNautical *  1609.34;
                    nmInches = nmNautical * 63360.0 ;
                    nmFeet = nmNautical * 5280.00;
                    nmYards = nmNautical * 1760.00;
                    nmMiles = nmNautical * 0.86898;

                    meters.setText(String.format("%.3f", nmMeters));
                    inches.setText(String.format("%.3f", nmInches));
                    feet.setText(String.format("%.3f", nmFeet));
                    yards.setText(String.format("%.3f", nmYards));
                    miles.setText(String.format("%.3f", nmMiles));

                } else  {
                    meters.setText("");
                    inches.setText("");
                    feet.setText("");
                    yards.setText("");
                    miles.setText("");
                    nautical.setText("");
                }
            }
        });

        kilograms = findViewById(R.id.numKilograms);
        ounches = findViewById(R.id.numOunches);
        pounds = findViewById(R.id.numPounds);
        troy = findViewById(R.id.numTroy);
        stones = findViewById(R.id.numStones);
        shortTons = findViewById(R.id.numShort);
        longTons = findViewById(R.id.numLong);

        calculate2 = findViewById(R.id.calculate2);

        kilograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 1;
            }
        });

        ounches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 2;
            }
        });

        pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 3;
            }
        });

        troy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 4;
            }
        });

        stones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 5;
            }
        });

        shortTons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 6;
            }
        });

        longTons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = 7;
            }
        });

        calculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b == 1){
                    nmKilograms = Double.parseDouble(kilograms.getText().toString());

                    nmOunches = nmKilograms * 35.274;
                    nmPounds = nmKilograms *  2.2046;
                    nmTroy = nmKilograms * 2.6793;
                    nmStones = nmKilograms * 0.1575;
                    nmShortTons = nmKilograms * 0.0011;
                    nmLongTons = nmKilograms * 0.001;

                    ounches.setText(String.format("%.3f", nmOunches));
                    pounds.setText(String.format("%.3f", nmPounds));
                    troy.setText(String.format("%.3f", nmTroy));
                    stones.setText(String.format("%.3f", nmStones));
                    shortTons.setText(String.format("%.3f", nmShortTons));
                    longTons.setText(String.format("%.3f", nmLongTons));

                } else if (b == 2){
                    nmOunches = Double.parseDouble(ounches.getText().toString());

                    nmKilograms = nmOunches * 0.0283;
                    nmPounds = nmOunches *  0.0625;
                    nmTroy = nmOunches* 0.0760;
                    nmStones = nmOunches * 0.0045;
                    nmShortTons = nmOunches * 0.000031250;
                    nmLongTons = nmOunches * 0.000027902;

                    kilograms.setText(String.format("%.3f", nmKilograms));
                    pounds.setText(String.format("%.3f", nmPounds));
                    troy.setText(String.format("%.3f", nmTroy));
                    stones.setText(String.format("%.3f", nmStones));
                    shortTons.setText(String.format("%.3f", nmShortTons));
                    longTons.setText(String.format("%.3f", nmLongTons));

                } else if (b == 3){
                    nmPounds = Double.parseDouble(pounds.getText().toString());

                    nmKilograms = nmPounds * 0.4536;
                    nmOunches = nmPounds *  16;
                    nmTroy = nmPounds * 1.2153;
                    nmStones = nmPounds * 0.0714;
                    nmShortTons = nmPounds * 0.00050000;
                    nmLongTons = nmPounds * 0.00044643;

                    kilograms.setText(String.format("%.3f", nmKilograms));
                    ounches.setText(String.format("%.3f", nmOunches));
                    troy.setText(String.format("%.3f", nmTroy));
                    stones.setText(String.format("%.3f", nmStones));
                    shortTons.setText(String.format("%.3f", nmShortTons));
                    longTons.setText(String.format("%.3f", nmLongTons));

                } else if (b == 4){
                    nmTroy = Double.parseDouble(troy.getText().toString());

                    nmKilograms = nmTroy * 0.3732;
                    nmOunches = nmTroy *  13.165;
                    nmPounds = nmTroy * 0.8228;
                    nmStones = nmTroy * 0.0588;
                    nmShortTons = nmTroy * 0.00041143;
                    nmLongTons = nmTroy * 0.00036735;

                    kilograms.setText(String.format("%.3f", nmKilograms));
                    ounches.setText(String.format("%.3f", nmOunches));
                    pounds.setText(String.format("%.3f", nmPounds));
                    stones.setText(String.format("%.3f", nmStones));
                    shortTons.setText(String.format("%.3f", nmShortTons));
                    longTons.setText(String.format("%.3f", nmLongTons));

                } else if (b == 5){
                    nmStones = Double.parseDouble(stones.getText().toString());

                    nmKilograms = nmStones * 6.3503;
                    nmOunches = nmStones *  224.00;
                    nmPounds = nmStones * 14.000;
                    nmTroy = nmStones * 17.014;
                    nmShortTons = nmStones * 0.0070;
                    nmLongTons = nmStones * 0.0064;

                    kilograms.setText(String.format("%.3f", nmKilograms));
                    ounches.setText(String.format("%.3f", nmOunches));
                    pounds.setText(String.format("%.3f", nmPounds));
                    troy.setText(String.format("%.3f", nmTroy));
                    shortTons.setText(String.format("%.3f", nmShortTons));
                    longTons.setText(String.format("%.3f", nmLongTons));

                } else if (b == 6){
                    nmShortTons = Double.parseDouble(shortTons.getText().toString());

                    nmKilograms = nmShortTons * 907.19;
                    nmOunches = nmShortTons *  32000;
                    nmPounds = nmShortTons * 2000;
                    nmTroy = nmShortTons * 2430.6;
                    nmStones = nmShortTons * 142.86;
                    nmLongTons = nmShortTons * 0.9072;

                    kilograms.setText(String.format("%.3f", nmKilograms));
                    ounches.setText(String.format("%.3f", nmOunches));
                    pounds.setText(String.format("%.3f", nmPounds));
                    troy.setText(String.format("%.3f", nmTroy));
                    stones.setText(String.format("%.3f", nmStones));
                    longTons.setText(String.format("%.3f", nmLongTons));

                } else if (b == 7) {
                    nmLongTons = Double.parseDouble(longTons.getText().toString());

                    nmKilograms = nmLongTons * 1000;
                    nmOunches = nmLongTons * 35274;
                    nmPounds = nmLongTons * 2204.6;
                    nmTroy = nmLongTons * 2679.3;
                    nmStones = nmLongTons * 157.47;
                    nmShortTons = nmLongTons * 1.1023;

                    kilograms.setText(String.format("%.3f", nmKilograms));
                    ounches.setText(String.format("%.3f", nmOunches));
                    pounds.setText(String.format("%.3f", nmPounds));
                    troy.setText(String.format("%.3f", nmTroy));
                    stones.setText(String.format("%.3f", nmStones));
                    shortTons.setText(String.format("%.3f", nmShortTons));

                } else  {
                    kilograms.setText("");
                    ounches.setText("");
                    pounds.setText("");
                    stones.setText("");
                    troy.setText("");
                    shortTons.setText("");
                    longTons.setText("");
                }
            }
        });

        liters = findViewById(R.id.numLiters);
        fluid = findViewById(R.id.numFluid);
        quarts = findViewById(R.id.numQuarts);
        gallons = findViewById(R.id.numGallons);
        imperial = findViewById(R.id.numImperial);

        calculate3 = findViewById(R.id.calculate3);

        liters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = 1;
            }
        });

        fluid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = 2;
            }
        });

        quarts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = 3;
            }
        });

        gallons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = 4;
            }
        });

        imperial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c = 5;
            }
        });

        calculate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == 1){
                    nmLiters = Double.parseDouble(liters.getText().toString());

                    nmFluid = nmLiters * 33.824;
                    nmQuarts = nmLiters *  1.0570;
                    nmGallons = nmLiters * 0.2642;
                    nmImperial = nmLiters * 0.2200;

                    fluid.setText(String.format("%.3f", nmFluid));
                    quarts.setText(String.format("%.3f", nmQuarts));
                    gallons.setText(String.format("%.3f", nmGallons));
                    imperial.setText(String.format("%.3f", nmImperial));

                } else if (c == 2){
                    nmFluid = Double.parseDouble(fluid.getText().toString());

                    nmLiters = nmFluid * 0.0296;
                    nmQuarts = nmFluid *  0.0312;
                    nmGallons = nmFluid * 0.0078;
                    nmImperial = nmFluid * 0.0065;

                    liters.setText(String.format("%.3f", nmLiters));
                    quarts.setText(String.format("%.3f", nmQuarts));
                    gallons.setText(String.format("%.3f", nmGallons));
                    imperial.setText(String.format("%.3f", nmImperial));

                } else if (c == 3){
                    nmQuarts = Double.parseDouble(quarts.getText().toString());

                    nmLiters = nmQuarts * 0.9461;
                    nmFluid = nmQuarts *  32.000;
                    nmGallons = nmQuarts * 0.2500;
                    nmImperial = nmQuarts * 0.2082;

                    liters.setText(String.format("%.3f", nmLiters));
                    fluid.setText(String.format("%.3f", nmFluid));
                    gallons.setText(String.format("%.3f", nmGallons));
                    imperial.setText(String.format("%.3f", nmImperial));

                } else if (c == 4){
                    nmGallons = Double.parseDouble(gallons.getText().toString());

                    nmLiters = nmGallons * 3.7843;
                    nmFluid = nmGallons *  128.00;
                    nmQuarts = nmGallons * 4.0000;
                    nmImperial = nmGallons * 0.8327;

                    liters.setText(String.format("%.3f", nmLiters));
                    fluid.setText(String.format("%.3f", nmFluid));
                    quarts.setText(String.format("%.3f", nmQuarts));
                    imperial.setText(String.format("%.3f", nmImperial));

                } else if (c == 5){
                    nmImperial = Double.parseDouble(imperial.getText().toString());

                    nmLiters = nmImperial * 4.5446;
                    nmFluid = nmImperial *  153.72;
                    nmQuarts = nmImperial * 4.8036;
                    nmGallons = nmImperial * 1.2009;

                    liters.setText(String.format("%.3f", nmLiters));
                    fluid.setText(String.format("%.3f", nmFluid));
                    quarts.setText(String.format("%.3f", nmQuarts));
                    gallons.setText(String.format("%.3f", nmGallons));

                } else  {
                    liters.setText("");
                    fluid.setText("");
                    quarts.setText("");
                    gallons.setText("");
                    imperial.setText("");
                }
            }
        });
    }

    public void reset1(View v) {
        meters.setText("");
        inches.setText("");
        feet.setText("");
        yards.setText("");
        miles.setText("");
        nautical.setText("");
    }

    public void reset2(View v) {
        kilograms.setText("");
        ounches.setText("");
        pounds.setText("");
        troy.setText("");
        stones.setText("");
        shortTons.setText("");
        longTons.setText("");
    }

    public void reset3(View v) {
        liters.setText("");
        fluid.setText("");
        quarts.setText("");
        gallons.setText("");
        imperial.setText("");
    }
}