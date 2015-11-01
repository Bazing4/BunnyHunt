/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bunnyhunt;

/**
 *
 * @author Marco
 */
public class Bunny extends Animal {

    public Bunny(Model model, int row, int column) {
        super(model, row, column);
    }
    
    @Override
    int decideMove() {
        
        return random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
    }
}