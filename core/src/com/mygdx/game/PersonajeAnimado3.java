package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PersonajeAnimado3 extends Actor {
	
	ArrayList<Image> imagenes;
	int dibujo_actual =0; 
	float tiempo_act =0;
	public PersonajeAnimado3(){
		imagenes = new ArrayList<Image>();
		imagenes.add(new Image(new Texture("Endless Run/run01.png")));
		imagenes.add(new Image(new Texture("Endless Run/run02.png")));
		imagenes.add(new Image(new Texture("Endless Run/run03.png")));
		imagenes.add(new Image(new Texture("Endless Run/run04.png")));
		imagenes.add(new Image(new Texture("Endless Run/jump.png")));
	}
	
	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		
		tiempo_act+=delta;
		
		if(tiempo_act >0.1f){
			dibujo_actual++;
			tiempo_act=0;
		}
		
		
		if(dibujo_actual >= imagenes.size()){
			dibujo_actual=0;
		}
		this.setX(this.getX()+1);
		}
		
		@Override
		public void draw(Batch batch, float parentAlpha) {
			// TODO Auto-generated method stub
			super.draw(batch, parentAlpha);
			imagenes.get(dibujo_actual).setX(50);
			imagenes.get(dibujo_actual).setY(50);
			imagenes.get(dibujo_actual).setX(this.getX());
			imagenes.get(dibujo_actual).draw(batch, parentAlpha);
		}
		
		

	}

