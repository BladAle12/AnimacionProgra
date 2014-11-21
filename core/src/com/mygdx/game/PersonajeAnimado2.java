package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PersonajeAnimado2 extends Actor {
	
	ArrayList<Image> imagenes;
	int dibujo_actual =0; 
	float tiempo_act =0;
	public PersonajeAnimado2(){
		imagenes = new ArrayList<Image>();
		imagenes.add(new Image(new Texture("Endless Run/explosion_1.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_2.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_3.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_4.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_5.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_6.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_7.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_8.png")));
		imagenes.add(new Image(new Texture("Endless Run/explosion_9.png")));
		
		
	}
	
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		
		tiempo_act+=delta;
		
		if(tiempo_act >0.5f){
			dibujo_actual++;
			tiempo_act=0;
		}
		
		
		if(dibujo_actual >= imagenes.size()){
			dibujo_actual=0;
		}
		
		//this.setX(this.getX()+3);
	}
	
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		imagenes.get(dibujo_actual).setX(320);
		imagenes.get(dibujo_actual).setY(250);
		//imagenes.get(dibujo_actual).setX(this.getX());
		imagenes.get(dibujo_actual).draw(batch, parentAlpha);
	}
	
	

}

