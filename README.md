# Flappy Bird Clone (2020)

A minimal Flappy Bird-style prototype for Android, built with LibGDX.

## Features

- Tap-to-start screen; tap again to make the bird flap
- Gravity-based falling motion with a fixed flap impulse
- Custom background and bird sprite rendered with a `SpriteBatch`

This is a small, single-screen prototype rather than a complete game: there
are no pipes/obstacles, no collision detection, no scoring, and no
game-over state. It demonstrates the core loop a Flappy Bird clone is built
on (touch input driving a simple gravity simulation), not the full game.

## Tech stack

- Java 7
- [LibGDX](https://libgdx.com/) 1.9.11 (`gdx`, `gdx-box2d`, `gdx-backend-android`)
- Gradle (Android Gradle Plugin 4.0.1)
- Android SDK, `minSdkVersion` 14, `compileSdkVersion`/`targetSdkVersion` 30

## Installation

Requirements: Android Studio (or the command-line Android SDK), JDK 8, an
Android device or emulator.

```bash
git clone https://github.com/<your-username>/flappy-bird-clone-2020.git
cd flappy-bird-clone-2020
```

Open the project root in Android Studio and let Gradle sync, or build from
the command line:

```bash
./gradlew :android:assembleDebug
```

## Usage

Install and launch on a connected device/emulator:

```bash
./gradlew :android:installDebug
```

Tap anywhere on the screen to start, then keep tapping to keep the bird
airborne. The screen is locked to landscape orientation.

## Project structure

```
core/    Platform-independent game logic (FlappyBirdGame.java)
android/ Android application module, launcher activity, assets, resources
```

## Limitations

- No obstacles, collision detection, scoring, or game-over state
- Background music is loaded at startup but never played back — a leftover,
  unfinished feature from the original code
- Landscape orientation only, single activity, no settings/menu screens
- No automated tests

## History

This project was a simple self-study exercise I built in high school (2020)
to develop my computer/programming skills through courses I was taking at
the time. It was reorganized and cleaned up in 2026 for public release
(English naming throughout, dead code and unused files removed, package
structure updated) without changing the original game logic.

> TODO: add the course/resource that inspired this project

## License

MIT — see [LICENSE](LICENSE).
