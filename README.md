# NightMode


![alt text](https://github.com/datanapps/NightMode/blob/master/screens/screens.jpg)


### Download APK : 

https://github.com/datanapps/NightMode/blob/master/screens/app-debug.apk

## Implement night mode in your application.


#### 1. Create a folder app --> res --> values-night

#### 2. Copy and paste from  colors.xml and styles.xml from values folder

#### 3. Make changes in styles and colors

colors.xml : 

        <?xml version="1.0" encoding="utf-8"?>
        <resources>
            <color name="colorPrimary">#008577</color>
            <color name="colorPrimaryDark">#00574B</color>
            <color name="colorAccent">#D81B60</color>

            <color name="colorWhite">#FFFFFF</color>
            <color name="colorBlack">#000000</color>
        </resources>
        
styles.xml (use DayNight theme Theme.AppCompat.DayNight.DarkActionBar)

          <resources>

              <style name="AppTheme" parent="Theme.AppCompat.DayNight.DarkActionBar">
                  <item name="colorPrimary">@color/colorPrimary</item>
                  <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
                  <item name="colorAccent">@color/colorAccent</item>
                  <item name="android:windowBackground">@color/colorBlack</item>
                  <item name="android:textColorPrimary">@color/colorWhite</item>
                  <item name="android:textColorSecondary">@color/colorWhite</item>
              </style>

          </resources>

   ### 4. Create Application class and add into manifest file. this application class will handle to app scrren
   
   
             public class MyApplication extends Application {

              @Override
              public void onCreate() {
                  super.onCreate();
                  // AppCompatDelegate.MODE_NIGHT_NO,   AppCompatDelegate.MODE_NIGHT_YES, AppCompatDelegate.MODE_NIGHT_AUTO
                  AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
              }
          }

#### 5. To implement special Activity use

  AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
  
  before super().
  
  Example : 
  
          public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {

                // AppCompatDelegate.MODE_NIGHT_NO,   AppCompatDelegate.MODE_NIGHT_YES, AppCompatDelegate.MODE_NIGHT_AUTO
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);


            }
        }



