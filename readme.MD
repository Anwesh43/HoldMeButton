#HoldMeButton

##An android library to create an button which will be animated once you hold the button and the action will shoot when the animation is done.

##Usage

###In activity file
```
  HoldMeButton holdMeButton = new HoldMeButton(this,"text",width,height)
```

###Adding action listener in activity file.

```
  holdMeButton.setOnClickListener(new Button.OnClickListener(){
      public void onClick(View view) {
          ...//your action goes here
      }
  })
```
### In xml file
```
<com.anwesome.uiview.holdmebutton.HoldMeButtonView
      android:layout_width="200dp"
      android:layout_height="200dp"
      android:id="@+id/button"
      android:text="buttontext"/>
```

### Adding onClick Listener

```
  HoldMeButtonView button = (HoldMeButtonView)findViewById(R.id.button);
  button.setOnClickListener(new Button.OnClickListener(){
      public void onClick(View view) {
          ...//onClick code goes here
      }
  });
```
