import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class RotaryController extends ClockDomain{
  public RotaryController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal tableAlignedWithSensor = new Signal("tableAlignedWithSensor", Signal.INPUT);
  public Signal capOnBottleAtPos1 = new Signal("capOnBottleAtPos1", Signal.INPUT);
  public Signal rotaryTableTrigger = new Signal("rotaryTableTrigger", Signal.OUTPUT);
  public Signal bottleAtPos5E = new Signal("bottleAtPos5E", Signal.OUTPUT);
  public input_Channel convReady_in = new input_Channel();
  public input_Channel fillerReady_in = new input_Channel();
  public input_Channel capperReady_in = new input_Channel();
  public input_Channel lidLoaderReady_in = new input_Channel();
  public input_Channel checkFive_in = new input_Channel();
  public input_Channel checkOne_in = new input_Channel();
  public output_Channel rotated_o = new output_Channel();
  private Signal cvR_26;
  private Signal fR_26;
  private Signal cR_26;
  private Signal lR_26;
  private Signal bottleAtPos5_26;
  private long __start_thread_33;//sysj\conveyor_controller.sysj line: 285, column: 44
  private long __start_thread_27;//sysj\conveyor_controller.sysj line: 244, column: 7
  private int i_thread_27;//sysj\conveyor_controller.sysj line: 294, column: 10
  private int S23364 = 1;
  private int S3745 = 1;
  private int S3641 = 1;
  private int S3636 = 1;
  private int S3663 = 1;
  private int S3658 = 1;
  private int S3752 = 1;
  private int S3747 = 1;
  private int S3884 = 1;
  private int S3879 = 1;
  private int S5465 = 1;
  private int S4066 = 1;
  private int S4056 = 1;
  private int S4059 = 1;
  private int S4062 = 1;
  private int S4065 = 1;
  private int S4080 = 1;
  private int S4103 = 1;
  private int S4119 = 1;
  private int S4222 = 1;
  private int S4217 = 1;
  private int S5863 = 1;
  private int S5564 = 1;
  private int S5498 = 1;
  private int S5490 = 1;
  private int S5489 = 1;
  private int S5473 = 1;
  private int S5468 = 1;
  private int S5496 = 1;
  private int S5663 = 1;
  private int S5597 = 1;
  private int S5589 = 1;
  private int S5588 = 1;
  private int S5572 = 1;
  private int S5567 = 1;
  private int S5595 = 1;
  private int S5762 = 1;
  private int S5696 = 1;
  private int S5688 = 1;
  private int S5687 = 1;
  private int S5671 = 1;
  private int S5666 = 1;
  private int S5694 = 1;
  private int S5861 = 1;
  private int S5795 = 1;
  private int S5787 = 1;
  private int S5786 = 1;
  private int S5770 = 1;
  private int S5765 = 1;
  private int S5793 = 1;
  private int S5946 = 1;
  private int S5890 = 1;
  private int S5870 = 1;
  private int S5865 = 1;
  private int S5984 = 1;
  private int S5958 = 1;
  private int S5951 = 1;
  private int S5954 = 1;
  
  private int[] ends = new int[88];
  private int[] tdone = new int[88];
  
  public void thread95693(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95692(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95690(int [] tdone, int [] ends){
        switch(S5954){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        if(rotaryTableTrigger.getprestatus()){//sysj\conveyor_controller.sysj line: 344, column: 29
          ends[50]=2;
          tdone[50]=1;
        }
        else {
          active[50]=1;
          ends[50]=1;
          tdone[50]=1;
        }
        break;
      
    }
  }

  public void thread95689(int [] tdone, int [] ends){
        switch(S5951){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
        currsigs.addElement(bottleAtPos5E);
        active[49]=1;
        ends[49]=1;
        tdone[49]=1;
        break;
      
    }
  }

  public void thread95688(int [] tdone, int [] ends){
        switch(S5984){
      case 0 : 
        active[48]=0;
        ends[48]=0;
        tdone[48]=1;
        break;
      
      case 1 : 
        switch(S5958){
          case 0 : 
            thread95689(tdone,ends);
            thread95690(tdone,ends);
            int biggest95691 = 0;
            if(ends[49]>=biggest95691){
              biggest95691=ends[49];
            }
            if(ends[50]>=biggest95691){
              biggest95691=ends[50];
            }
            if(biggest95691 == 1){
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            if(biggest95691 == 2){
              ends[48]=2;
              ;//sysj\conveyor_controller.sysj line: 338, column: 34
              S5958=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            //FINXME code
            if(biggest95691 == 0){
              ;//sysj\conveyor_controller.sysj line: 346, column: 20
              S5958=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
          case 1 : 
            S5958=1;
            S5958=0;
            if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
              thread95692(tdone,ends);
              thread95693(tdone,ends);
              int biggest95694 = 0;
              if(ends[49]>=biggest95694){
                biggest95694=ends[49];
              }
              if(ends[50]>=biggest95694){
                biggest95694=ends[50];
              }
              if(biggest95694 == 1){
                active[48]=1;
                ends[48]=1;
                tdone[48]=1;
              }
            }
            else {
              S5958=1;
              active[48]=1;
              ends[48]=1;
              tdone[48]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95687(int [] tdone, int [] ends){
        switch(S5946){
      case 0 : 
        active[47]=0;
        ends[47]=0;
        tdone[47]=1;
        break;
      
      case 1 : 
        switch(S5890){
          case 0 : 
            switch(S5870){
              case 0 : 
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                  S5870=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  switch(S5865){
                    case 0 : 
                      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
                        S5865=1;
                        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                          ends[47]=2;
                          ;//sysj\conveyor_controller.sysj line: 322, column: 7
                          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                            currsigs.addElement(bottleAtPos5_26);
                            S5890=1;
                            active[47]=1;
                            ends[47]=1;
                            tdone[47]=1;
                          }
                          else {
                            S5890=1;
                            active[47]=1;
                            ends[47]=1;
                            tdone[47]=1;
                          }
                        }
                        else {
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
                        }
                      }
                      else {
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                        checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                        ends[47]=2;
                        ;//sysj\conveyor_controller.sysj line: 322, column: 7
                        if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                          bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                          currsigs.addElement(bottleAtPos5_26);
                          S5890=1;
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
                        }
                        else {
                          S5890=1;
                          active[47]=1;
                          ends[47]=1;
                          tdone[47]=1;
                        }
                      }
                      else {
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5870=1;
                S5870=0;
                if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                  S5870=1;
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
                else {
                  S5865=0;
                  if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                    checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
                    S5865=1;
                    if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                      ends[47]=2;
                      ;//sysj\conveyor_controller.sysj line: 322, column: 7
                      if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                        bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                        currsigs.addElement(bottleAtPos5_26);
                        S5890=1;
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                      else {
                        S5890=1;
                        active[47]=1;
                        ends[47]=1;
                        tdone[47]=1;
                      }
                    }
                    else {
                      active[47]=1;
                      ends[47]=1;
                      tdone[47]=1;
                    }
                  }
                  else {
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5890=1;
            S5890=0;
            S5870=0;
            if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
              checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
              S5870=1;
              active[47]=1;
              ends[47]=1;
              tdone[47]=1;
            }
            else {
              S5865=0;
              if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
                S5865=1;
                if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
                  checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
                  ends[47]=2;
                  ;//sysj\conveyor_controller.sysj line: 322, column: 7
                  if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
                    bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
                    currsigs.addElement(bottleAtPos5_26);
                    S5890=1;
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                  else {
                    S5890=1;
                    active[47]=1;
                    ends[47]=1;
                    tdone[47]=1;
                  }
                }
                else {
                  active[47]=1;
                  ends[47]=1;
                  tdone[47]=1;
                }
              }
              else {
                active[47]=1;
                ends[47]=1;
                tdone[47]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95684(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95683(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95681(int [] tdone, int [] ends){
        switch(S5793){
      case 0 : 
        active[46]=0;
        ends[46]=0;
        tdone[46]=1;
        break;
      
      case 1 : 
        lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(lR_26);
        active[46]=1;
        ends[46]=1;
        tdone[46]=1;
        break;
      
    }
  }

  public void thread95680(int [] tdone, int [] ends){
        switch(S5787){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        switch(S5786){
          case 0 : 
            switch(S5770){
              case 0 : 
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5770=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  switch(S5765){
                    case 0 : 
                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5765=1;
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[45]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5786=1;
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                        else {
                          active[45]=1;
                          ends[45]=1;
                          tdone[45]=1;
                        }
                      }
                      else {
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[45]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5786=1;
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      else {
                        active[45]=1;
                        ends[45]=1;
                        tdone[45]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5770=1;
                S5770=0;
                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5770=1;
                  active[45]=1;
                  ends[45]=1;
                  tdone[45]=1;
                }
                else {
                  S5765=0;
                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5765=1;
                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[45]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5786=1;
                      active[45]=1;
                      ends[45]=1;
                      tdone[45]=1;
                    }
                    else {
                      active[45]=1;
                      ends[45]=1;
                      tdone[45]=1;
                    }
                  }
                  else {
                    active[45]=1;
                    ends[45]=1;
                    tdone[45]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5786=1;
            S5786=2;
            active[45]=1;
            ends[45]=1;
            tdone[45]=1;
            break;
          
          case 2 : 
            S5786=2;
            lidLoaderReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[45]=2;
            tdone[45]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread95679(int [] tdone, int [] ends){
        switch(S5861){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        switch(S5795){
          case 0 : 
            thread95680(tdone,ends);
            thread95681(tdone,ends);
            int biggest95682 = 0;
            if(ends[45]>=biggest95682){
              biggest95682=ends[45];
            }
            if(ends[46]>=biggest95682){
              biggest95682=ends[46];
            }
            if(biggest95682 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            if(biggest95682 == 2){
              ends[44]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5795=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            //FINXME code
            if(biggest95682 == 0){
              S5795=1;
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
          case 1 : 
            S5795=1;
            S5795=0;
            thread95683(tdone,ends);
            thread95684(tdone,ends);
            int biggest95685 = 0;
            if(ends[45]>=biggest95685){
              biggest95685=ends[45];
            }
            if(ends[46]>=biggest95685){
              biggest95685=ends[46];
            }
            if(biggest95685 == 1){
              active[44]=1;
              ends[44]=1;
              tdone[44]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95677(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95676(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95674(int [] tdone, int [] ends){
        switch(S5694){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(cR_26);
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
        break;
      
    }
  }

  public void thread95673(int [] tdone, int [] ends){
        switch(S5688){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S5687){
          case 0 : 
            switch(S5671){
              case 0 : 
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5671=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S5666){
                    case 0 : 
                      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5666=1;
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5687=1;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5687=1;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5671=1;
                S5671=0;
                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5671=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S5666=0;
                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5666=1;
                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5687=1;
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                    else {
                      active[42]=1;
                      ends[42]=1;
                      tdone[42]=1;
                    }
                  }
                  else {
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5687=1;
            S5687=2;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
            break;
          
          case 2 : 
            S5687=2;
            capperReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[42]=2;
            tdone[42]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread95672(int [] tdone, int [] ends){
        switch(S5762){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        switch(S5696){
          case 0 : 
            thread95673(tdone,ends);
            thread95674(tdone,ends);
            int biggest95675 = 0;
            if(ends[42]>=biggest95675){
              biggest95675=ends[42];
            }
            if(ends[43]>=biggest95675){
              biggest95675=ends[43];
            }
            if(biggest95675 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            if(biggest95675 == 2){
              ends[41]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5696=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            //FINXME code
            if(biggest95675 == 0){
              S5696=1;
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
          case 1 : 
            S5696=1;
            S5696=0;
            thread95676(tdone,ends);
            thread95677(tdone,ends);
            int biggest95678 = 0;
            if(ends[42]>=biggest95678){
              biggest95678=ends[42];
            }
            if(ends[43]>=biggest95678){
              biggest95678=ends[43];
            }
            if(biggest95678 == 1){
              active[41]=1;
              ends[41]=1;
              tdone[41]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95670(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95669(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95667(int [] tdone, int [] ends){
        switch(S5595){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(fR_26);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread95666(int [] tdone, int [] ends){
        switch(S5589){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        switch(S5588){
          case 0 : 
            switch(S5572){
              case 0 : 
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5572=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  switch(S5567){
                    case 0 : 
                      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5567=1;
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[39]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5588=1;
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                        else {
                          active[39]=1;
                          ends[39]=1;
                          tdone[39]=1;
                        }
                      }
                      else {
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[39]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5588=1;
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      else {
                        active[39]=1;
                        ends[39]=1;
                        tdone[39]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5572=1;
                S5572=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5572=1;
                  active[39]=1;
                  ends[39]=1;
                  tdone[39]=1;
                }
                else {
                  S5567=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5567=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[39]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5588=1;
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                    else {
                      active[39]=1;
                      ends[39]=1;
                      tdone[39]=1;
                    }
                  }
                  else {
                    active[39]=1;
                    ends[39]=1;
                    tdone[39]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5588=1;
            S5588=2;
            active[39]=1;
            ends[39]=1;
            tdone[39]=1;
            break;
          
          case 2 : 
            S5588=2;
            fillerReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[39]=2;
            tdone[39]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread95665(int [] tdone, int [] ends){
        switch(S5663){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        switch(S5597){
          case 0 : 
            thread95666(tdone,ends);
            thread95667(tdone,ends);
            int biggest95668 = 0;
            if(ends[39]>=biggest95668){
              biggest95668=ends[39];
            }
            if(ends[40]>=biggest95668){
              biggest95668=ends[40];
            }
            if(biggest95668 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            if(biggest95668 == 2){
              ends[38]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5597=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            //FINXME code
            if(biggest95668 == 0){
              S5597=1;
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
          case 1 : 
            S5597=1;
            S5597=0;
            thread95669(tdone,ends);
            thread95670(tdone,ends);
            int biggest95671 = 0;
            if(ends[39]>=biggest95671){
              biggest95671=ends[39];
            }
            if(ends[40]>=biggest95671){
              biggest95671=ends[40];
            }
            if(biggest95671 == 1){
              active[38]=1;
              ends[38]=1;
              tdone[38]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95663(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95662(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95660(int [] tdone, int [] ends){
        switch(S5496){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
        currsigs.addElement(cvR_26);
        active[37]=1;
        ends[37]=1;
        tdone[37]=1;
        break;
      
    }
  }

  public void thread95659(int [] tdone, int [] ends){
        switch(S5490){
      case 0 : 
        active[36]=0;
        ends[36]=0;
        tdone[36]=1;
        break;
      
      case 1 : 
        switch(S5489){
          case 0 : 
            switch(S5473){
              case 0 : 
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5473=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  switch(S5468){
                    case 0 : 
                      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5468=1;
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 73, column: 5
                          S5489=1;
                          active[36]=1;
                          ends[36]=1;
                          tdone[36]=1;
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          tdone[36]=1;
                        }
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                        ends[36]=2;
                        ;//sysj\conveyor_controller.sysj line: 73, column: 5
                        S5489=1;
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        tdone[36]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S5473=1;
                S5473=0;
                if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
                  convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                  S5473=1;
                  active[36]=1;
                  ends[36]=1;
                  tdone[36]=1;
                }
                else {
                  S5468=0;
                  if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                    convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
                    S5468=1;
                    if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
                      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
                      ends[36]=2;
                      ;//sysj\conveyor_controller.sysj line: 73, column: 5
                      S5489=1;
                      active[36]=1;
                      ends[36]=1;
                      tdone[36]=1;
                    }
                    else {
                      active[36]=1;
                      ends[36]=1;
                      tdone[36]=1;
                    }
                  }
                  else {
                    active[36]=1;
                    ends[36]=1;
                    tdone[36]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S5489=1;
            S5489=2;
            active[36]=1;
            ends[36]=1;
            tdone[36]=1;
            break;
          
          case 2 : 
            S5489=2;
            convReady_in.setPreempted();//sysj\conveyor_controller.sysj line: 73, column: 36
            ends[36]=2;
            tdone[36]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread95658(int [] tdone, int [] ends){
        switch(S5564){
      case 0 : 
        active[35]=0;
        ends[35]=0;
        tdone[35]=1;
        break;
      
      case 1 : 
        switch(S5498){
          case 0 : 
            thread95659(tdone,ends);
            thread95660(tdone,ends);
            int biggest95661 = 0;
            if(ends[36]>=biggest95661){
              biggest95661=ends[36];
            }
            if(ends[37]>=biggest95661){
              biggest95661=ends[37];
            }
            if(biggest95661 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            if(biggest95661 == 2){
              ends[35]=2;
              ;//sysj\conveyor_controller.sysj line: 72, column: 3
              S5498=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            //FINXME code
            if(biggest95661 == 0){
              S5498=1;
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
          case 1 : 
            S5498=1;
            S5498=0;
            thread95662(tdone,ends);
            thread95663(tdone,ends);
            int biggest95664 = 0;
            if(ends[36]>=biggest95664){
              biggest95664=ends[36];
            }
            if(ends[37]>=biggest95664){
              biggest95664=ends[37];
            }
            if(biggest95664 == 1){
              active[35]=1;
              ends[35]=1;
              tdone[35]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95657(int [] tdone, int [] ends){
        switch(S5863){
      case 0 : 
        active[34]=0;
        ends[34]=0;
        tdone[34]=1;
        break;
      
      case 1 : 
        thread95658(tdone,ends);
        thread95665(tdone,ends);
        thread95672(tdone,ends);
        thread95679(tdone,ends);
        int biggest95686 = 0;
        if(ends[35]>=biggest95686){
          biggest95686=ends[35];
        }
        if(ends[38]>=biggest95686){
          biggest95686=ends[38];
        }
        if(ends[41]>=biggest95686){
          biggest95686=ends[41];
        }
        if(ends[44]>=biggest95686){
          biggest95686=ends[44];
        }
        if(biggest95686 == 1){
          active[34]=1;
          ends[34]=1;
          tdone[34]=1;
        }
        //FINXME code
        if(biggest95686 == 0){
          S5863=0;
          active[34]=0;
          ends[34]=0;
          tdone[34]=1;
        }
        break;
      
    }
  }

  public void thread95655(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95654(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95653(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95652(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95650(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95649(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95648(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95647(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95645(int [] tdone, int [] ends){
        switch(S4119){
      case 0 : 
        active[33]=0;
        ends[33]=0;
        tdone[33]=1;
        break;
      
      case 1 : 
        if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
          ends[33]=3;
          ;//sysj\conveyor_controller.sysj line: 285, column: 44
          ends[33]=2;
          tdone[33]=1;
        }
        else {
          active[33]=1;
          ends[33]=1;
          tdone[33]=1;
        }
        break;
      
    }
  }

  public void thread95644(int [] tdone, int [] ends){
        switch(S4103){
      case 0 : 
        active[32]=0;
        ends[32]=0;
        tdone[32]=1;
        break;
      
      case 1 : 
        rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
        currsigs.addElement(rotaryTableTrigger);
        active[32]=1;
        ends[32]=1;
        tdone[32]=1;
        break;
      
    }
  }

  public void thread95642(int [] tdone, int [] ends){
        S4119=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=3;
      ;//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=2;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread95641(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread95639(int [] tdone, int [] ends){
        S4119=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=3;
      ;//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=2;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread95638(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread95636(int [] tdone, int [] ends){
        S4119=1;
    __start_thread_33 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 285, column: 44
    if(com.systemj.Timer.getMs() - __start_thread_33 >= 300){//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=3;
      ;//sysj\conveyor_controller.sysj line: 285, column: 44
      ends[33]=2;
      tdone[33]=1;
    }
    else {
      active[33]=1;
      ends[33]=1;
      tdone[33]=1;
    }
  }

  public void thread95635(int [] tdone, int [] ends){
        S4103=1;
    rotaryTableTrigger.setPresent();//sysj\conveyor_controller.sysj line: 285, column: 14
    currsigs.addElement(rotaryTableTrigger);
    active[32]=1;
    ends[32]=1;
    tdone[32]=1;
  }

  public void thread95633(int [] tdone, int [] ends){
        switch(S4065){
      case 0 : 
        active[31]=0;
        ends[31]=0;
        tdone[31]=1;
        break;
      
      case 1 : 
        if(lR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 265, column: 17
          System.out.println("*Rotary - LidLoader Ready*");//sysj\conveyor_controller.sysj line: 266, column: 11
          S4065=0;
          active[31]=0;
          ends[31]=0;
          tdone[31]=1;
        }
        else {
          active[31]=1;
          ends[31]=1;
          tdone[31]=1;
        }
        break;
      
    }
  }

  public void thread95632(int [] tdone, int [] ends){
        switch(S4062){
      case 0 : 
        active[30]=0;
        ends[30]=0;
        tdone[30]=1;
        break;
      
      case 1 : 
        if(cR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 259, column: 17
          System.out.println("*Rotary - Capper Ready*");//sysj\conveyor_controller.sysj line: 260, column: 11
          S4062=0;
          active[30]=0;
          ends[30]=0;
          tdone[30]=1;
        }
        else {
          active[30]=1;
          ends[30]=1;
          tdone[30]=1;
        }
        break;
      
    }
  }

  public void thread95631(int [] tdone, int [] ends){
        switch(S4059){
      case 0 : 
        active[29]=0;
        ends[29]=0;
        tdone[29]=1;
        break;
      
      case 1 : 
        if(cvR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 253, column: 17
          System.out.println("*Rotary - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 254, column: 11
          S4059=0;
          active[29]=0;
          ends[29]=0;
          tdone[29]=1;
        }
        else {
          active[29]=1;
          ends[29]=1;
          tdone[29]=1;
        }
        break;
      
    }
  }

  public void thread95630(int [] tdone, int [] ends){
        switch(S4056){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        if(fR_26.getprestatus()){//sysj\conveyor_controller.sysj line: 248, column: 17
          System.out.println("*Rotary - Filler Ready*");//sysj\conveyor_controller.sysj line: 249, column: 11
          S4056=0;
          active[28]=0;
          ends[28]=0;
          tdone[28]=1;
        }
        else {
          active[28]=1;
          ends[28]=1;
          tdone[28]=1;
        }
        break;
      
    }
  }

  public void thread95629(int [] tdone, int [] ends){
        switch(S5465){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        switch(S4066){
          case 0 : 
            thread95630(tdone,ends);
            thread95631(tdone,ends);
            thread95632(tdone,ends);
            thread95633(tdone,ends);
            int biggest95634 = 0;
            if(ends[28]>=biggest95634){
              biggest95634=ends[28];
            }
            if(ends[29]>=biggest95634){
              biggest95634=ends[29];
            }
            if(ends[30]>=biggest95634){
              biggest95634=ends[30];
            }
            if(ends[31]>=biggest95634){
              biggest95634=ends[31];
            }
            if(biggest95634 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest95634 == 0){
              System.out.println("*Rotary - All controllers are ready*");//sysj\conveyor_controller.sysj line: 269, column: 10
              S4066=1;
              if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 272, column: 18
                S4080=0;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4066=2;
                thread95635(tdone,ends);
                thread95636(tdone,ends);
                int biggest95637 = 0;
                if(ends[32]>=biggest95637){
                  biggest95637=ends[32];
                }
                if(ends[33]>=biggest95637){
                  biggest95637=ends[33];
                }
                if(biggest95637 == 1){
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                if(biggest95637 == 2){
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 284, column: 12
                  System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                  S4066=3;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            break;
          
          case 1 : 
            switch(S4080){
              case 0 : 
                if(!bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 274, column: 20
                  S4080=1;
                  if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 276, column: 23
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  else {
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 273, column: 13
                    S4066=2;
                    thread95638(tdone,ends);
                    thread95639(tdone,ends);
                    int biggest95640 = 0;
                    if(ends[32]>=biggest95640){
                      biggest95640=ends[32];
                    }
                    if(ends[33]>=biggest95640){
                      biggest95640=ends[33];
                    }
                    if(biggest95640 == 1){
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    if(biggest95640 == 2){
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 284, column: 12
                      System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                      S4066=3;
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                }
                else {
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 276, column: 23
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  ends[27]=2;
                  ;//sysj\conveyor_controller.sysj line: 273, column: 13
                  S4066=2;
                  thread95641(tdone,ends);
                  thread95642(tdone,ends);
                  int biggest95643 = 0;
                  if(ends[32]>=biggest95643){
                    biggest95643=ends[32];
                  }
                  if(ends[33]>=biggest95643){
                    biggest95643=ends[33];
                  }
                  if(biggest95643 == 1){
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                  if(biggest95643 == 2){
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 284, column: 12
                    System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
                    S4066=3;
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            thread95644(tdone,ends);
            thread95645(tdone,ends);
            int biggest95646 = 0;
            if(ends[32]>=biggest95646){
              biggest95646=ends[32];
            }
            if(ends[33]>=biggest95646){
              biggest95646=ends[33];
            }
            if(biggest95646 == 1){
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            if(biggest95646 == 2){
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 284, column: 12
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4066=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            //FINXME code
            if(biggest95646 == 0){
              System.out.println("*Rotary - Waiting for Alignment*");//sysj\conveyor_controller.sysj line: 288, column: 16
              S4066=3;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 3 : 
            if(tableAlignedWithSensor.getprestatus()){//sysj\conveyor_controller.sysj line: 289, column: 22
              System.out.println("*Rotary - Aligned*");//sysj\conveyor_controller.sysj line: 290, column: 16
              S4066=4;
              S4222=0;
              if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                S4222=1;
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
              else {
                S4217=0;
                if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4217=1;
                  if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                    rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                    ends[27]=2;
                    ;//sysj\conveyor_controller.sysj line: 291, column: 13
                    S4066=5;
                    __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                    if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 244, column: 7
                      S4066=6;
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                else {
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 4 : 
            switch(S4222){
              case 0 : 
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4222=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  switch(S4217){
                    case 0 : 
                      if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                        rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                        S4217=1;
                        if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                          rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 291, column: 13
                          S4066=5;
                          __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                          if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                            ends[27]=2;
                            ;//sysj\conveyor_controller.sysj line: 244, column: 7
                            S4066=6;
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                          else {
                            active[27]=1;
                            ends[27]=1;
                            tdone[27]=1;
                          }
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                        rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 291, column: 13
                        S4066=5;
                        __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                        if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                          ends[27]=2;
                          ;//sysj\conveyor_controller.sysj line: 244, column: 7
                          S4066=6;
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                        else {
                          active[27]=1;
                          ends[27]=1;
                          tdone[27]=1;
                        }
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S4222=1;
                S4222=0;
                if(!rotated_o.isPartnerPresent() || rotated_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 291, column: 13
                  rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                  S4222=1;
                  active[27]=1;
                  ends[27]=1;
                  tdone[27]=1;
                }
                else {
                  S4217=0;
                  if(rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                    rotated_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 291, column: 13
                    S4217=1;
                    if(!rotated_o.isACK()){//sysj\conveyor_controller.sysj line: 291, column: 13
                      rotated_o.setREQ(false);//sysj\conveyor_controller.sysj line: 291, column: 13
                      ends[27]=2;
                      ;//sysj\conveyor_controller.sysj line: 291, column: 13
                      S4066=5;
                      __start_thread_27 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 244, column: 7
                      if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
                        ends[27]=2;
                        ;//sysj\conveyor_controller.sysj line: 244, column: 7
                        S4066=6;
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                      else {
                        active[27]=1;
                        ends[27]=1;
                        tdone[27]=1;
                      }
                    }
                    else {
                      active[27]=1;
                      ends[27]=1;
                      tdone[27]=1;
                    }
                  }
                  else {
                    active[27]=1;
                    ends[27]=1;
                    tdone[27]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            if(com.systemj.Timer.getMs() - __start_thread_27 >= (5) * 1000){//sysj\conveyor_controller.sysj line: 244, column: 7
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 244, column: 7
              S4066=6;
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 6 : 
            S4066=6;
            i_thread_27 = 0;//sysj\conveyor_controller.sysj line: 294, column: 10
            S4066=7;
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 297, column: 12
            if(i_thread_27 > 5){//sysj\conveyor_controller.sysj line: 298, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 295, column: 10
              S4066=0;
              thread95647(tdone,ends);
              thread95648(tdone,ends);
              thread95649(tdone,ends);
              thread95650(tdone,ends);
              int biggest95651 = 0;
              if(ends[28]>=biggest95651){
                biggest95651=ends[28];
              }
              if(ends[29]>=biggest95651){
                biggest95651=ends[29];
              }
              if(ends[30]>=biggest95651){
                biggest95651=ends[30];
              }
              if(ends[31]>=biggest95651){
                biggest95651=ends[31];
              }
              if(biggest95651 == 1){
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
          case 7 : 
            i_thread_27 = i_thread_27 + 1;//sysj\conveyor_controller.sysj line: 297, column: 12
            if(i_thread_27 > 5){//sysj\conveyor_controller.sysj line: 298, column: 15
              ends[27]=2;
              ;//sysj\conveyor_controller.sysj line: 295, column: 10
              S4066=0;
              thread95652(tdone,ends);
              thread95653(tdone,ends);
              thread95654(tdone,ends);
              thread95655(tdone,ends);
              int biggest95656 = 0;
              if(ends[28]>=biggest95656){
                biggest95656=ends[28];
              }
              if(ends[29]>=biggest95656){
                biggest95656=ends[29];
              }
              if(ends[30]>=biggest95656){
                biggest95656=ends[30];
              }
              if(ends[31]>=biggest95656){
                biggest95656=ends[31];
              }
              if(biggest95656 == 1){
                active[27]=1;
                ends[27]=1;
                tdone[27]=1;
              }
            }
            else {
              active[27]=1;
              ends[27]=1;
              tdone[27]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread95626(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95625(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95624(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95625(tdone,ends);
      thread95626(tdone,ends);
      int biggest95627 = 0;
      if(ends[49]>=biggest95627){
        biggest95627=ends[49];
      }
      if(ends[50]>=biggest95627){
        biggest95627=ends[50];
      }
      if(biggest95627 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95623(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95620(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95619(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95618(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95619(tdone,ends);
    thread95620(tdone,ends);
    int biggest95621 = 0;
    if(ends[45]>=biggest95621){
      biggest95621=ends[45];
    }
    if(ends[46]>=biggest95621){
      biggest95621=ends[46];
    }
    if(biggest95621 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95616(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95615(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95614(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95615(tdone,ends);
    thread95616(tdone,ends);
    int biggest95617 = 0;
    if(ends[42]>=biggest95617){
      biggest95617=ends[42];
    }
    if(ends[43]>=biggest95617){
      biggest95617=ends[43];
    }
    if(biggest95617 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95612(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95611(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95610(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95611(tdone,ends);
    thread95612(tdone,ends);
    int biggest95613 = 0;
    if(ends[39]>=biggest95613){
      biggest95613=ends[39];
    }
    if(ends[40]>=biggest95613){
      biggest95613=ends[40];
    }
    if(biggest95613 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95608(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95607(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95606(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95607(tdone,ends);
    thread95608(tdone,ends);
    int biggest95609 = 0;
    if(ends[36]>=biggest95609){
      biggest95609=ends[36];
    }
    if(ends[37]>=biggest95609){
      biggest95609=ends[37];
    }
    if(biggest95609 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95605(int [] tdone, int [] ends){
        S5863=1;
    thread95606(tdone,ends);
    thread95610(tdone,ends);
    thread95614(tdone,ends);
    thread95618(tdone,ends);
    int biggest95622 = 0;
    if(ends[35]>=biggest95622){
      biggest95622=ends[35];
    }
    if(ends[38]>=biggest95622){
      biggest95622=ends[38];
    }
    if(ends[41]>=biggest95622){
      biggest95622=ends[41];
    }
    if(ends[44]>=biggest95622){
      biggest95622=ends[44];
    }
    if(biggest95622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95622 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95603(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95602(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95601(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95600(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95599(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95600(tdone,ends);
    thread95601(tdone,ends);
    thread95602(tdone,ends);
    thread95603(tdone,ends);
    int biggest95604 = 0;
    if(ends[28]>=biggest95604){
      biggest95604=ends[28];
    }
    if(ends[29]>=biggest95604){
      biggest95604=ends[29];
    }
    if(ends[30]>=biggest95604){
      biggest95604=ends[30];
    }
    if(ends[31]>=biggest95604){
      biggest95604=ends[31];
    }
    if(biggest95604 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95596(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95595(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95594(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95595(tdone,ends);
      thread95596(tdone,ends);
      int biggest95597 = 0;
      if(ends[49]>=biggest95597){
        biggest95597=ends[49];
      }
      if(ends[50]>=biggest95597){
        biggest95597=ends[50];
      }
      if(biggest95597 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95593(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95590(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95589(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95588(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95589(tdone,ends);
    thread95590(tdone,ends);
    int biggest95591 = 0;
    if(ends[45]>=biggest95591){
      biggest95591=ends[45];
    }
    if(ends[46]>=biggest95591){
      biggest95591=ends[46];
    }
    if(biggest95591 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95586(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95585(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95584(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95585(tdone,ends);
    thread95586(tdone,ends);
    int biggest95587 = 0;
    if(ends[42]>=biggest95587){
      biggest95587=ends[42];
    }
    if(ends[43]>=biggest95587){
      biggest95587=ends[43];
    }
    if(biggest95587 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95582(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95581(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95580(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95581(tdone,ends);
    thread95582(tdone,ends);
    int biggest95583 = 0;
    if(ends[39]>=biggest95583){
      biggest95583=ends[39];
    }
    if(ends[40]>=biggest95583){
      biggest95583=ends[40];
    }
    if(biggest95583 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95578(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95577(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95576(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95577(tdone,ends);
    thread95578(tdone,ends);
    int biggest95579 = 0;
    if(ends[36]>=biggest95579){
      biggest95579=ends[36];
    }
    if(ends[37]>=biggest95579){
      biggest95579=ends[37];
    }
    if(biggest95579 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95575(int [] tdone, int [] ends){
        S5863=1;
    thread95576(tdone,ends);
    thread95580(tdone,ends);
    thread95584(tdone,ends);
    thread95588(tdone,ends);
    int biggest95592 = 0;
    if(ends[35]>=biggest95592){
      biggest95592=ends[35];
    }
    if(ends[38]>=biggest95592){
      biggest95592=ends[38];
    }
    if(ends[41]>=biggest95592){
      biggest95592=ends[41];
    }
    if(ends[44]>=biggest95592){
      biggest95592=ends[44];
    }
    if(biggest95592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95592 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95573(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95572(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95571(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95570(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95569(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95570(tdone,ends);
    thread95571(tdone,ends);
    thread95572(tdone,ends);
    thread95573(tdone,ends);
    int biggest95574 = 0;
    if(ends[28]>=biggest95574){
      biggest95574=ends[28];
    }
    if(ends[29]>=biggest95574){
      biggest95574=ends[29];
    }
    if(ends[30]>=biggest95574){
      biggest95574=ends[30];
    }
    if(ends[31]>=biggest95574){
      biggest95574=ends[31];
    }
    if(biggest95574 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95566(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95565(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95564(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95565(tdone,ends);
      thread95566(tdone,ends);
      int biggest95567 = 0;
      if(ends[49]>=biggest95567){
        biggest95567=ends[49];
      }
      if(ends[50]>=biggest95567){
        biggest95567=ends[50];
      }
      if(biggest95567 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95563(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95560(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95559(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95558(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95559(tdone,ends);
    thread95560(tdone,ends);
    int biggest95561 = 0;
    if(ends[45]>=biggest95561){
      biggest95561=ends[45];
    }
    if(ends[46]>=biggest95561){
      biggest95561=ends[46];
    }
    if(biggest95561 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95556(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95555(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95554(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95555(tdone,ends);
    thread95556(tdone,ends);
    int biggest95557 = 0;
    if(ends[42]>=biggest95557){
      biggest95557=ends[42];
    }
    if(ends[43]>=biggest95557){
      biggest95557=ends[43];
    }
    if(biggest95557 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95552(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95551(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95550(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95551(tdone,ends);
    thread95552(tdone,ends);
    int biggest95553 = 0;
    if(ends[39]>=biggest95553){
      biggest95553=ends[39];
    }
    if(ends[40]>=biggest95553){
      biggest95553=ends[40];
    }
    if(biggest95553 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95548(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95547(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95546(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95547(tdone,ends);
    thread95548(tdone,ends);
    int biggest95549 = 0;
    if(ends[36]>=biggest95549){
      biggest95549=ends[36];
    }
    if(ends[37]>=biggest95549){
      biggest95549=ends[37];
    }
    if(biggest95549 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95545(int [] tdone, int [] ends){
        S5863=1;
    thread95546(tdone,ends);
    thread95550(tdone,ends);
    thread95554(tdone,ends);
    thread95558(tdone,ends);
    int biggest95562 = 0;
    if(ends[35]>=biggest95562){
      biggest95562=ends[35];
    }
    if(ends[38]>=biggest95562){
      biggest95562=ends[38];
    }
    if(ends[41]>=biggest95562){
      biggest95562=ends[41];
    }
    if(ends[44]>=biggest95562){
      biggest95562=ends[44];
    }
    if(biggest95562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95562 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95543(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95542(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95541(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95540(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95539(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95540(tdone,ends);
    thread95541(tdone,ends);
    thread95542(tdone,ends);
    thread95543(tdone,ends);
    int biggest95544 = 0;
    if(ends[28]>=biggest95544){
      biggest95544=ends[28];
    }
    if(ends[29]>=biggest95544){
      biggest95544=ends[29];
    }
    if(ends[30]>=biggest95544){
      biggest95544=ends[30];
    }
    if(ends[31]>=biggest95544){
      biggest95544=ends[31];
    }
    if(biggest95544 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95536(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95535(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95534(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95535(tdone,ends);
      thread95536(tdone,ends);
      int biggest95537 = 0;
      if(ends[49]>=biggest95537){
        biggest95537=ends[49];
      }
      if(ends[50]>=biggest95537){
        biggest95537=ends[50];
      }
      if(biggest95537 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95533(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95530(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95529(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95528(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95529(tdone,ends);
    thread95530(tdone,ends);
    int biggest95531 = 0;
    if(ends[45]>=biggest95531){
      biggest95531=ends[45];
    }
    if(ends[46]>=biggest95531){
      biggest95531=ends[46];
    }
    if(biggest95531 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95526(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95525(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95524(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95525(tdone,ends);
    thread95526(tdone,ends);
    int biggest95527 = 0;
    if(ends[42]>=biggest95527){
      biggest95527=ends[42];
    }
    if(ends[43]>=biggest95527){
      biggest95527=ends[43];
    }
    if(biggest95527 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95522(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95521(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95520(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95521(tdone,ends);
    thread95522(tdone,ends);
    int biggest95523 = 0;
    if(ends[39]>=biggest95523){
      biggest95523=ends[39];
    }
    if(ends[40]>=biggest95523){
      biggest95523=ends[40];
    }
    if(biggest95523 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95518(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95517(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95516(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95517(tdone,ends);
    thread95518(tdone,ends);
    int biggest95519 = 0;
    if(ends[36]>=biggest95519){
      biggest95519=ends[36];
    }
    if(ends[37]>=biggest95519){
      biggest95519=ends[37];
    }
    if(biggest95519 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95515(int [] tdone, int [] ends){
        S5863=1;
    thread95516(tdone,ends);
    thread95520(tdone,ends);
    thread95524(tdone,ends);
    thread95528(tdone,ends);
    int biggest95532 = 0;
    if(ends[35]>=biggest95532){
      biggest95532=ends[35];
    }
    if(ends[38]>=biggest95532){
      biggest95532=ends[38];
    }
    if(ends[41]>=biggest95532){
      biggest95532=ends[41];
    }
    if(ends[44]>=biggest95532){
      biggest95532=ends[44];
    }
    if(biggest95532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95532 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95513(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95512(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95511(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95510(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95509(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95510(tdone,ends);
    thread95511(tdone,ends);
    thread95512(tdone,ends);
    thread95513(tdone,ends);
    int biggest95514 = 0;
    if(ends[28]>=biggest95514){
      biggest95514=ends[28];
    }
    if(ends[29]>=biggest95514){
      biggest95514=ends[29];
    }
    if(ends[30]>=biggest95514){
      biggest95514=ends[30];
    }
    if(ends[31]>=biggest95514){
      biggest95514=ends[31];
    }
    if(biggest95514 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95506(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95505(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95504(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95505(tdone,ends);
      thread95506(tdone,ends);
      int biggest95507 = 0;
      if(ends[49]>=biggest95507){
        biggest95507=ends[49];
      }
      if(ends[50]>=biggest95507){
        biggest95507=ends[50];
      }
      if(biggest95507 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95503(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95500(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95499(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95498(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95499(tdone,ends);
    thread95500(tdone,ends);
    int biggest95501 = 0;
    if(ends[45]>=biggest95501){
      biggest95501=ends[45];
    }
    if(ends[46]>=biggest95501){
      biggest95501=ends[46];
    }
    if(biggest95501 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95496(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95495(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95494(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95495(tdone,ends);
    thread95496(tdone,ends);
    int biggest95497 = 0;
    if(ends[42]>=biggest95497){
      biggest95497=ends[42];
    }
    if(ends[43]>=biggest95497){
      biggest95497=ends[43];
    }
    if(biggest95497 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95492(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95491(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95490(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95491(tdone,ends);
    thread95492(tdone,ends);
    int biggest95493 = 0;
    if(ends[39]>=biggest95493){
      biggest95493=ends[39];
    }
    if(ends[40]>=biggest95493){
      biggest95493=ends[40];
    }
    if(biggest95493 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95488(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95487(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95486(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95487(tdone,ends);
    thread95488(tdone,ends);
    int biggest95489 = 0;
    if(ends[36]>=biggest95489){
      biggest95489=ends[36];
    }
    if(ends[37]>=biggest95489){
      biggest95489=ends[37];
    }
    if(biggest95489 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95485(int [] tdone, int [] ends){
        S5863=1;
    thread95486(tdone,ends);
    thread95490(tdone,ends);
    thread95494(tdone,ends);
    thread95498(tdone,ends);
    int biggest95502 = 0;
    if(ends[35]>=biggest95502){
      biggest95502=ends[35];
    }
    if(ends[38]>=biggest95502){
      biggest95502=ends[38];
    }
    if(ends[41]>=biggest95502){
      biggest95502=ends[41];
    }
    if(ends[44]>=biggest95502){
      biggest95502=ends[44];
    }
    if(biggest95502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95502 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95483(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95482(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95481(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95480(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95479(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95480(tdone,ends);
    thread95481(tdone,ends);
    thread95482(tdone,ends);
    thread95483(tdone,ends);
    int biggest95484 = 0;
    if(ends[28]>=biggest95484){
      biggest95484=ends[28];
    }
    if(ends[29]>=biggest95484){
      biggest95484=ends[29];
    }
    if(ends[30]>=biggest95484){
      biggest95484=ends[30];
    }
    if(ends[31]>=biggest95484){
      biggest95484=ends[31];
    }
    if(biggest95484 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95476(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95475(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95474(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95475(tdone,ends);
      thread95476(tdone,ends);
      int biggest95477 = 0;
      if(ends[49]>=biggest95477){
        biggest95477=ends[49];
      }
      if(ends[50]>=biggest95477){
        biggest95477=ends[50];
      }
      if(biggest95477 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95473(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95470(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95469(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95468(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95469(tdone,ends);
    thread95470(tdone,ends);
    int biggest95471 = 0;
    if(ends[45]>=biggest95471){
      biggest95471=ends[45];
    }
    if(ends[46]>=biggest95471){
      biggest95471=ends[46];
    }
    if(biggest95471 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95466(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95465(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95464(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95465(tdone,ends);
    thread95466(tdone,ends);
    int biggest95467 = 0;
    if(ends[42]>=biggest95467){
      biggest95467=ends[42];
    }
    if(ends[43]>=biggest95467){
      biggest95467=ends[43];
    }
    if(biggest95467 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95462(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95461(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95460(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95461(tdone,ends);
    thread95462(tdone,ends);
    int biggest95463 = 0;
    if(ends[39]>=biggest95463){
      biggest95463=ends[39];
    }
    if(ends[40]>=biggest95463){
      biggest95463=ends[40];
    }
    if(biggest95463 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95458(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95457(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95456(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95457(tdone,ends);
    thread95458(tdone,ends);
    int biggest95459 = 0;
    if(ends[36]>=biggest95459){
      biggest95459=ends[36];
    }
    if(ends[37]>=biggest95459){
      biggest95459=ends[37];
    }
    if(biggest95459 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95455(int [] tdone, int [] ends){
        S5863=1;
    thread95456(tdone,ends);
    thread95460(tdone,ends);
    thread95464(tdone,ends);
    thread95468(tdone,ends);
    int biggest95472 = 0;
    if(ends[35]>=biggest95472){
      biggest95472=ends[35];
    }
    if(ends[38]>=biggest95472){
      biggest95472=ends[38];
    }
    if(ends[41]>=biggest95472){
      biggest95472=ends[41];
    }
    if(ends[44]>=biggest95472){
      biggest95472=ends[44];
    }
    if(biggest95472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95472 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95453(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95452(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95451(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95450(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95449(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95450(tdone,ends);
    thread95451(tdone,ends);
    thread95452(tdone,ends);
    thread95453(tdone,ends);
    int biggest95454 = 0;
    if(ends[28]>=biggest95454){
      biggest95454=ends[28];
    }
    if(ends[29]>=biggest95454){
      biggest95454=ends[29];
    }
    if(ends[30]>=biggest95454){
      biggest95454=ends[30];
    }
    if(ends[31]>=biggest95454){
      biggest95454=ends[31];
    }
    if(biggest95454 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95446(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95445(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95444(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95445(tdone,ends);
      thread95446(tdone,ends);
      int biggest95447 = 0;
      if(ends[49]>=biggest95447){
        biggest95447=ends[49];
      }
      if(ends[50]>=biggest95447){
        biggest95447=ends[50];
      }
      if(biggest95447 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95443(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95440(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95439(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95438(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95439(tdone,ends);
    thread95440(tdone,ends);
    int biggest95441 = 0;
    if(ends[45]>=biggest95441){
      biggest95441=ends[45];
    }
    if(ends[46]>=biggest95441){
      biggest95441=ends[46];
    }
    if(biggest95441 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95436(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95435(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95434(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95435(tdone,ends);
    thread95436(tdone,ends);
    int biggest95437 = 0;
    if(ends[42]>=biggest95437){
      biggest95437=ends[42];
    }
    if(ends[43]>=biggest95437){
      biggest95437=ends[43];
    }
    if(biggest95437 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95432(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95431(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95430(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95431(tdone,ends);
    thread95432(tdone,ends);
    int biggest95433 = 0;
    if(ends[39]>=biggest95433){
      biggest95433=ends[39];
    }
    if(ends[40]>=biggest95433){
      biggest95433=ends[40];
    }
    if(biggest95433 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95428(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95427(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95426(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95427(tdone,ends);
    thread95428(tdone,ends);
    int biggest95429 = 0;
    if(ends[36]>=biggest95429){
      biggest95429=ends[36];
    }
    if(ends[37]>=biggest95429){
      biggest95429=ends[37];
    }
    if(biggest95429 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95425(int [] tdone, int [] ends){
        S5863=1;
    thread95426(tdone,ends);
    thread95430(tdone,ends);
    thread95434(tdone,ends);
    thread95438(tdone,ends);
    int biggest95442 = 0;
    if(ends[35]>=biggest95442){
      biggest95442=ends[35];
    }
    if(ends[38]>=biggest95442){
      biggest95442=ends[38];
    }
    if(ends[41]>=biggest95442){
      biggest95442=ends[41];
    }
    if(ends[44]>=biggest95442){
      biggest95442=ends[44];
    }
    if(biggest95442 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95442 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95442 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95442 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95423(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95422(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95421(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95420(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95419(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95420(tdone,ends);
    thread95421(tdone,ends);
    thread95422(tdone,ends);
    thread95423(tdone,ends);
    int biggest95424 = 0;
    if(ends[28]>=biggest95424){
      biggest95424=ends[28];
    }
    if(ends[29]>=biggest95424){
      biggest95424=ends[29];
    }
    if(ends[30]>=biggest95424){
      biggest95424=ends[30];
    }
    if(ends[31]>=biggest95424){
      biggest95424=ends[31];
    }
    if(biggest95424 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95416(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95415(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95414(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95415(tdone,ends);
      thread95416(tdone,ends);
      int biggest95417 = 0;
      if(ends[49]>=biggest95417){
        biggest95417=ends[49];
      }
      if(ends[50]>=biggest95417){
        biggest95417=ends[50];
      }
      if(biggest95417 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95413(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95410(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95409(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95408(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95409(tdone,ends);
    thread95410(tdone,ends);
    int biggest95411 = 0;
    if(ends[45]>=biggest95411){
      biggest95411=ends[45];
    }
    if(ends[46]>=biggest95411){
      biggest95411=ends[46];
    }
    if(biggest95411 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95406(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95405(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95404(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95405(tdone,ends);
    thread95406(tdone,ends);
    int biggest95407 = 0;
    if(ends[42]>=biggest95407){
      biggest95407=ends[42];
    }
    if(ends[43]>=biggest95407){
      biggest95407=ends[43];
    }
    if(biggest95407 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95402(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95401(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95400(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95401(tdone,ends);
    thread95402(tdone,ends);
    int biggest95403 = 0;
    if(ends[39]>=biggest95403){
      biggest95403=ends[39];
    }
    if(ends[40]>=biggest95403){
      biggest95403=ends[40];
    }
    if(biggest95403 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95398(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95397(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95396(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95397(tdone,ends);
    thread95398(tdone,ends);
    int biggest95399 = 0;
    if(ends[36]>=biggest95399){
      biggest95399=ends[36];
    }
    if(ends[37]>=biggest95399){
      biggest95399=ends[37];
    }
    if(biggest95399 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95395(int [] tdone, int [] ends){
        S5863=1;
    thread95396(tdone,ends);
    thread95400(tdone,ends);
    thread95404(tdone,ends);
    thread95408(tdone,ends);
    int biggest95412 = 0;
    if(ends[35]>=biggest95412){
      biggest95412=ends[35];
    }
    if(ends[38]>=biggest95412){
      biggest95412=ends[38];
    }
    if(ends[41]>=biggest95412){
      biggest95412=ends[41];
    }
    if(ends[44]>=biggest95412){
      biggest95412=ends[44];
    }
    if(biggest95412 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95412 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95412 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95412 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95393(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95392(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95391(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95390(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95389(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95390(tdone,ends);
    thread95391(tdone,ends);
    thread95392(tdone,ends);
    thread95393(tdone,ends);
    int biggest95394 = 0;
    if(ends[28]>=biggest95394){
      biggest95394=ends[28];
    }
    if(ends[29]>=biggest95394){
      biggest95394=ends[29];
    }
    if(ends[30]>=biggest95394){
      biggest95394=ends[30];
    }
    if(ends[31]>=biggest95394){
      biggest95394=ends[31];
    }
    if(biggest95394 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95386(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95385(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95384(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95385(tdone,ends);
      thread95386(tdone,ends);
      int biggest95387 = 0;
      if(ends[49]>=biggest95387){
        biggest95387=ends[49];
      }
      if(ends[50]>=biggest95387){
        biggest95387=ends[50];
      }
      if(biggest95387 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95383(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95380(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95379(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95378(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95379(tdone,ends);
    thread95380(tdone,ends);
    int biggest95381 = 0;
    if(ends[45]>=biggest95381){
      biggest95381=ends[45];
    }
    if(ends[46]>=biggest95381){
      biggest95381=ends[46];
    }
    if(biggest95381 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95376(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95375(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95374(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95375(tdone,ends);
    thread95376(tdone,ends);
    int biggest95377 = 0;
    if(ends[42]>=biggest95377){
      biggest95377=ends[42];
    }
    if(ends[43]>=biggest95377){
      biggest95377=ends[43];
    }
    if(biggest95377 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95372(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95371(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95370(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95371(tdone,ends);
    thread95372(tdone,ends);
    int biggest95373 = 0;
    if(ends[39]>=biggest95373){
      biggest95373=ends[39];
    }
    if(ends[40]>=biggest95373){
      biggest95373=ends[40];
    }
    if(biggest95373 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95368(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95367(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95366(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95367(tdone,ends);
    thread95368(tdone,ends);
    int biggest95369 = 0;
    if(ends[36]>=biggest95369){
      biggest95369=ends[36];
    }
    if(ends[37]>=biggest95369){
      biggest95369=ends[37];
    }
    if(biggest95369 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95365(int [] tdone, int [] ends){
        S5863=1;
    thread95366(tdone,ends);
    thread95370(tdone,ends);
    thread95374(tdone,ends);
    thread95378(tdone,ends);
    int biggest95382 = 0;
    if(ends[35]>=biggest95382){
      biggest95382=ends[35];
    }
    if(ends[38]>=biggest95382){
      biggest95382=ends[38];
    }
    if(ends[41]>=biggest95382){
      biggest95382=ends[41];
    }
    if(ends[44]>=biggest95382){
      biggest95382=ends[44];
    }
    if(biggest95382 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95382 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95382 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95382 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95363(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95362(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95361(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95360(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95359(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95360(tdone,ends);
    thread95361(tdone,ends);
    thread95362(tdone,ends);
    thread95363(tdone,ends);
    int biggest95364 = 0;
    if(ends[28]>=biggest95364){
      biggest95364=ends[28];
    }
    if(ends[29]>=biggest95364){
      biggest95364=ends[29];
    }
    if(ends[30]>=biggest95364){
      biggest95364=ends[30];
    }
    if(ends[31]>=biggest95364){
      biggest95364=ends[31];
    }
    if(biggest95364 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95356(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95355(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95354(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95355(tdone,ends);
      thread95356(tdone,ends);
      int biggest95357 = 0;
      if(ends[49]>=biggest95357){
        biggest95357=ends[49];
      }
      if(ends[50]>=biggest95357){
        biggest95357=ends[50];
      }
      if(biggest95357 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95353(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95350(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95349(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95348(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95349(tdone,ends);
    thread95350(tdone,ends);
    int biggest95351 = 0;
    if(ends[45]>=biggest95351){
      biggest95351=ends[45];
    }
    if(ends[46]>=biggest95351){
      biggest95351=ends[46];
    }
    if(biggest95351 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95346(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95345(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95344(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95345(tdone,ends);
    thread95346(tdone,ends);
    int biggest95347 = 0;
    if(ends[42]>=biggest95347){
      biggest95347=ends[42];
    }
    if(ends[43]>=biggest95347){
      biggest95347=ends[43];
    }
    if(biggest95347 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95342(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95341(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95340(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95341(tdone,ends);
    thread95342(tdone,ends);
    int biggest95343 = 0;
    if(ends[39]>=biggest95343){
      biggest95343=ends[39];
    }
    if(ends[40]>=biggest95343){
      biggest95343=ends[40];
    }
    if(biggest95343 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95338(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95337(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95336(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95337(tdone,ends);
    thread95338(tdone,ends);
    int biggest95339 = 0;
    if(ends[36]>=biggest95339){
      biggest95339=ends[36];
    }
    if(ends[37]>=biggest95339){
      biggest95339=ends[37];
    }
    if(biggest95339 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95335(int [] tdone, int [] ends){
        S5863=1;
    thread95336(tdone,ends);
    thread95340(tdone,ends);
    thread95344(tdone,ends);
    thread95348(tdone,ends);
    int biggest95352 = 0;
    if(ends[35]>=biggest95352){
      biggest95352=ends[35];
    }
    if(ends[38]>=biggest95352){
      biggest95352=ends[38];
    }
    if(ends[41]>=biggest95352){
      biggest95352=ends[41];
    }
    if(ends[44]>=biggest95352){
      biggest95352=ends[44];
    }
    if(biggest95352 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95352 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95352 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95352 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95333(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95332(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95331(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95330(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95329(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95330(tdone,ends);
    thread95331(tdone,ends);
    thread95332(tdone,ends);
    thread95333(tdone,ends);
    int biggest95334 = 0;
    if(ends[28]>=biggest95334){
      biggest95334=ends[28];
    }
    if(ends[29]>=biggest95334){
      biggest95334=ends[29];
    }
    if(ends[30]>=biggest95334){
      biggest95334=ends[30];
    }
    if(ends[31]>=biggest95334){
      biggest95334=ends[31];
    }
    if(biggest95334 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95326(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95325(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95324(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95325(tdone,ends);
      thread95326(tdone,ends);
      int biggest95327 = 0;
      if(ends[49]>=biggest95327){
        biggest95327=ends[49];
      }
      if(ends[50]>=biggest95327){
        biggest95327=ends[50];
      }
      if(biggest95327 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95323(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95320(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95319(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95318(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95319(tdone,ends);
    thread95320(tdone,ends);
    int biggest95321 = 0;
    if(ends[45]>=biggest95321){
      biggest95321=ends[45];
    }
    if(ends[46]>=biggest95321){
      biggest95321=ends[46];
    }
    if(biggest95321 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95316(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95315(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95314(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95315(tdone,ends);
    thread95316(tdone,ends);
    int biggest95317 = 0;
    if(ends[42]>=biggest95317){
      biggest95317=ends[42];
    }
    if(ends[43]>=biggest95317){
      biggest95317=ends[43];
    }
    if(biggest95317 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95312(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95311(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95310(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95311(tdone,ends);
    thread95312(tdone,ends);
    int biggest95313 = 0;
    if(ends[39]>=biggest95313){
      biggest95313=ends[39];
    }
    if(ends[40]>=biggest95313){
      biggest95313=ends[40];
    }
    if(biggest95313 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95308(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95307(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95306(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95307(tdone,ends);
    thread95308(tdone,ends);
    int biggest95309 = 0;
    if(ends[36]>=biggest95309){
      biggest95309=ends[36];
    }
    if(ends[37]>=biggest95309){
      biggest95309=ends[37];
    }
    if(biggest95309 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95305(int [] tdone, int [] ends){
        S5863=1;
    thread95306(tdone,ends);
    thread95310(tdone,ends);
    thread95314(tdone,ends);
    thread95318(tdone,ends);
    int biggest95322 = 0;
    if(ends[35]>=biggest95322){
      biggest95322=ends[35];
    }
    if(ends[38]>=biggest95322){
      biggest95322=ends[38];
    }
    if(ends[41]>=biggest95322){
      biggest95322=ends[41];
    }
    if(ends[44]>=biggest95322){
      biggest95322=ends[44];
    }
    if(biggest95322 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95322 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95322 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95322 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95303(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95302(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95301(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95300(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95299(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95300(tdone,ends);
    thread95301(tdone,ends);
    thread95302(tdone,ends);
    thread95303(tdone,ends);
    int biggest95304 = 0;
    if(ends[28]>=biggest95304){
      biggest95304=ends[28];
    }
    if(ends[29]>=biggest95304){
      biggest95304=ends[29];
    }
    if(ends[30]>=biggest95304){
      biggest95304=ends[30];
    }
    if(ends[31]>=biggest95304){
      biggest95304=ends[31];
    }
    if(biggest95304 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95296(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95295(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95294(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95295(tdone,ends);
      thread95296(tdone,ends);
      int biggest95297 = 0;
      if(ends[49]>=biggest95297){
        biggest95297=ends[49];
      }
      if(ends[50]>=biggest95297){
        biggest95297=ends[50];
      }
      if(biggest95297 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95293(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95290(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95289(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95288(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95289(tdone,ends);
    thread95290(tdone,ends);
    int biggest95291 = 0;
    if(ends[45]>=biggest95291){
      biggest95291=ends[45];
    }
    if(ends[46]>=biggest95291){
      biggest95291=ends[46];
    }
    if(biggest95291 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95286(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95285(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95284(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95285(tdone,ends);
    thread95286(tdone,ends);
    int biggest95287 = 0;
    if(ends[42]>=biggest95287){
      biggest95287=ends[42];
    }
    if(ends[43]>=biggest95287){
      biggest95287=ends[43];
    }
    if(biggest95287 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95282(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95281(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95280(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95281(tdone,ends);
    thread95282(tdone,ends);
    int biggest95283 = 0;
    if(ends[39]>=biggest95283){
      biggest95283=ends[39];
    }
    if(ends[40]>=biggest95283){
      biggest95283=ends[40];
    }
    if(biggest95283 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95278(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95277(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95276(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95277(tdone,ends);
    thread95278(tdone,ends);
    int biggest95279 = 0;
    if(ends[36]>=biggest95279){
      biggest95279=ends[36];
    }
    if(ends[37]>=biggest95279){
      biggest95279=ends[37];
    }
    if(biggest95279 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95275(int [] tdone, int [] ends){
        S5863=1;
    thread95276(tdone,ends);
    thread95280(tdone,ends);
    thread95284(tdone,ends);
    thread95288(tdone,ends);
    int biggest95292 = 0;
    if(ends[35]>=biggest95292){
      biggest95292=ends[35];
    }
    if(ends[38]>=biggest95292){
      biggest95292=ends[38];
    }
    if(ends[41]>=biggest95292){
      biggest95292=ends[41];
    }
    if(ends[44]>=biggest95292){
      biggest95292=ends[44];
    }
    if(biggest95292 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95292 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95292 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95292 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95273(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95272(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95271(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95270(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95269(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95270(tdone,ends);
    thread95271(tdone,ends);
    thread95272(tdone,ends);
    thread95273(tdone,ends);
    int biggest95274 = 0;
    if(ends[28]>=biggest95274){
      biggest95274=ends[28];
    }
    if(ends[29]>=biggest95274){
      biggest95274=ends[29];
    }
    if(ends[30]>=biggest95274){
      biggest95274=ends[30];
    }
    if(ends[31]>=biggest95274){
      biggest95274=ends[31];
    }
    if(biggest95274 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void thread95266(int [] tdone, int [] ends){
        S5954=1;
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread95265(int [] tdone, int [] ends){
        S5951=1;
    bottleAtPos5E.setPresent();//sysj\conveyor_controller.sysj line: 340, column: 23
    currsigs.addElement(bottleAtPos5E);
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread95264(int [] tdone, int [] ends){
        S5984=1;
    S5958=0;
    if(bottleAtPos5_26.getprestatus()){//sysj\conveyor_controller.sysj line: 338, column: 21
      thread95265(tdone,ends);
      thread95266(tdone,ends);
      int biggest95267 = 0;
      if(ends[49]>=biggest95267){
        biggest95267=ends[49];
      }
      if(ends[50]>=biggest95267){
        biggest95267=ends[50];
      }
      if(biggest95267 == 1){
        active[48]=1;
        ends[48]=1;
        tdone[48]=1;
      }
    }
    else {
      S5958=1;
      active[48]=1;
      ends[48]=1;
      tdone[48]=1;
    }
  }

  public void thread95263(int [] tdone, int [] ends){
        S5946=1;
    S5890=0;
    S5870=0;
    if(!checkFive_in.isPartnerPresent() || checkFive_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 322, column: 7
      checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
      S5870=1;
      active[47]=1;
      ends[47]=1;
      tdone[47]=1;
    }
    else {
      S5865=0;
      if(!checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
        checkFive_in.setACK(true);//sysj\conveyor_controller.sysj line: 322, column: 7
        S5865=1;
        if(checkFive_in.isREQ()){//sysj\conveyor_controller.sysj line: 322, column: 7
          checkFive_in.setACK(false);//sysj\conveyor_controller.sysj line: 322, column: 7
          ends[47]=2;
          ;//sysj\conveyor_controller.sysj line: 322, column: 7
          if((Boolean)(checkFive_in.getVal() == null ? null : ((Boolean)checkFive_in.getVal()))){//sysj\conveyor_controller.sysj line: 323, column: 10
            bottleAtPos5_26.setPresent();//sysj\conveyor_controller.sysj line: 324, column: 8
            currsigs.addElement(bottleAtPos5_26);
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
          else {
            S5890=1;
            active[47]=1;
            ends[47]=1;
            tdone[47]=1;
          }
        }
        else {
          active[47]=1;
          ends[47]=1;
          tdone[47]=1;
        }
      }
      else {
        active[47]=1;
        ends[47]=1;
        tdone[47]=1;
      }
    }
  }

  public void thread95260(int [] tdone, int [] ends){
        S5793=1;
    if((lidLoaderReady_in.getVal() == null ? null : ((Boolean)lidLoaderReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      lR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(lR_26);
      active[46]=1;
      ends[46]=1;
      tdone[46]=1;
    }
    else {
      S5793=0;
      active[46]=0;
      ends[46]=0;
      tdone[46]=1;
    }
  }

  public void thread95259(int [] tdone, int [] ends){
        S5787=1;
    S5786=0;
    S5770=0;
    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5770=1;
      active[45]=1;
      ends[45]=1;
      tdone[45]=1;
    }
    else {
      S5765=0;
      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5765=1;
        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[45]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5786=1;
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
        else {
          active[45]=1;
          ends[45]=1;
          tdone[45]=1;
        }
      }
      else {
        active[45]=1;
        ends[45]=1;
        tdone[45]=1;
      }
    }
  }

  public void thread95258(int [] tdone, int [] ends){
        S5861=1;
    S5795=0;
    thread95259(tdone,ends);
    thread95260(tdone,ends);
    int biggest95261 = 0;
    if(ends[45]>=biggest95261){
      biggest95261=ends[45];
    }
    if(ends[46]>=biggest95261){
      biggest95261=ends[46];
    }
    if(biggest95261 == 1){
      active[44]=1;
      ends[44]=1;
      tdone[44]=1;
    }
  }

  public void thread95256(int [] tdone, int [] ends){
        S5694=1;
    if((capperReady_in.getVal() == null ? null : ((Boolean)capperReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cR_26);
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
    else {
      S5694=0;
      active[43]=0;
      ends[43]=0;
      tdone[43]=1;
    }
  }

  public void thread95255(int [] tdone, int [] ends){
        S5688=1;
    S5687=0;
    S5671=0;
    if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5671=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S5666=0;
      if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5666=1;
        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5687=1;
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
        else {
          active[42]=1;
          ends[42]=1;
          tdone[42]=1;
        }
      }
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread95254(int [] tdone, int [] ends){
        S5762=1;
    S5696=0;
    thread95255(tdone,ends);
    thread95256(tdone,ends);
    int biggest95257 = 0;
    if(ends[42]>=biggest95257){
      biggest95257=ends[42];
    }
    if(ends[43]>=biggest95257){
      biggest95257=ends[43];
    }
    if(biggest95257 == 1){
      active[41]=1;
      ends[41]=1;
      tdone[41]=1;
    }
  }

  public void thread95252(int [] tdone, int [] ends){
        S5595=1;
    if((fillerReady_in.getVal() == null ? null : ((Boolean)fillerReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      fR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(fR_26);
      active[40]=1;
      ends[40]=1;
      tdone[40]=1;
    }
    else {
      S5595=0;
      active[40]=0;
      ends[40]=0;
      tdone[40]=1;
    }
  }

  public void thread95251(int [] tdone, int [] ends){
        S5589=1;
    S5588=0;
    S5572=0;
    if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5572=1;
      active[39]=1;
      ends[39]=1;
      tdone[39]=1;
    }
    else {
      S5567=0;
      if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5567=1;
        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[39]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5588=1;
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
        else {
          active[39]=1;
          ends[39]=1;
          tdone[39]=1;
        }
      }
      else {
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
      }
    }
  }

  public void thread95250(int [] tdone, int [] ends){
        S5663=1;
    S5597=0;
    thread95251(tdone,ends);
    thread95252(tdone,ends);
    int biggest95253 = 0;
    if(ends[39]>=biggest95253){
      biggest95253=ends[39];
    }
    if(ends[40]>=biggest95253){
      biggest95253=ends[40];
    }
    if(biggest95253 == 1){
      active[38]=1;
      ends[38]=1;
      tdone[38]=1;
    }
  }

  public void thread95248(int [] tdone, int [] ends){
        S5496=1;
    if((convReady_in.getVal() == null ? null : ((Boolean)convReady_in.getVal()))){//sysj\conveyor_controller.sysj line: 75, column: 9
      cvR_26.setPresent();//sysj\conveyor_controller.sysj line: 75, column: 20
      currsigs.addElement(cvR_26);
      active[37]=1;
      ends[37]=1;
      tdone[37]=1;
    }
    else {
      S5496=0;
      active[37]=0;
      ends[37]=0;
      tdone[37]=1;
    }
  }

  public void thread95247(int [] tdone, int [] ends){
        S5490=1;
    S5489=0;
    S5473=0;
    if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 73, column: 5
      convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
      S5473=1;
      active[36]=1;
      ends[36]=1;
      tdone[36]=1;
    }
    else {
      S5468=0;
      if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
        convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 73, column: 5
        S5468=1;
        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 73, column: 5
          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 73, column: 5
          ends[36]=2;
          ;//sysj\conveyor_controller.sysj line: 73, column: 5
          S5489=1;
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
        else {
          active[36]=1;
          ends[36]=1;
          tdone[36]=1;
        }
      }
      else {
        active[36]=1;
        ends[36]=1;
        tdone[36]=1;
      }
    }
  }

  public void thread95246(int [] tdone, int [] ends){
        S5564=1;
    S5498=0;
    thread95247(tdone,ends);
    thread95248(tdone,ends);
    int biggest95249 = 0;
    if(ends[36]>=biggest95249){
      biggest95249=ends[36];
    }
    if(ends[37]>=biggest95249){
      biggest95249=ends[37];
    }
    if(biggest95249 == 1){
      active[35]=1;
      ends[35]=1;
      tdone[35]=1;
    }
  }

  public void thread95245(int [] tdone, int [] ends){
        S5863=1;
    thread95246(tdone,ends);
    thread95250(tdone,ends);
    thread95254(tdone,ends);
    thread95258(tdone,ends);
    int biggest95262 = 0;
    if(ends[35]>=biggest95262){
      biggest95262=ends[35];
    }
    if(ends[38]>=biggest95262){
      biggest95262=ends[38];
    }
    if(ends[41]>=biggest95262){
      biggest95262=ends[41];
    }
    if(ends[44]>=biggest95262){
      biggest95262=ends[44];
    }
    if(biggest95262 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95262 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95262 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
    if(biggest95262 == 1){
      active[34]=1;
      ends[34]=1;
      tdone[34]=1;
    }
  }

  public void thread95243(int [] tdone, int [] ends){
        S4065=1;
    active[31]=1;
    ends[31]=1;
    tdone[31]=1;
  }

  public void thread95242(int [] tdone, int [] ends){
        S4062=1;
    active[30]=1;
    ends[30]=1;
    tdone[30]=1;
  }

  public void thread95241(int [] tdone, int [] ends){
        S4059=1;
    active[29]=1;
    ends[29]=1;
    tdone[29]=1;
  }

  public void thread95240(int [] tdone, int [] ends){
        S4056=1;
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread95239(int [] tdone, int [] ends){
        S5465=1;
    S4066=0;
    thread95240(tdone,ends);
    thread95241(tdone,ends);
    thread95242(tdone,ends);
    thread95243(tdone,ends);
    int biggest95244 = 0;
    if(ends[28]>=biggest95244){
      biggest95244=ends[28];
    }
    if(ends[29]>=biggest95244){
      biggest95244=ends[29];
    }
    if(ends[30]>=biggest95244){
      biggest95244=ends[30];
    }
    if(ends[31]>=biggest95244){
      biggest95244=ends[31];
    }
    if(biggest95244 == 1){
      active[27]=1;
      ends[27]=1;
      tdone[27]=1;
    }
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S23364){
        case 0 : 
          S23364=0;
          break RUN;
        
        case 1 : 
          S23364=2;
          S23364=2;
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          S3745=0;
          S3641=0;
          if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
            S3641=1;
            active[26]=1;
            ends[26]=1;
            break RUN;
          }
          else {
            S3636=0;
            if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
              convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
              S3636=1;
              if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                ends[26]=2;
                ;//sysj\conveyor_controller.sysj line: 240, column: 7
                S3745=1;
                S3663=0;
                if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                  S3663=1;
                  active[26]=1;
                  ends[26]=1;
                  break RUN;
                }
                else {
                  S3658=0;
                  if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3658=1;
                    if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                      ends[26]=2;
                      ;//sysj\conveyor_controller.sysj line: 241, column: 7
                      S3745=2;
                      S3752=0;
                      if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        S3752=1;
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                      else {
                        S3747=0;
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3747=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3745=3;
                            S3884=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3884=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3879=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3879=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3745=4;
                                  thread95239(tdone,ends);
                                  thread95245(tdone,ends);
                                  thread95263(tdone,ends);
                                  thread95264(tdone,ends);
                                  int biggest95268 = 0;
                                  if(ends[27]>=biggest95268){
                                    biggest95268=ends[27];
                                  }
                                  if(ends[34]>=biggest95268){
                                    biggest95268=ends[34];
                                  }
                                  if(ends[47]>=biggest95268){
                                    biggest95268=ends[47];
                                  }
                                  if(ends[48]>=biggest95268){
                                    biggest95268=ends[48];
                                  }
                                  if(biggest95268 == 1){
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                  else {
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                }
              }
              else {
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
            }
            else {
              active[26]=1;
              ends[26]=1;
              break RUN;
            }
          }
        
        case 2 : 
          cvR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          fR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          cR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          lR_26.setClear();//sysj\conveyor_controller.sysj line: 238, column: 7
          bottleAtPos5_26.setClear();//sysj\conveyor_controller.sysj line: 239, column: 7
          switch(S3745){
            case 0 : 
              switch(S3641){
                case 0 : 
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S3641=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3636){
                      case 0 : 
                        if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                          S3636=1;
                          if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                            convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 240, column: 7
                            S3745=1;
                            S3663=0;
                            if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3663=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3658=0;
                              if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                                S3658=1;
                                if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                  fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                  S3745=2;
                                  S3752=0;
                                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3752=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3747=0;
                                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S3747=1;
                                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                        S3745=3;
                                        S3884=0;
                                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3884=1;
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                        else {
                                          S3879=0;
                                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                            S3879=1;
                                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                              ends[26]=2;
                                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                              S3745=4;
                                              thread95269(tdone,ends);
                                              thread95275(tdone,ends);
                                              thread95293(tdone,ends);
                                              thread95294(tdone,ends);
                                              int biggest95298 = 0;
                                              if(ends[27]>=biggest95298){
                                                biggest95298=ends[27];
                                              }
                                              if(ends[34]>=biggest95298){
                                                biggest95298=ends[34];
                                              }
                                              if(ends[47]>=biggest95298){
                                                biggest95298=ends[47];
                                              }
                                              if(ends[48]>=biggest95298){
                                                biggest95298=ends[48];
                                              }
                                              if(biggest95298 == 1){
                                                active[26]=1;
                                                ends[26]=1;
                                                break RUN;
                                              }
                                            }
                                            else {
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                          convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 240, column: 7
                          S3745=1;
                          S3663=0;
                          if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3663=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3658=0;
                            if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3658=1;
                              if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                                fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 241, column: 7
                                S3745=2;
                                S3752=0;
                                if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3752=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3747=0;
                                  if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3747=1;
                                    if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                      capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                      S3745=3;
                                      S3884=0;
                                      if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3884=1;
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                      else {
                                        S3879=0;
                                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3879=1;
                                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                            ends[26]=2;
                                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                            S3745=4;
                                            thread95299(tdone,ends);
                                            thread95305(tdone,ends);
                                            thread95323(tdone,ends);
                                            thread95324(tdone,ends);
                                            int biggest95328 = 0;
                                            if(ends[27]>=biggest95328){
                                              biggest95328=ends[27];
                                            }
                                            if(ends[34]>=biggest95328){
                                              biggest95328=ends[34];
                                            }
                                            if(ends[47]>=biggest95328){
                                              biggest95328=ends[47];
                                            }
                                            if(ends[48]>=biggest95328){
                                              biggest95328=ends[48];
                                            }
                                            if(biggest95328 == 1){
                                              active[26]=1;
                                              ends[26]=1;
                                              break RUN;
                                            }
                                          }
                                          else {
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3641=1;
                  S3641=0;
                  if(!convReady_in.isPartnerPresent() || convReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 240, column: 7
                    convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                    S3641=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3636=0;
                    if(!convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                      convReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 240, column: 7
                      S3636=1;
                      if(convReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 240, column: 7
                        convReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 240, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 240, column: 7
                        S3745=1;
                        S3663=0;
                        if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3663=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3658=0;
                          if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3658=1;
                            if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                              fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 241, column: 7
                              S3745=2;
                              S3752=0;
                              if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3752=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3747=0;
                                if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3747=1;
                                  if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                    S3745=3;
                                    S3884=0;
                                    if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3884=1;
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                    else {
                                      S3879=0;
                                      if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3879=1;
                                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                          ends[26]=2;
                                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                          S3745=4;
                                          thread95329(tdone,ends);
                                          thread95335(tdone,ends);
                                          thread95353(tdone,ends);
                                          thread95354(tdone,ends);
                                          int biggest95358 = 0;
                                          if(ends[27]>=biggest95358){
                                            biggest95358=ends[27];
                                          }
                                          if(ends[34]>=biggest95358){
                                            biggest95358=ends[34];
                                          }
                                          if(ends[47]>=biggest95358){
                                            biggest95358=ends[47];
                                          }
                                          if(ends[48]>=biggest95358){
                                            biggest95358=ends[48];
                                          }
                                          if(biggest95358 == 1){
                                            active[26]=1;
                                            ends[26]=1;
                                            break RUN;
                                          }
                                        }
                                        else {
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S3663){
                case 0 : 
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3663=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3658){
                      case 0 : 
                        if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3658=1;
                          if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                            fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 241, column: 7
                            S3745=2;
                            S3752=0;
                            if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3752=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3747=0;
                              if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3747=1;
                                if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                  capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                  S3745=3;
                                  S3884=0;
                                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3884=1;
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                  else {
                                    S3879=0;
                                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3879=1;
                                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                        ends[26]=2;
                                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                        S3745=4;
                                        thread95359(tdone,ends);
                                        thread95365(tdone,ends);
                                        thread95383(tdone,ends);
                                        thread95384(tdone,ends);
                                        int biggest95388 = 0;
                                        if(ends[27]>=biggest95388){
                                          biggest95388=ends[27];
                                        }
                                        if(ends[34]>=biggest95388){
                                          biggest95388=ends[34];
                                        }
                                        if(ends[47]>=biggest95388){
                                          biggest95388=ends[47];
                                        }
                                        if(ends[48]>=biggest95388){
                                          biggest95388=ends[48];
                                        }
                                        if(biggest95388 == 1){
                                          active[26]=1;
                                          ends[26]=1;
                                          break RUN;
                                        }
                                      }
                                      else {
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                          fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 241, column: 7
                          S3745=2;
                          S3752=0;
                          if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3752=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3747=0;
                            if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3747=1;
                              if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                                capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 242, column: 7
                                S3745=3;
                                S3884=0;
                                if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3884=1;
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                                else {
                                  S3879=0;
                                  if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3879=1;
                                    if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                      lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                      ends[26]=2;
                                      ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                      S3745=4;
                                      thread95389(tdone,ends);
                                      thread95395(tdone,ends);
                                      thread95413(tdone,ends);
                                      thread95414(tdone,ends);
                                      int biggest95418 = 0;
                                      if(ends[27]>=biggest95418){
                                        biggest95418=ends[27];
                                      }
                                      if(ends[34]>=biggest95418){
                                        biggest95418=ends[34];
                                      }
                                      if(ends[47]>=biggest95418){
                                        biggest95418=ends[47];
                                      }
                                      if(ends[48]>=biggest95418){
                                        biggest95418=ends[48];
                                      }
                                      if(biggest95418 == 1){
                                        active[26]=1;
                                        ends[26]=1;
                                        break RUN;
                                      }
                                    }
                                    else {
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3663=1;
                  S3663=0;
                  if(!fillerReady_in.isPartnerPresent() || fillerReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 241, column: 7
                    fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                    S3663=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3658=0;
                    if(!fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                      fillerReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 241, column: 7
                      S3658=1;
                      if(fillerReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 241, column: 7
                        fillerReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 241, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 241, column: 7
                        S3745=2;
                        S3752=0;
                        if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3752=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3747=0;
                          if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3747=1;
                            if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                              capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 242, column: 7
                              S3745=3;
                              S3884=0;
                              if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3884=1;
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                              else {
                                S3879=0;
                                if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3879=1;
                                  if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                    ends[26]=2;
                                    ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                    S3745=4;
                                    thread95419(tdone,ends);
                                    thread95425(tdone,ends);
                                    thread95443(tdone,ends);
                                    thread95444(tdone,ends);
                                    int biggest95448 = 0;
                                    if(ends[27]>=biggest95448){
                                      biggest95448=ends[27];
                                    }
                                    if(ends[34]>=biggest95448){
                                      biggest95448=ends[34];
                                    }
                                    if(ends[47]>=biggest95448){
                                      biggest95448=ends[47];
                                    }
                                    if(ends[48]>=biggest95448){
                                      biggest95448=ends[48];
                                    }
                                    if(biggest95448 == 1){
                                      active[26]=1;
                                      ends[26]=1;
                                      break RUN;
                                    }
                                  }
                                  else {
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 2 : 
              switch(S3752){
                case 0 : 
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S3752=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3747){
                      case 0 : 
                        if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3747=1;
                          if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                            capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 242, column: 7
                            S3745=3;
                            S3884=0;
                            if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3884=1;
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                            else {
                              S3879=0;
                              if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3879=1;
                                if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                  lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                  ends[26]=2;
                                  ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                  S3745=4;
                                  thread95449(tdone,ends);
                                  thread95455(tdone,ends);
                                  thread95473(tdone,ends);
                                  thread95474(tdone,ends);
                                  int biggest95478 = 0;
                                  if(ends[27]>=biggest95478){
                                    biggest95478=ends[27];
                                  }
                                  if(ends[34]>=biggest95478){
                                    biggest95478=ends[34];
                                  }
                                  if(ends[47]>=biggest95478){
                                    biggest95478=ends[47];
                                  }
                                  if(ends[48]>=biggest95478){
                                    biggest95478=ends[48];
                                  }
                                  if(biggest95478 == 1){
                                    active[26]=1;
                                    ends[26]=1;
                                    break RUN;
                                  }
                                }
                                else {
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                          capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 242, column: 7
                          S3745=3;
                          S3884=0;
                          if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3884=1;
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                          else {
                            S3879=0;
                            if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3879=1;
                              if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                                lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                                ends[26]=2;
                                ;//sysj\conveyor_controller.sysj line: 243, column: 7
                                S3745=4;
                                thread95479(tdone,ends);
                                thread95485(tdone,ends);
                                thread95503(tdone,ends);
                                thread95504(tdone,ends);
                                int biggest95508 = 0;
                                if(ends[27]>=biggest95508){
                                  biggest95508=ends[27];
                                }
                                if(ends[34]>=biggest95508){
                                  biggest95508=ends[34];
                                }
                                if(ends[47]>=biggest95508){
                                  biggest95508=ends[47];
                                }
                                if(ends[48]>=biggest95508){
                                  biggest95508=ends[48];
                                }
                                if(biggest95508 == 1){
                                  active[26]=1;
                                  ends[26]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3752=1;
                  S3752=0;
                  if(!capperReady_in.isPartnerPresent() || capperReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 242, column: 7
                    capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                    S3752=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3747=0;
                    if(!capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                      capperReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 242, column: 7
                      S3747=1;
                      if(capperReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 242, column: 7
                        capperReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 242, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 242, column: 7
                        S3745=3;
                        S3884=0;
                        if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3884=1;
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                        else {
                          S3879=0;
                          if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3879=1;
                            if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                              lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                              ends[26]=2;
                              ;//sysj\conveyor_controller.sysj line: 243, column: 7
                              S3745=4;
                              thread95509(tdone,ends);
                              thread95515(tdone,ends);
                              thread95533(tdone,ends);
                              thread95534(tdone,ends);
                              int biggest95538 = 0;
                              if(ends[27]>=biggest95538){
                                biggest95538=ends[27];
                              }
                              if(ends[34]>=biggest95538){
                                biggest95538=ends[34];
                              }
                              if(ends[47]>=biggest95538){
                                biggest95538=ends[47];
                              }
                              if(ends[48]>=biggest95538){
                                biggest95538=ends[48];
                              }
                              if(biggest95538 == 1){
                                active[26]=1;
                                ends[26]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 3 : 
              switch(S3884){
                case 0 : 
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S3884=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    switch(S3879){
                      case 0 : 
                        if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3879=1;
                          if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                            lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                            ends[26]=2;
                            ;//sysj\conveyor_controller.sysj line: 243, column: 7
                            S3745=4;
                            thread95539(tdone,ends);
                            thread95545(tdone,ends);
                            thread95563(tdone,ends);
                            thread95564(tdone,ends);
                            int biggest95568 = 0;
                            if(ends[27]>=biggest95568){
                              biggest95568=ends[27];
                            }
                            if(ends[34]>=biggest95568){
                              biggest95568=ends[34];
                            }
                            if(ends[47]>=biggest95568){
                              biggest95568=ends[47];
                            }
                            if(ends[48]>=biggest95568){
                              biggest95568=ends[48];
                            }
                            if(biggest95568 == 1){
                              active[26]=1;
                              ends[26]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                          lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                          ends[26]=2;
                          ;//sysj\conveyor_controller.sysj line: 243, column: 7
                          S3745=4;
                          thread95569(tdone,ends);
                          thread95575(tdone,ends);
                          thread95593(tdone,ends);
                          thread95594(tdone,ends);
                          int biggest95598 = 0;
                          if(ends[27]>=biggest95598){
                            biggest95598=ends[27];
                          }
                          if(ends[34]>=biggest95598){
                            biggest95598=ends[34];
                          }
                          if(ends[47]>=biggest95598){
                            biggest95598=ends[47];
                          }
                          if(ends[48]>=biggest95598){
                            biggest95598=ends[48];
                          }
                          if(biggest95598 == 1){
                            active[26]=1;
                            ends[26]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S3884=1;
                  S3884=0;
                  if(!lidLoaderReady_in.isPartnerPresent() || lidLoaderReady_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 243, column: 7
                    lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                    S3884=1;
                    active[26]=1;
                    ends[26]=1;
                    break RUN;
                  }
                  else {
                    S3879=0;
                    if(!lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                      lidLoaderReady_in.setACK(true);//sysj\conveyor_controller.sysj line: 243, column: 7
                      S3879=1;
                      if(lidLoaderReady_in.isREQ()){//sysj\conveyor_controller.sysj line: 243, column: 7
                        lidLoaderReady_in.setACK(false);//sysj\conveyor_controller.sysj line: 243, column: 7
                        ends[26]=2;
                        ;//sysj\conveyor_controller.sysj line: 243, column: 7
                        S3745=4;
                        thread95599(tdone,ends);
                        thread95605(tdone,ends);
                        thread95623(tdone,ends);
                        thread95624(tdone,ends);
                        int biggest95628 = 0;
                        if(ends[27]>=biggest95628){
                          biggest95628=ends[27];
                        }
                        if(ends[34]>=biggest95628){
                          biggest95628=ends[34];
                        }
                        if(ends[47]>=biggest95628){
                          biggest95628=ends[47];
                        }
                        if(ends[48]>=biggest95628){
                          biggest95628=ends[48];
                        }
                        if(biggest95628 == 1){
                          active[26]=1;
                          ends[26]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[26]=1;
                        ends[26]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[26]=1;
                      ends[26]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 4 : 
              thread95629(tdone,ends);
              thread95657(tdone,ends);
              thread95687(tdone,ends);
              thread95688(tdone,ends);
              int biggest95695 = 0;
              if(ends[27]>=biggest95695){
                biggest95695=ends[27];
              }
              if(ends[34]>=biggest95695){
                biggest95695=ends[34];
              }
              if(ends[47]>=biggest95695){
                biggest95695=ends[47];
              }
              if(ends[48]>=biggest95695){
                biggest95695=ends[48];
              }
              if(biggest95695 == 1){
                active[26]=1;
                ends[26]=1;
                break RUN;
              }
              //FINXME code
              if(biggest95695 == 0){
                S23364=0;
                active[26]=0;
                ends[26]=0;
                S23364=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    cvR_26 = new Signal();
    fR_26 = new Signal();
    cR_26 = new Signal();
    lR_26 = new Signal();
    bottleAtPos5_26 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[26] != 0){
      int index = 26;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        if(!df){
          convReady_in.gethook();
          fillerReady_in.gethook();
          capperReady_in.gethook();
          lidLoaderReady_in.gethook();
          checkFive_in.gethook();
          checkOne_in.gethook();
          rotated_o.gethook();
          tableAlignedWithSensor.gethook();
          capOnBottleAtPos1.gethook();
          df = true;
        }
        runClockDomain();
      }
      tableAlignedWithSensor.setpreclear();
      capOnBottleAtPos1.setpreclear();
      rotaryTableTrigger.setpreclear();
      bottleAtPos5E.setpreclear();
      cvR_26.setpreclear();
      fR_26.setpreclear();
      cR_26.setpreclear();
      lR_26.setpreclear();
      bottleAtPos5_26.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = tableAlignedWithSensor.getStatus() ? tableAlignedWithSensor.setprepresent() : tableAlignedWithSensor.setpreclear();
      tableAlignedWithSensor.setpreval(tableAlignedWithSensor.getValue());
      tableAlignedWithSensor.setClear();
      dummyint = capOnBottleAtPos1.getStatus() ? capOnBottleAtPos1.setprepresent() : capOnBottleAtPos1.setpreclear();
      capOnBottleAtPos1.setpreval(capOnBottleAtPos1.getValue());
      capOnBottleAtPos1.setClear();
      rotaryTableTrigger.sethook();
      rotaryTableTrigger.setClear();
      bottleAtPos5E.sethook();
      bottleAtPos5E.setClear();
      cvR_26.setClear();
      fR_26.setClear();
      cR_26.setClear();
      lR_26.setClear();
      bottleAtPos5_26.setClear();
      convReady_in.sethook();
      fillerReady_in.sethook();
      capperReady_in.sethook();
      lidLoaderReady_in.sethook();
      checkFive_in.sethook();
      checkOne_in.sethook();
      rotated_o.sethook();
      if(paused[26]!=0 || suspended[26]!=0 || active[26]!=1);
      else{
        convReady_in.gethook();
        fillerReady_in.gethook();
        capperReady_in.gethook();
        lidLoaderReady_in.gethook();
        checkFive_in.gethook();
        checkOne_in.gethook();
        rotated_o.gethook();
        tableAlignedWithSensor.gethook();
        capOnBottleAtPos1.gethook();
      }
      runFinisher();
      if(active[26] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
