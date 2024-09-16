public class DnDSorcerer implements DnDCharacter{


    private int health;
    private final int maxHealth;
    private int levelOneSpellSlots, levelTwoSpellSlots,levelThreeSpellSlots, levelFourSpellSlots, levelFiveSpellSlots, levelSixSpellSlots, levelSevenSpellSlots, levelEightSpellSlots, levelNineSpellSlots;
    private final int maxLevelOneSpellSlots, maxLevelTwoSpellSlots,maxLevelThreeSpellSlots, maxLevelFourSpellSlots, maxLevelFiveSpellSlots, maxLevelSixSpellSlots, maxLevelSevenSpellSlots, maxLevelEightSpellSlots, maxLevelNineSpellSlots;
    private int sorceryPoints;
    private final int maxSorceryPoints;

    DnDSorcerer(int m_health, int m_SorceryPoints, int m_levelOneSpellSlots, int m_levelTwoSpellSlots, int m_levelThreeSpellSlots, int m_levelFourSpellSlots, int m_levelFiveSpellSlots, int m_levelSixSpellSlots, int m_levelSevenSpellSlots, int m_levelEightSpellSlots, int m_levelNineSpellSlots) {
        this.maxHealth = m_health;
        this.health = this.maxHealth;

        this.maxSorceryPoints = m_SorceryPoints;
        this.sorceryPoints = m_SorceryPoints;

        this.maxLevelOneSpellSlots = m_levelOneSpellSlots;
        this.levelOneSpellSlots = m_levelOneSpellSlots;

        this.maxLevelTwoSpellSlots = m_levelTwoSpellSlots;
        this.levelTwoSpellSlots = m_levelTwoSpellSlots;

        this.maxLevelThreeSpellSlots = m_levelThreeSpellSlots;
        this.levelThreeSpellSlots = m_levelThreeSpellSlots;

        this.maxLevelFourSpellSlots = m_levelFourSpellSlots;
        this.levelFourSpellSlots = m_levelFourSpellSlots;

        this.maxLevelFiveSpellSlots = m_levelFiveSpellSlots;
        this.levelFiveSpellSlots = m_levelFiveSpellSlots;

        this.maxLevelSixSpellSlots = m_levelSixSpellSlots;
        this.levelSixSpellSlots = m_levelSixSpellSlots;

        this.maxLevelSevenSpellSlots = m_levelEightSpellSlots;
        this.levelSevenSpellSlots = m_levelSevenSpellSlots;

        this.maxLevelEightSpellSlots = m_levelEightSpellSlots;
        this.levelEightSpellSlots = m_levelEightSpellSlots;

        this.maxLevelNineSpellSlots = m_levelNineSpellSlots;
        this.levelNineSpellSlots = m_levelNineSpellSlots;

    }

    @Override
    public void longRest() {

        health = maxHealth;
        sorceryPoints = maxSorceryPoints;
        levelOneSpellSlots = maxLevelOneSpellSlots;
        levelTwoSpellSlots = maxLevelTwoSpellSlots;
        levelThreeSpellSlots = maxLevelThreeSpellSlots;
        levelFourSpellSlots = maxLevelFourSpellSlots;
        levelFiveSpellSlots = maxLevelFiveSpellSlots;
        levelSixSpellSlots = maxLevelSixSpellSlots;
        levelSevenSpellSlots = maxLevelSevenSpellSlots;
        levelEightSpellSlots = maxLevelEightSpellSlots;
        levelNineSpellSlots = maxLevelNineSpellSlots;

    }

    @Override
    public void shortRest() {
        health = maxHealth;
    }

    @Override
    public void reduceHealth(int healthLoss) {
        this.health -= healthLoss;
    }

    @Override
    public void addHealth(int healthGain) {
        this.health += healthGain;
    }

    @Override
    public void setHealth(int m_health) {
        this.health = m_health;
    }

    @Override
    public void getHealth() {
        System.out.println("\nCurrent Health: " + health);
    }

    @Override
    public void useSorceryPoints(int number) {
        this.sorceryPoints -= number;
    }

    @Override
    public void setSorceryPoints(int number) {
        this.sorceryPoints = number;
    }

    @Override
    public void getSorceryPoints() {
        System.out.println("\nCurrent Sorcery Points: " + sorceryPoints);
    }


    @Override
    public void useSpellSlot(int level, int number) {
        switch (level) {

            case 1 -> {levelOneSpellSlots -= number;}
            case 2 -> {levelTwoSpellSlots -= number;}
            case 3 -> {levelThreeSpellSlots -= number;}
            case 4 -> {levelFourSpellSlots -= number;}
            case 5 -> {levelFiveSpellSlots -= number;}
            case 6 -> {levelSixSpellSlots -= number;}
            case 7 -> {levelSevenSpellSlots -= number;}
            case 8 -> {levelEightSpellSlots -= number;}
            case 9 -> {levelNineSpellSlots -= number;}

        }

        System.out.println("Used " + number + " level " + level + " spell slot");
    }

    @Override
    public void setSpellSlot(int level, int number) {
        switch (level) {
            case 1 -> {
                levelOneSpellSlots = number;
            }
            case 2 -> {
                levelTwoSpellSlots = number;
            }
            case 3 -> {
                levelThreeSpellSlots = number;
            }
            case 4 -> {
                levelFourSpellSlots = number;
            }
            case 5 -> {
                levelFiveSpellSlots = number;
            }
            case 6 -> {
                levelSixSpellSlots = number;
            }
            case 7 -> {
                levelSevenSpellSlots = number;
            }
            case 8 -> {
                levelEightSpellSlots = number;
            }
            case 9 -> {
                levelNineSpellSlots = number;
            }
        }
    }

    @Override
    public void getSpellSlots() {

        if (maxLevelOneSpellSlots != 0) {System.out.println("\nLevel 1 spell slots: " + levelOneSpellSlots);}
        if (maxLevelTwoSpellSlots != 0) {System.out.println("Level 2 spell slots: " + levelTwoSpellSlots);}
        if(maxLevelThreeSpellSlots != 0) {System.out.println("Level 3 spell slots: " + levelThreeSpellSlots);}
        if(maxLevelFourSpellSlots != 0)  {System.out.println("Level 4 spell slots: " + levelFourSpellSlots);}
        if(maxLevelFiveSpellSlots != 0) {System.out.println("Level 5 spell slots: " + levelFiveSpellSlots);}
        if(maxLevelSixSpellSlots != 0) {System.out.println("Level 6 spell slots: " + levelSixSpellSlots);}
        if(maxLevelSevenSpellSlots != 0) {System.out.println("Level 7 spell slots: " + levelSevenSpellSlots);}
        if(maxLevelEightSpellSlots != 0) {System.out.println("Level 8 spell slots: " + levelEightSpellSlots);}
        if(maxLevelNineSpellSlots != 0) {System.out.println("Level 9 spell slots: " + levelNineSpellSlots);}
    }

    @Override
    public void getInfo() {

        getHealth();
        getSorceryPoints();
        getSpellSlots();
    }

}
