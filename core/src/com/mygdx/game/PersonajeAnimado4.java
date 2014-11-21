package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class PersonajeAnimado4 extends Actor {
	
	ArrayList<Image> imagenes;
	int dibujo_actual =0; 
	float tiempo_act =0;
	public PersonajeAnimado4(){
		imagenes = new ArrayList<Image>();
		imagenes.add(new Image(new Texture("p1/p1_walk00.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk01.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk02.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk04.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk05.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk06.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk07.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk08.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk09.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk10.png")));
		imagenes.add(new Image(new Texture("p1/p1_walk11.png")));
		
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
		this.setX(this.getX()+2);
		
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

