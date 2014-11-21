package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Animacion implements ApplicationListener, InputProcessor {
	Music music;
	SpriteBatch batch;
    Texture texture;
    Sprite sprite;
    float posX, posY;
    Texture img1, img3, img4,img5;
	
	Texture img;
	Stage stage;
    
    @Override
    public void create() {   
    	
    	batch = new SpriteBatch();
		img1 = new Texture("Block.png");
		img3 = new Texture("cloud1.png");
		img4 = new Texture("cactus.png");
		img5 = new Texture("Endless Run/mountains.png");
		
		music = Gdx.audio.newMusic(Gdx.files.getFileHandle("musica.mp3", FileType.Internal));
		music.setLooping(true);
		music.play();
		
		stage = new Stage();
		stage.addActor(new PersonajeAnimado());
		stage.addActor(new PersonajeAnimado2());
		stage.addActor(new PersonajeAnimado3());
		stage.addActor(new PersonajeAnimado4());
		stage.addActor(new PersonajeAnimado5());
		Gdx.input.setInputProcessor(stage);
		
        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();
        batch = new SpriteBatch();
        
        texture = new Texture(Gdx.files.internal("Endless Run/vol.png"));
        sprite = new Sprite(texture);
        posX = w/2 - sprite.getWidth()/2;
        posY = h/2 - sprite.getHeight()/2;
        sprite.setPosition(posX,posY);
        
        Gdx.input.setInputProcessor(this);
        

    }

    @Override
    public void dispose() {
        batch.dispose();
        texture.dispose();
    }

    @Override
    public void render() {        
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        
    
        
        sprite.setPosition(posX,posY);
        batch.begin();
        batch.draw(img5,0,50);
        batch.draw(img1, 0,0);
        batch.draw(img1, 50,0);
        batch.draw(img1, 100,0);
        batch.draw(img1, 150,0);
        batch.draw(img1, 200,0);
        batch.draw(img1, 250,0);
        batch.draw(img1, 300,0);
        batch.draw(img1, 350,0);
        batch.draw(img1, 400,0);
        batch.draw(img1, 450,0);
        batch.draw(img1, 500,0);
        batch.draw(img1, 560,0);
		batch.draw(img3, 300,250);
		batch.draw(img4, 172,50);
		
	    sprite.draw(batch);
        batch.end();
        stage.draw();
    	
    		stage.act();
	
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public boolean keyDown(int keycode) {
        float moveAmount = 1.0f;
        if(Gdx.input.isKeyPressed(Keys.CONTROL_LEFT))
            moveAmount = 10.0f;
        
        if(keycode == Keys.LEFT)
            posX-=moveAmount;
        if(keycode == Keys.RIGHT)
            posX+=moveAmount;
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if(button == Buttons.LEFT){
            posX = screenX - sprite.getWidth()/2;
            posY = Gdx.graphics.getHeight() - screenY - sprite.getHeight()/2;
        }
        if(button == Buttons.RIGHT){
            posX = Gdx.graphics.getWidth()/2 - sprite.getWidth()/2;
            posY = Gdx.graphics.getHeight()/2 - sprite.getHeight()/2;
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}