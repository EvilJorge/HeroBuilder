package com.example.android.herobuilder;

/**
 * Created by cpalomares on 12/13/2017.
 */

public class PFCharacter {
    // Base character information
    private String name;
    private String race;
    private String charClass;

    // Ability Scores
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // Constructors
    public PFCharacter(){
        name = "Bob";
        race = "dwarf";
        charClass = "fighter";

        // Initialize Ability Scores to 10;
        strength = 10;
        dexterity = 10;
        constitution = 10;
        intelligence = 10;
        wisdom = 10;
        charisma = 10;
    }

    // Accessor Methods
    public String Name(){
        return name;
    }

    public void Name(String newName){
        name = newName;
    }

    public String Race(){
        return race;
    }

    public void Race(String newRace){
        race = newRace;
    }

    public String CharClass(){
        return charClass;
    }

    public void CharClass(String newClass){
        charClass = newClass;
    }

    public int AbilityScore(String abilityName){
        int abilityValue = 0;

        switch(abilityName){
            case "strength":
                abilityValue = strength;
                break;
            case "dexterity":
                abilityValue = dexterity;
                break;
            case "constitution":
                abilityValue = constitution;
                break;
            case "intelligence":
                abilityValue = intelligence;
                break;
            case "wisdom":
                abilityValue = wisdom;
                break;
            case "charisma":
                abilityValue = charisma;
                break;
            default:
                throw new IllegalArgumentException("Invalid ability name: " + abilityName);
        }
        return abilityValue;
    }

    public void incrementAbility(String abilityName){
        switch(abilityName){
            case "strength":
                strength++;
                break;
            case "dexterity":
                dexterity++;
                break;
            case "constitution":
                constitution++;
                break;
            case "intelligence":
                intelligence++;
                break;
            case "wisdom":
                wisdom++;
                break;
            case "charisma":
                charisma++;
                break;
            default:
                throw new IllegalArgumentException("Invalid ability name: " + abilityName);
        }
    }

    public void decrementAbility(String abilityName){
        switch(abilityName){
            case "strength":
                strength--;
                break;
            case "dexterity":
                dexterity--;
                break;
            case "constitution":
                constitution--;
                break;
            case "intelligence":
                intelligence--;
                break;
            case "wisdom":
                wisdom--;
                break;
            case "charisma":
                charisma--;
                break;
            default:
                throw new IllegalArgumentException("Invalid ability name: " + abilityName);
        }
    }

    public int AbilityBonus(String abilityName){
        int abilityValue = 0;

        switch(abilityName){
            case "strength":
                abilityValue = strength;
                break;
            case "dexterity":
                abilityValue = dexterity;
                break;
            case "constitution":
                abilityValue = constitution;
                break;
            case "intelligence":
                abilityValue = intelligence;
                break;
            case "wisdom":
                abilityValue = wisdom;
                break;
            case "charisma":
                abilityValue = charisma;
                break;
            default:
                throw new IllegalArgumentException("Invalid ability name: " + abilityName);
        }
        if(abilityValue < 10){
            return (abilityValue - 11) / 2;
        } else {
            return (abilityValue - 10) / 2;
        }
    }
}
