import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends SkyWorld
{
    private Score theScore;
    private Lives theLives;
    private SLives theSLives;
    private Killed theKilled;
    private RHealth theRHealth;
    private SHealth theSHealth;
    private PHealth thePHealth;
    private int timer = 0;
    private int planespawn = 0;
    public ScreenStateManager screenManager;
    
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space(ScreenStateManager ssMan)
    {    
        // Create a new world with 1000x600 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        screenManager = ssMan;
        addObject(new Rocket(),400,300);
        
        theScore = new Score();
        addObject(theScore, 800, 30);
        
        theLives = new Lives();
        addObject(theLives, 65, 570);
        
        theKilled = new Killed();
        addObject(theKilled, 65, 30);
        
        theRHealth = new RHealth();
        addObject(theRHealth, 300, 570);
        
        theSLives = new SLives();
        theSHealth = new SHealth();
        
        //System.out.println("in Space Constructor : " + super.getWorld());
        //System.out.println("in Space Constructor : " + this.getWorld());
        /**Two-Player Commands*/
        /**
        addObject(theSHealth, 600, 570);
        addObject(theSLives, 970, 570);
        addObject(new Ship(),600,300);
        */
        
        setPaintOrder(GameOverScreen.class, Rocket.class, Score.class, RHealth.class, SHealth.class, Lives.class, SLives.class, PHealth.class, Killed.class);
    }
    
    public ScreenStateManager getScreenStateManager(){
        System.out.println("getState : " + screenManager);
        //return super.getScreenStateManager();
        return screenManager;
    }
    
    public Score getScore()
    {
        return theScore;
    }
    
    public Lives getLives()
    {
        return theLives;
    }
    
    public SLives getSLives()
    {
        return theSLives;
    }
    
    public Killed getKilled()
    {
        return theKilled;
    }
    
    public RHealth getRHealth()
    {
        return theRHealth;
    }

    public SHealth getSHealth()
    {
        return theSHealth;
    }
    
    public PHealth getPHealth()
    {
        return thePHealth;
    }
    
    public void act()
    {
        timer++;
        planespawn++;
        
        
        //divya added start---------------------------------------------
        int selectedEnemy = 0;
        EnemyFactory enemy = new EnemyFactory();
        EnemyClass enemyClass = null;
        if ( !this.getObjects(GameOverScreen.class).isEmpty() ) return;
        if(timer>=100)
        {
             selectedEnemy = Greenfoot.getRandomNumber(40);
            if (selectedEnemy==0)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }
        
        if(timer>=500)
        {
            selectedEnemy = Greenfoot.getRandomNumber(80);
            if (selectedEnemy==1)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }
        
        if(timer>=500)
        {
            selectedEnemy = Greenfoot.getRandomNumber(80);
            if (selectedEnemy==2)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }
        
         if(timer>=1000)
        {
            selectedEnemy = Greenfoot.getRandomNumber(140);
            if (selectedEnemy==3)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }
        
        if(timer>=1000)
        {
            selectedEnemy = Greenfoot.getRandomNumber(240);
            if (selectedEnemy==4)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }
        
        if(timer>=1500)
        {
            selectedEnemy = Greenfoot.getRandomNumber(300);
             if (selectedEnemy==5)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }
                
        
       /*8 if(timer>=1000)
        {
            selectedEnemy = Greenfoot.getRandomNumber(1500);
            if (selectedEnemy==6)
            {
                enemyClass = enemy.makeEnemyFactory(selectedEnemy);
                addObject(enemyClass, (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));
            }
        }*/
        
       /* if (timer>=100)
        {if (Greenfoot.getRandomNumber(100)<5)
        {addObject(new Enemy(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        }
        
        if (timer>=2500)
        {if (Greenfoot.getRandomNumber(1500)==1)
        {addObject(new Lady(), 500, 300);}
        }
        
        if (timer>=1000)
        {if (Greenfoot.getRandomNumber(700)<5)
        {addObject(new Bee(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        }
        
        if (timer>=2000)
        {if (Greenfoot.getRandomNumber(1500)<5)
        {addObject(new Spider(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        }
        
        if (timer>=500)
        {if (Greenfoot.getRandomNumber(4000)<15)
        {addObject(new Rock(), 3, (Greenfoot.getRandomNumber(600)));}
        }
        
        if (timer>=500)
        {if (Greenfoot.getRandomNumber(4000)<15)
        {addObject(new Rock2(), 997, (Greenfoot.getRandomNumber(600)));}
        }
        
        if (timer>=1500)
        {if (Greenfoot.getRandomNumber(1200)<5)
        {addObject(new Fly(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        }
        
        if (timer>=100)
        {if (Greenfoot.getRandomNumber(2500)==1)
        {addObject(new Baby(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        }
        */
        if (timer>=100)
        {if (Greenfoot.getRandomNumber(5000)==1)
        {addObject(new Life(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        }
        
        if (Greenfoot.getRandomNumber(2000)==1)
        {addObject(new Heart(), (Greenfoot.getRandomNumber(1000)), (Greenfoot.getRandomNumber(600)));}
        
      /* if (planespawn>=5000)
        {
            addObject (new Plane(), 50, 550);
            thePHealth = new PHealth();
            addObject(thePHealth, 970, 30);
            planespawn=0;
        }*/
    }
}
