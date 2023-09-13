import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECS_SmokeController extends ClockDomain{
  public ECS_SmokeController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal detectSmoke = new Signal("detectSmoke", Signal.INPUT);
  public Signal stopAll = new Signal("stopAll", Signal.INPUT);
  public Signal sirenONOFF = new Signal("sirenONOFF", Signal.OUTPUT);
  public output_Channel smokeReady_o = new output_Channel();
  private int S215011 = 1;
  private int S214683 = 1;
  private int S214527 = 1;
  private int S214522 = 1;
  private int S214547 = 1;
  private int S214575 = 1;
  private int S214570 = 1;
  private int S214554 = 1;
  private int S214549 = 1;
  
  private int[] ends = new int[68];
  private int[] tdone = new int[68];
  
  public void thread215299(int [] tdone, int [] ends){
        S214575=1;
    S214570=0;
    S214554=0;
    if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
      smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
      S214554=1;
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
    else {
      S214549=0;
      if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
        smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
        S214549=1;
        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
          ends[67]=2;
          ;//sysj\ECS.sysj line: 433, column: 15
          System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
          S214570=1;
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
      }
      else {
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
      }
    }
  }

  public void thread215298(int [] tdone, int [] ends){
        S214547=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 429, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread215296(int [] tdone, int [] ends){
        switch(S214575){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        switch(S214570){
          case 0 : 
            switch(S214554){
              case 0 : 
                if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
                  smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
                  S214554=1;
                  active[67]=1;
                  ends[67]=1;
                  tdone[67]=1;
                }
                else {
                  switch(S214549){
                    case 0 : 
                      if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
                        smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
                        S214549=1;
                        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
                          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
                          ends[67]=2;
                          ;//sysj\ECS.sysj line: 433, column: 15
                          System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
                          S214570=1;
                          active[67]=1;
                          ends[67]=1;
                          tdone[67]=1;
                        }
                        else {
                          active[67]=1;
                          ends[67]=1;
                          tdone[67]=1;
                        }
                      }
                      else {
                        active[67]=1;
                        ends[67]=1;
                        tdone[67]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
                        smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
                        ends[67]=2;
                        ;//sysj\ECS.sysj line: 433, column: 15
                        System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
                        S214570=1;
                        active[67]=1;
                        ends[67]=1;
                        tdone[67]=1;
                      }
                      else {
                        active[67]=1;
                        ends[67]=1;
                        tdone[67]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S214554=1;
                S214554=0;
                if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
                  smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
                  S214554=1;
                  active[67]=1;
                  ends[67]=1;
                  tdone[67]=1;
                }
                else {
                  S214549=0;
                  if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
                    smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
                    S214549=1;
                    if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
                      smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
                      ends[67]=2;
                      ;//sysj\ECS.sysj line: 433, column: 15
                      System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
                      S214570=1;
                      active[67]=1;
                      ends[67]=1;
                      tdone[67]=1;
                    }
                    else {
                      active[67]=1;
                      ends[67]=1;
                      tdone[67]=1;
                    }
                  }
                  else {
                    active[67]=1;
                    ends[67]=1;
                    tdone[67]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            if(!detectSmoke.getprestatus()){//sysj\ECS.sysj line: 435, column: 21
              smokeReady_o.setPreempted();//sysj\ECS.sysj line: 436, column: 15
              ends[67]=2;
              tdone[67]=1;
            }
            else {
              active[67]=1;
              ends[67]=1;
              tdone[67]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread215295(int [] tdone, int [] ends){
        switch(S214547){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        sirenONOFF.setPresent();//sysj\ECS.sysj line: 429, column: 15
        currsigs.addElement(sirenONOFF);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread215293(int [] tdone, int [] ends){
        S214575=1;
    S214570=0;
    S214554=0;
    if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
      smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
      S214554=1;
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
    else {
      S214549=0;
      if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
        smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
        S214549=1;
        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
          ends[67]=2;
          ;//sysj\ECS.sysj line: 433, column: 15
          System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
          S214570=1;
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
      }
      else {
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
      }
    }
  }

  public void thread215292(int [] tdone, int [] ends){
        S214547=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 429, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread215290(int [] tdone, int [] ends){
        S214575=1;
    S214570=0;
    S214554=0;
    if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
      smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
      S214554=1;
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
    else {
      S214549=0;
      if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
        smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
        S214549=1;
        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
          ends[67]=2;
          ;//sysj\ECS.sysj line: 433, column: 15
          System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
          S214570=1;
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
      }
      else {
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
      }
    }
  }

  public void thread215289(int [] tdone, int [] ends){
        S214547=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 429, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread215287(int [] tdone, int [] ends){
        S214575=1;
    S214570=0;
    S214554=0;
    if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
      smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
      S214554=1;
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
    else {
      S214549=0;
      if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
        smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
        S214549=1;
        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
          ends[67]=2;
          ;//sysj\ECS.sysj line: 433, column: 15
          System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
          S214570=1;
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
      }
      else {
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
      }
    }
  }

  public void thread215286(int [] tdone, int [] ends){
        S214547=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 429, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread215284(int [] tdone, int [] ends){
        S214575=1;
    S214570=0;
    S214554=0;
    if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 433, column: 15
      smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
      S214554=1;
      active[67]=1;
      ends[67]=1;
      tdone[67]=1;
    }
    else {
      S214549=0;
      if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
        smokeReady_o.setVal(Boolean.FALSE);//sysj\ECS.sysj line: 433, column: 15
        S214549=1;
        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 433, column: 15
          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 433, column: 15
          ends[67]=2;
          ;//sysj\ECS.sysj line: 433, column: 15
          System.out.println("Fire Alert - Please Exit The Building");//sysj\ECS.sysj line: 434, column: 15
          S214570=1;
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
        else {
          active[67]=1;
          ends[67]=1;
          tdone[67]=1;
        }
      }
      else {
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
      }
    }
  }

  public void thread215283(int [] tdone, int [] ends){
        S214547=1;
    sirenONOFF.setPresent();//sysj\ECS.sysj line: 429, column: 15
    currsigs.addElement(sirenONOFF);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S215011){
        case 0 : 
          S215011=0;
          break RUN;
        
        case 1 : 
          S215011=2;
          S215011=2;
          S214683=0;
          S214527=0;
          if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 423, column: 3
            smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
            S214527=1;
            active[65]=1;
            ends[65]=1;
            break RUN;
          }
          else {
            S214522=0;
            if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
              smokeReady_o.setVal(Boolean.TRUE);//sysj\ECS.sysj line: 423, column: 3
              S214522=1;
              if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                ends[65]=2;
                ;//sysj\ECS.sysj line: 423, column: 3
                S214683=1;
                if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 425, column: 11
                  thread215283(tdone,ends);
                  thread215284(tdone,ends);
                  int biggest215285 = 0;
                  if(ends[66]>=biggest215285){
                    biggest215285=ends[66];
                  }
                  if(ends[67]>=biggest215285){
                    biggest215285=ends[67];
                  }
                  if(biggest215285 == 1){
                    active[65]=1;
                    ends[65]=1;
                    break RUN;
                  }
                }
                else {
                  S214683=2;
                  active[65]=1;
                  ends[65]=1;
                  break RUN;
                }
              }
              else {
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            }
            else {
              active[65]=1;
              ends[65]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S214683){
            case 0 : 
              switch(S214527){
                case 0 : 
                  if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 423, column: 3
                    smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                    S214527=1;
                    active[65]=1;
                    ends[65]=1;
                    break RUN;
                  }
                  else {
                    switch(S214522){
                      case 0 : 
                        if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                          smokeReady_o.setVal(Boolean.TRUE);//sysj\ECS.sysj line: 423, column: 3
                          S214522=1;
                          if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                            smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                            ends[65]=2;
                            ;//sysj\ECS.sysj line: 423, column: 3
                            S214683=1;
                            if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 425, column: 11
                              thread215286(tdone,ends);
                              thread215287(tdone,ends);
                              int biggest215288 = 0;
                              if(ends[66]>=biggest215288){
                                biggest215288=ends[66];
                              }
                              if(ends[67]>=biggest215288){
                                biggest215288=ends[67];
                              }
                              if(biggest215288 == 1){
                                active[65]=1;
                                ends[65]=1;
                                break RUN;
                              }
                            }
                            else {
                              S214683=2;
                              active[65]=1;
                              ends[65]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[65]=1;
                            ends[65]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[65]=1;
                          ends[65]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                          smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                          ends[65]=2;
                          ;//sysj\ECS.sysj line: 423, column: 3
                          S214683=1;
                          if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 425, column: 11
                            thread215289(tdone,ends);
                            thread215290(tdone,ends);
                            int biggest215291 = 0;
                            if(ends[66]>=biggest215291){
                              biggest215291=ends[66];
                            }
                            if(ends[67]>=biggest215291){
                              biggest215291=ends[67];
                            }
                            if(biggest215291 == 1){
                              active[65]=1;
                              ends[65]=1;
                              break RUN;
                            }
                          }
                          else {
                            S214683=2;
                            active[65]=1;
                            ends[65]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[65]=1;
                          ends[65]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S214527=1;
                  S214527=0;
                  if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 423, column: 3
                    smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                    S214527=1;
                    active[65]=1;
                    ends[65]=1;
                    break RUN;
                  }
                  else {
                    S214522=0;
                    if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                      smokeReady_o.setVal(Boolean.TRUE);//sysj\ECS.sysj line: 423, column: 3
                      S214522=1;
                      if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                        smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                        ends[65]=2;
                        ;//sysj\ECS.sysj line: 423, column: 3
                        S214683=1;
                        if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 425, column: 11
                          thread215292(tdone,ends);
                          thread215293(tdone,ends);
                          int biggest215294 = 0;
                          if(ends[66]>=biggest215294){
                            biggest215294=ends[66];
                          }
                          if(ends[67]>=biggest215294){
                            biggest215294=ends[67];
                          }
                          if(biggest215294 == 1){
                            active[65]=1;
                            ends[65]=1;
                            break RUN;
                          }
                        }
                        else {
                          S214683=2;
                          active[65]=1;
                          ends[65]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[65]=1;
                        ends[65]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[65]=1;
                      ends[65]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread215295(tdone,ends);
              thread215296(tdone,ends);
              int biggest215297 = 0;
              if(ends[66]>=biggest215297){
                biggest215297=ends[66];
              }
              if(ends[67]>=biggest215297){
                biggest215297=ends[67];
              }
              if(biggest215297 == 1){
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              if(biggest215297 == 2){
                ends[65]=2;
                ;//sysj\ECS.sysj line: 427, column: 7
                S214683=2;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              //FINXME code
              if(biggest215297 == 0){
                S214683=2;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
            
            case 2 : 
              S214683=2;
              S214683=0;
              S214527=0;
              if(!smokeReady_o.isPartnerPresent() || smokeReady_o.isPartnerPreempted()){//sysj\ECS.sysj line: 423, column: 3
                smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                S214527=1;
                active[65]=1;
                ends[65]=1;
                break RUN;
              }
              else {
                S214522=0;
                if(smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                  smokeReady_o.setVal(Boolean.TRUE);//sysj\ECS.sysj line: 423, column: 3
                  S214522=1;
                  if(!smokeReady_o.isACK()){//sysj\ECS.sysj line: 423, column: 3
                    smokeReady_o.setREQ(false);//sysj\ECS.sysj line: 423, column: 3
                    ends[65]=2;
                    ;//sysj\ECS.sysj line: 423, column: 3
                    S214683=1;
                    if(detectSmoke.getprestatus()){//sysj\ECS.sysj line: 425, column: 11
                      thread215298(tdone,ends);
                      thread215299(tdone,ends);
                      int biggest215300 = 0;
                      if(ends[66]>=biggest215300){
                        biggest215300=ends[66];
                      }
                      if(ends[67]>=biggest215300){
                        biggest215300=ends[67];
                      }
                      if(biggest215300 == 1){
                        active[65]=1;
                        ends[65]=1;
                        break RUN;
                      }
                    }
                    else {
                      S214683=2;
                      active[65]=1;
                      ends[65]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[65]=1;
                    ends[65]=1;
                    break RUN;
                  }
                }
                else {
                  active[65]=1;
                  ends[65]=1;
                  break RUN;
                }
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[65] != 0){
      int index = 65;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[65]!=0 || suspended[65]!=0 || active[65]!=1);
      else{
        if(!df){
          smokeReady_o.gethook();
          detectSmoke.gethook();
          stopAll.gethook();
          df = true;
        }
        runClockDomain();
      }
      detectSmoke.setpreclear();
      stopAll.setpreclear();
      sirenONOFF.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = detectSmoke.getStatus() ? detectSmoke.setprepresent() : detectSmoke.setpreclear();
      detectSmoke.setpreval(detectSmoke.getValue());
      detectSmoke.setClear();
      dummyint = stopAll.getStatus() ? stopAll.setprepresent() : stopAll.setpreclear();
      stopAll.setpreval(stopAll.getValue());
      stopAll.setClear();
      sirenONOFF.sethook();
      sirenONOFF.setClear();
      smokeReady_o.sethook();
      if(paused[65]!=0 || suspended[65]!=0 || active[65]!=1);
      else{
        smokeReady_o.gethook();
        detectSmoke.gethook();
        stopAll.gethook();
      }
      runFinisher();
      if(active[65] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
