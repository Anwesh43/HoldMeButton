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
