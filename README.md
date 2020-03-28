<img src="https://i.imgur.com/m8q4JAB.png"/>

# gwt-material-motion
Google Design Motion implementation on GMD

## Work in Progress
Still in Prototyping phase.

## Cheatsheet
Material Motion.

Requirements 
1. Usage of Core & Material Transitions.
2. Path Animator
3. Add new TransformAnimation

Patterns:
1. Container Transform (Path Animation)
	- Creates visible connection between 2 UI Elements
	- Examples - Element to Full View
      - Fab -> Sheet
      - ListItem -> DetailPage
      - Card -> DetailPage
      - SearchBar -> Expanded Search
	- Examples - Element to Element (Not Full View) 
      - Fab -> Menu
      - Fab -> Media Player
      - Fab -> Sheet
      - Chip -> Expanded Chip
      <img src="https://github.com/flutter/packages/raw/master/packages/animations/example/demo_gifs/container_transform_lineup.gif" />
2. Shared Axis
    - Navigation Relationship between UI Elements
    - Onboarding and Steppers
    - This pattern uses a shared transformation on the x, y, or z axis to reinforce the relationship between elements.
      - Horizontal
      - Vertical
      - Z Axis (Forward -> Backward)
      <img src="https://github.com/flutter/packages/raw/master/packages/animations/example/demo_gifs/shared_axis_lineup.gif"/>
3. Fade Through	
    - UI elements that do not have a strong relationship
	- If no relation between UI Elements.
	- Destinations on Bottom Navigation and Sidenavs
      - Tapping Destinations in a bottom navigation bar
      - Tapping a refresh icon
      - Tapping an account switcher
      <img src="https://github.com/flutter/packages/raw/master/packages/animations/example/demo_gifs/fade_through_lineup.gif"/>
4. Fade
	- If UI Element simply needs to enter or exit the screen
      - Dialog
      - Menu
      - Snackbar
      - FAB
      <img src="https://github.com/flutter/packages/raw/master/packages/animations/example/demo_gifs/fade_lineup.gif"/>

## Reference

https://material.io/design/motion/the-motion-system.html

https://material.io/design/motion/customization.html

https://material.io/develop/android/theming/motion/
