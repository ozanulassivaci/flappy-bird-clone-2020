package com.flappybirdclone.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
public class FlappyBirdGame extends ApplicationAdapter {
	Music music = Gdx.audio.newMusic(Gdx.files.internal("background_music.mp3"));
	SpriteBatch batch;
	Texture background;
	Texture bird;
	float birdX = 0;
	float birdY = 0;
	// 0 = waiting for the first tap on the start screen, 1 = playing
	int gameState = 0;
	float velocity = 0;
	float gravity = 0.3f;


	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("background.png");
		bird = new Texture("bird.png");

		birdX = Gdx.graphics.getWidth()/3 -2*(bird.getWidth());
		birdY = Gdx.graphics.getHeight()/3;


	}

	@Override
	public void render () {

		if(gameState == 1){

			if(Gdx.input.justTouched()){
				velocity = -6;
			}


			if(birdY>0 || velocity<0){
				velocity = velocity + gravity;
				birdY = birdY - velocity;

			}

		}else{
			if (Gdx.input.justTouched()){
				gameState = 1;
			}
		}


		batch.begin();
		batch.draw(background,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
		batch.draw(bird,birdX,birdY,Gdx.graphics.getWidth()/14,Gdx.graphics.getHeight()/7);
		batch.end();

	}
	
	@Override
	public void dispose () {

	}
}
