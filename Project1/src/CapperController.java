import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class CapperController extends ClockDomain{
  public CapperController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal gripperZAxisLowered = new Signal("gripperZAxisLowered", Signal.INPUT);
  public Signal gripperZAxisLifted = new Signal("gripperZAxisLifted", Signal.INPUT);
  public Signal gripperTurnHomePos = new Signal("gripperTurnHomePos", Signal.INPUT);
  public Signal gripperTurnFinalPos = new Signal("gripperTurnFinalPos", Signal.INPUT);
  public Signal cylPos5ZaxisExtend = new Signal("cylPos5ZaxisExtend", Signal.OUTPUT);
  public Signal gripperTurnRetract = new Signal("gripperTurnRetract", Signal.OUTPUT);
  public Signal gripperTurnExtend = new Signal("gripperTurnExtend", Signal.OUTPUT);
  public Signal capGripperPos5Extend = new Signal("capGripperPos5Extend", Signal.OUTPUT);
  public Signal cylClampBottleExtend = new Signal("cylClampBottleExtend", Signal.OUTPUT);
  public Signal bottleAtPos4E = new Signal("bottleAtPos4E", Signal.OUTPUT);
  public input_Channel simCapper_in = new input_Channel();
  public output_Channel capperReady_o = new output_Channel();
  private Signal bottleAtPos4_58;
  private int S38559 = 1;
  private int S38558 = 1;
  private int S32802 = 1;
  private int S32797 = 1;
  private int S34099 = 1;
  private int S32820 = 1;
  private int S32827 = 1;
  private int S32822 = 1;
  private int S32889 = 1;
  private int S32924 = 1;
  private int S32891 = 1;
  private int S32896 = 1;
  private int S32904 = 1;
  private int S32907 = 1;
  private int S32976 = 1;
  private int S32971 = 1;
  private int S33027 = 1;
  private int S34182 = 1;
  private int S34126 = 1;
  private int S34106 = 1;
  private int S34101 = 1;
  private int S34217 = 1;
  private int S34193 = 1;
  private int S34187 = 1;
  private int S34190 = 1;
  private int S34252 = 1;
  private int S34228 = 1;
  private int S34222 = 1;
  private int S34225 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread39176(int [] tdone, int [] ends){
        S34225=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread39175(int [] tdone, int [] ends){
        S34222=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread39173(int [] tdone, int [] ends){
        switch(S34225){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 568, column: 36
          ends[71]=2;
          tdone[71]=1;
        }
        else {
          active[71]=1;
          ends[71]=1;
          tdone[71]=1;
        }
        break;
      
    }
  }

  public void thread39172(int [] tdone, int [] ends){
        switch(S34222){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread39171(int [] tdone, int [] ends){
        switch(S34252){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S34228){
          case 0 : 
            thread39172(tdone,ends);
            thread39173(tdone,ends);
            int biggest39174 = 0;
            if(ends[70]>=biggest39174){
              biggest39174=ends[70];
            }
            if(ends[71]>=biggest39174){
              biggest39174=ends[71];
            }
            if(biggest39174 == 1){
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            if(biggest39174 == 2){
              ends[69]=2;
              ;//sysj\conveyor_controller.sysj line: 562, column: 19
              S34228=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            //FINXME code
            if(biggest39174 == 0){
              S34228=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
          case 1 : 
            S34228=1;
            S34228=0;
            if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
              thread39175(tdone,ends);
              thread39176(tdone,ends);
              int biggest39177 = 0;
              if(ends[70]>=biggest39177){
                biggest39177=ends[70];
              }
              if(ends[71]>=biggest39177){
                biggest39177=ends[71];
              }
              if(biggest39177 == 1){
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            else {
              S34228=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39169(int [] tdone, int [] ends){
        S34190=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread39168(int [] tdone, int [] ends){
        S34187=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread39166(int [] tdone, int [] ends){
        switch(S34190){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 549, column: 37
          ends[68]=2;
          tdone[68]=1;
        }
        else {
          active[68]=1;
          ends[68]=1;
          tdone[68]=1;
        }
        break;
      
    }
  }

  public void thread39165(int [] tdone, int [] ends){
        switch(S34187){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread39164(int [] tdone, int [] ends){
        switch(S34217){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        switch(S34193){
          case 0 : 
            thread39165(tdone,ends);
            thread39166(tdone,ends);
            int biggest39167 = 0;
            if(ends[67]>=biggest39167){
              biggest39167=ends[67];
            }
            if(ends[68]>=biggest39167){
              biggest39167=ends[68];
            }
            if(biggest39167 == 1){
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            if(biggest39167 == 2){
              ends[66]=2;
              ;//sysj\conveyor_controller.sysj line: 543, column: 20
              S34193=1;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            //FINXME code
            if(biggest39167 == 0){
              S34193=1;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
          case 1 : 
            S34193=1;
            S34193=0;
            if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
              thread39168(tdone,ends);
              thread39169(tdone,ends);
              int biggest39170 = 0;
              if(ends[67]>=biggest39170){
                biggest39170=ends[67];
              }
              if(ends[68]>=biggest39170){
                biggest39170=ends[68];
              }
              if(biggest39170 == 1){
                active[66]=1;
                ends[66]=1;
                tdone[66]=1;
              }
            }
            else {
              S34193=1;
              active[66]=1;
              ends[66]=1;
              tdone[66]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39163(int [] tdone, int [] ends){
        switch(S34182){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        switch(S34126){
          case 0 : 
            switch(S34106){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                  S34106=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
                else {
                  switch(S34101){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
                        S34101=1;
                        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                          ends[65]=2;
                          ;//sysj\conveyor_controller.sysj line: 532, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                            currsigs.addElement(bottleAtPos4_58);
                            S34126=1;
                            active[65]=1;
                            ends[65]=1;
                            tdone[65]=1;
                          }
                          else {
                            S34126=1;
                            active[65]=1;
                            ends[65]=1;
                            tdone[65]=1;
                          }
                        }
                        else {
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                      }
                      else {
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                        simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                        ends[65]=2;
                        ;//sysj\conveyor_controller.sysj line: 532, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                          bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                          currsigs.addElement(bottleAtPos4_58);
                          S34126=1;
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                        else {
                          S34126=1;
                          active[65]=1;
                          ends[65]=1;
                          tdone[65]=1;
                        }
                      }
                      else {
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S34106=1;
                S34106=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                  S34106=1;
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
                else {
                  S34101=0;
                  if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                    simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
                    S34101=1;
                    if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                      ends[65]=2;
                      ;//sysj\conveyor_controller.sysj line: 532, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                        bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                        currsigs.addElement(bottleAtPos4_58);
                        S34126=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                      else {
                        S34126=1;
                        active[65]=1;
                        ends[65]=1;
                        tdone[65]=1;
                      }
                    }
                    else {
                      active[65]=1;
                      ends[65]=1;
                      tdone[65]=1;
                    }
                  }
                  else {
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S34126=1;
            S34126=0;
            S34106=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
              simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
              S34106=1;
              active[65]=1;
              ends[65]=1;
              tdone[65]=1;
            }
            else {
              S34101=0;
              if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
                S34101=1;
                if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
                  simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
                  ends[65]=2;
                  ;//sysj\conveyor_controller.sysj line: 532, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
                    bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
                    currsigs.addElement(bottleAtPos4_58);
                    S34126=1;
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                  else {
                    S34126=1;
                    active[65]=1;
                    ends[65]=1;
                    tdone[65]=1;
                  }
                }
                else {
                  active[65]=1;
                  ends[65]=1;
                  tdone[65]=1;
                }
              }
              else {
                active[65]=1;
                ends[65]=1;
                tdone[65]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39160(int [] tdone, int [] ends){
        switch(S32907){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\conveyor_controller.sysj line: 505, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\conveyor_controller.sysj line: 506, column: 16
          ends[64]=2;
          tdone[64]=1;
        }
        else {
          active[64]=1;
          ends[64]=1;
          tdone[64]=1;
        }
        break;
      
    }
  }

  public void thread39159(int [] tdone, int [] ends){
        switch(S32904){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread39158(int [] tdone, int [] ends){
        switch(S32896){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 496, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread39156(int [] tdone, int [] ends){
        S32907=1;
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread39155(int [] tdone, int [] ends){
        S32904=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\conveyor_controller.sysj line: 500, column: 16
    gripperTurnExtend.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread39154(int [] tdone, int [] ends){
        S32896=1;
    capGripperPos5Extend.setPresent();//sysj\conveyor_controller.sysj line: 496, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread39153(int [] tdone, int [] ends){
        switch(S32924){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        switch(S32891){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\conveyor_controller.sysj line: 493, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\conveyor_controller.sysj line: 494, column: 15
              S32891=1;
              thread39154(tdone,ends);
              thread39155(tdone,ends);
              thread39156(tdone,ends);
              int biggest39157 = 0;
              if(ends[62]>=biggest39157){
                biggest39157=ends[62];
              }
              if(ends[63]>=biggest39157){
                biggest39157=ends[63];
              }
              if(ends[64]>=biggest39157){
                biggest39157=ends[64];
              }
              if(biggest39157 == 1){
                active[61]=1;
                ends[61]=1;
                tdone[61]=1;
              }
            }
            else {
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            break;
          
          case 1 : 
            thread39158(tdone,ends);
            thread39159(tdone,ends);
            thread39160(tdone,ends);
            int biggest39161 = 0;
            if(ends[62]>=biggest39161){
              biggest39161=ends[62];
            }
            if(ends[63]>=biggest39161){
              biggest39161=ends[63];
            }
            if(ends[64]>=biggest39161){
              biggest39161=ends[64];
            }
            if(biggest39161 == 1){
              active[61]=1;
              ends[61]=1;
              tdone[61]=1;
            }
            if(biggest39161 == 2){
              ends[61]=2;
              tdone[61]=1;
            }
            //FINXME code
            if(biggest39161 == 0){
              S32924=0;
              active[61]=0;
              ends[61]=0;
              tdone[61]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39152(int [] tdone, int [] ends){
        switch(S32889){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread39150(int [] tdone, int [] ends){
        S32924=1;
    S32891=0;
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread39149(int [] tdone, int [] ends){
        S32889=1;
    cylPos5ZaxisExtend.setPresent();//sysj\conveyor_controller.sysj line: 489, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread39148(int [] tdone, int [] ends){
        switch(S34099){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        switch(S32820){
          case 0 : 
            if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 19
              S32820=1;
              S32827=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 469, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                S32827=1;
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
              else {
                S32822=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 469, column: 13
                  S32822=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                    ends[59]=2;
                    ;//sysj\conveyor_controller.sysj line: 469, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                    S32820=2;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
              }
            }
            else {
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 1 : 
            switch(S32827){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 469, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                  S32827=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  switch(S32822){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 469, column: 13
                        S32822=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 469, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                          S32820=2;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                        ends[59]=2;
                        ;//sysj\conveyor_controller.sysj line: 469, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                        S32820=2;
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S32827=1;
                S32827=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 469, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                  S32827=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  S32822=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 469, column: 13
                    S32822=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 469, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 469, column: 13
                      ends[59]=2;
                      ;//sysj\conveyor_controller.sysj line: 469, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\conveyor_controller.sysj line: 470, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\conveyor_controller.sysj line: 471, column: 13
                      S32820=2;
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                    else {
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 472, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\conveyor_controller.sysj line: 476, column: 13
              S32820=3;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            else {
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 3 : 
            S32820=3;
            S32820=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\conveyor_controller.sysj line: 482, column: 14
            gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[59]=1;
            ends[59]=1;
            tdone[59]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\conveyor_controller.sysj line: 480, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\conveyor_controller.sysj line: 485, column: 13
              S32820=5;
              thread39149(tdone,ends);
              thread39150(tdone,ends);
              int biggest39151 = 0;
              if(ends[60]>=biggest39151){
                biggest39151=ends[60];
              }
              if(ends[61]>=biggest39151){
                biggest39151=ends[61];
              }
              if(biggest39151 == 1){
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 5 : 
            thread39152(tdone,ends);
            thread39153(tdone,ends);
            int biggest39162 = 0;
            if(ends[60]>=biggest39162){
              biggest39162=ends[60];
            }
            if(ends[61]>=biggest39162){
              biggest39162=ends[61];
            }
            if(biggest39162 == 1){
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            if(biggest39162 == 2){
              ends[59]=2;
              ;//sysj\conveyor_controller.sysj line: 488, column: 13
              S32820=6;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            //FINXME code
            if(biggest39162 == 0){
              S32820=6;
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\conveyor_controller.sysj line: 512, column: 19
              S32820=7;
              S32976=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 514, column: 13
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                S32976=1;
                active[59]=1;
                ends[59]=1;
                tdone[59]=1;
              }
              else {
                S32971=0;
                if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 514, column: 13
                  S32971=1;
                  if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                    ends[59]=2;
                    ;//sysj\conveyor_controller.sysj line: 514, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                    S32820=8;
                    S33027=0;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
              }
            }
            else {
              active[59]=1;
              ends[59]=1;
              tdone[59]=1;
            }
            break;
          
          case 7 : 
            switch(S32976){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 514, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                  S32976=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  switch(S32971){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 514, column: 13
                        S32971=1;
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                          ends[59]=2;
                          ;//sysj\conveyor_controller.sysj line: 514, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                          S32820=8;
                          S33027=0;
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                        else {
                          active[59]=1;
                          ends[59]=1;
                          tdone[59]=1;
                        }
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                        ends[59]=2;
                        ;//sysj\conveyor_controller.sysj line: 514, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                        S32820=8;
                        S33027=0;
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      else {
                        active[59]=1;
                        ends[59]=1;
                        tdone[59]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S32976=1;
                S32976=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 514, column: 13
                  capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                  S32976=1;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  S32971=0;
                  if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 514, column: 13
                    S32971=1;
                    if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 514, column: 13
                      capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 514, column: 13
                      ends[59]=2;
                      ;//sysj\conveyor_controller.sysj line: 514, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\conveyor_controller.sysj line: 515, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\conveyor_controller.sysj line: 516, column: 13
                      S32820=8;
                      S33027=0;
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                    else {
                      active[59]=1;
                      ends[59]=1;
                      tdone[59]=1;
                    }
                  }
                  else {
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S33027){
              case 0 : 
                if(!bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 517, column: 29
                  S33027=1;
                  if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 519, column: 23
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                  else {
                    ends[59]=2;
                    ;//sysj\conveyor_controller.sysj line: 517, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
                    S32820=0;
                    active[59]=1;
                    ends[59]=1;
                    tdone[59]=1;
                  }
                }
                else {
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 519, column: 23
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                else {
                  ends[59]=2;
                  ;//sysj\conveyor_controller.sysj line: 517, column: 13
                  System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
                  S32820=0;
                  active[59]=1;
                  ends[59]=1;
                  tdone[59]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39145(int [] tdone, int [] ends){
        S34225=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread39144(int [] tdone, int [] ends){
        S34222=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread39143(int [] tdone, int [] ends){
        S34252=1;
    S34228=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread39144(tdone,ends);
      thread39145(tdone,ends);
      int biggest39146 = 0;
      if(ends[70]>=biggest39146){
        biggest39146=ends[70];
      }
      if(ends[71]>=biggest39146){
        biggest39146=ends[71];
      }
      if(biggest39146 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S34228=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread39141(int [] tdone, int [] ends){
        S34190=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread39140(int [] tdone, int [] ends){
        S34187=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread39139(int [] tdone, int [] ends){
        S34217=1;
    S34193=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread39140(tdone,ends);
      thread39141(tdone,ends);
      int biggest39142 = 0;
      if(ends[67]>=biggest39142){
        biggest39142=ends[67];
      }
      if(ends[68]>=biggest39142){
        biggest39142=ends[68];
      }
      if(biggest39142 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S34193=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread39138(int [] tdone, int [] ends){
        S34182=1;
    S34126=0;
    S34106=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S34106=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S34101=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S34101=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread39137(int [] tdone, int [] ends){
        S34099=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32820=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread39134(int [] tdone, int [] ends){
        S34225=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread39133(int [] tdone, int [] ends){
        S34222=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread39132(int [] tdone, int [] ends){
        S34252=1;
    S34228=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread39133(tdone,ends);
      thread39134(tdone,ends);
      int biggest39135 = 0;
      if(ends[70]>=biggest39135){
        biggest39135=ends[70];
      }
      if(ends[71]>=biggest39135){
        biggest39135=ends[71];
      }
      if(biggest39135 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S34228=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread39130(int [] tdone, int [] ends){
        S34190=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread39129(int [] tdone, int [] ends){
        S34187=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread39128(int [] tdone, int [] ends){
        S34217=1;
    S34193=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread39129(tdone,ends);
      thread39130(tdone,ends);
      int biggest39131 = 0;
      if(ends[67]>=biggest39131){
        biggest39131=ends[67];
      }
      if(ends[68]>=biggest39131){
        biggest39131=ends[68];
      }
      if(biggest39131 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S34193=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread39127(int [] tdone, int [] ends){
        S34182=1;
    S34126=0;
    S34106=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S34106=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S34101=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S34101=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread39126(int [] tdone, int [] ends){
        S34099=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32820=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread39123(int [] tdone, int [] ends){
        S34225=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread39122(int [] tdone, int [] ends){
        S34222=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread39121(int [] tdone, int [] ends){
        S34252=1;
    S34228=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread39122(tdone,ends);
      thread39123(tdone,ends);
      int biggest39124 = 0;
      if(ends[70]>=biggest39124){
        biggest39124=ends[70];
      }
      if(ends[71]>=biggest39124){
        biggest39124=ends[71];
      }
      if(biggest39124 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S34228=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread39119(int [] tdone, int [] ends){
        S34190=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread39118(int [] tdone, int [] ends){
        S34187=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread39117(int [] tdone, int [] ends){
        S34217=1;
    S34193=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread39118(tdone,ends);
      thread39119(tdone,ends);
      int biggest39120 = 0;
      if(ends[67]>=biggest39120){
        biggest39120=ends[67];
      }
      if(ends[68]>=biggest39120){
        biggest39120=ends[68];
      }
      if(biggest39120 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S34193=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread39116(int [] tdone, int [] ends){
        S34182=1;
    S34126=0;
    S34106=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S34106=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S34101=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S34101=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread39115(int [] tdone, int [] ends){
        S34099=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32820=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread39112(int [] tdone, int [] ends){
        S34225=1;
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread39111(int [] tdone, int [] ends){
        S34222=1;
    bottleAtPos4E.setPresent();//sysj\conveyor_controller.sysj line: 564, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread39110(int [] tdone, int [] ends){
        S34252=1;
    S34228=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 561, column: 27
      thread39111(tdone,ends);
      thread39112(tdone,ends);
      int biggest39113 = 0;
      if(ends[70]>=biggest39113){
        biggest39113=ends[70];
      }
      if(ends[71]>=biggest39113){
        biggest39113=ends[71];
      }
      if(biggest39113 == 1){
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
    else {
      S34228=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
  }

  public void thread39108(int [] tdone, int [] ends){
        S34190=1;
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread39107(int [] tdone, int [] ends){
        S34187=1;
    cylClampBottleExtend.setPresent();//sysj\conveyor_controller.sysj line: 545, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread39106(int [] tdone, int [] ends){
        S34217=1;
    S34193=0;
    if(bottleAtPos4_58.getprestatus()){//sysj\conveyor_controller.sysj line: 542, column: 39
      thread39107(tdone,ends);
      thread39108(tdone,ends);
      int biggest39109 = 0;
      if(ends[67]>=biggest39109){
        biggest39109=ends[67];
      }
      if(ends[68]>=biggest39109){
        biggest39109=ends[68];
      }
      if(biggest39109 == 1){
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
      }
    }
    else {
      S34193=1;
      active[66]=1;
      ends[66]=1;
      tdone[66]=1;
    }
  }

  public void thread39105(int [] tdone, int [] ends){
        S34182=1;
    S34126=0;
    S34106=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 532, column: 13
      simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
      S34106=1;
      active[65]=1;
      ends[65]=1;
      tdone[65]=1;
    }
    else {
      S34101=0;
      if(!simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
        simCapper_in.setACK(true);//sysj\conveyor_controller.sysj line: 532, column: 13
        S34101=1;
        if(simCapper_in.isREQ()){//sysj\conveyor_controller.sysj line: 532, column: 13
          simCapper_in.setACK(false);//sysj\conveyor_controller.sysj line: 532, column: 13
          ends[65]=2;
          ;//sysj\conveyor_controller.sysj line: 532, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\conveyor_controller.sysj line: 533, column: 16
            bottleAtPos4_58.setPresent();//sysj\conveyor_controller.sysj line: 534, column: 14
            currsigs.addElement(bottleAtPos4_58);
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
          else {
            S34126=1;
            active[65]=1;
            ends[65]=1;
            tdone[65]=1;
          }
        }
        else {
          active[65]=1;
          ends[65]=1;
          tdone[65]=1;
        }
      }
      else {
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
      }
    }
  }

  public void thread39104(int [] tdone, int [] ends){
        S34099=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\conveyor_controller.sysj line: 467, column: 13
    S32820=0;
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S38559){
        case 0 : 
          S38559=0;
          break RUN;
        
        case 1 : 
          S38559=2;
          S38559=2;
          bottleAtPos4_58.setClear();//sysj\conveyor_controller.sysj line: 461, column: 11
          S38558=0;
          S32802=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 462, column: 11
            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
            S32802=1;
            active[58]=1;
            ends[58]=1;
            break RUN;
          }
          else {
            S32797=0;
            if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 462, column: 11
              S32797=1;
              if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                ends[58]=2;
                ;//sysj\conveyor_controller.sysj line: 462, column: 11
                S38558=1;
                thread39104(tdone,ends);
                thread39105(tdone,ends);
                thread39106(tdone,ends);
                thread39110(tdone,ends);
                int biggest39114 = 0;
                if(ends[59]>=biggest39114){
                  biggest39114=ends[59];
                }
                if(ends[65]>=biggest39114){
                  biggest39114=ends[65];
                }
                if(ends[66]>=biggest39114){
                  biggest39114=ends[66];
                }
                if(ends[69]>=biggest39114){
                  biggest39114=ends[69];
                }
                if(biggest39114 == 1){
                  active[58]=1;
                  ends[58]=1;
                  break RUN;
                }
              }
              else {
                active[58]=1;
                ends[58]=1;
                break RUN;
              }
            }
            else {
              active[58]=1;
              ends[58]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_58.setClear();//sysj\conveyor_controller.sysj line: 461, column: 11
          switch(S38558){
            case 0 : 
              switch(S32802){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 462, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                    S32802=1;
                    active[58]=1;
                    ends[58]=1;
                    break RUN;
                  }
                  else {
                    switch(S32797){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 462, column: 11
                          S32797=1;
                          if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                            capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                            ends[58]=2;
                            ;//sysj\conveyor_controller.sysj line: 462, column: 11
                            S38558=1;
                            thread39115(tdone,ends);
                            thread39116(tdone,ends);
                            thread39117(tdone,ends);
                            thread39121(tdone,ends);
                            int biggest39125 = 0;
                            if(ends[59]>=biggest39125){
                              biggest39125=ends[59];
                            }
                            if(ends[65]>=biggest39125){
                              biggest39125=ends[65];
                            }
                            if(ends[66]>=biggest39125){
                              biggest39125=ends[66];
                            }
                            if(ends[69]>=biggest39125){
                              biggest39125=ends[69];
                            }
                            if(biggest39125 == 1){
                              active[58]=1;
                              ends[58]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[58]=1;
                            ends[58]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                          capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                          ends[58]=2;
                          ;//sysj\conveyor_controller.sysj line: 462, column: 11
                          S38558=1;
                          thread39126(tdone,ends);
                          thread39127(tdone,ends);
                          thread39128(tdone,ends);
                          thread39132(tdone,ends);
                          int biggest39136 = 0;
                          if(ends[59]>=biggest39136){
                            biggest39136=ends[59];
                          }
                          if(ends[65]>=biggest39136){
                            biggest39136=ends[65];
                          }
                          if(ends[66]>=biggest39136){
                            biggest39136=ends[66];
                          }
                          if(ends[69]>=biggest39136){
                            biggest39136=ends[69];
                          }
                          if(biggest39136 == 1){
                            active[58]=1;
                            ends[58]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[58]=1;
                          ends[58]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S32802=1;
                  S32802=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 462, column: 11
                    capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                    S32802=1;
                    active[58]=1;
                    ends[58]=1;
                    break RUN;
                  }
                  else {
                    S32797=0;
                    if(capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 462, column: 11
                      S32797=1;
                      if(!capperReady_o.isACK()){//sysj\conveyor_controller.sysj line: 462, column: 11
                        capperReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 462, column: 11
                        ends[58]=2;
                        ;//sysj\conveyor_controller.sysj line: 462, column: 11
                        S38558=1;
                        thread39137(tdone,ends);
                        thread39138(tdone,ends);
                        thread39139(tdone,ends);
                        thread39143(tdone,ends);
                        int biggest39147 = 0;
                        if(ends[59]>=biggest39147){
                          biggest39147=ends[59];
                        }
                        if(ends[65]>=biggest39147){
                          biggest39147=ends[65];
                        }
                        if(ends[66]>=biggest39147){
                          biggest39147=ends[66];
                        }
                        if(ends[69]>=biggest39147){
                          biggest39147=ends[69];
                        }
                        if(biggest39147 == 1){
                          active[58]=1;
                          ends[58]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[58]=1;
                        ends[58]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[58]=1;
                      ends[58]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread39148(tdone,ends);
              thread39163(tdone,ends);
              thread39164(tdone,ends);
              thread39171(tdone,ends);
              int biggest39178 = 0;
              if(ends[59]>=biggest39178){
                biggest39178=ends[59];
              }
              if(ends[65]>=biggest39178){
                biggest39178=ends[65];
              }
              if(ends[66]>=biggest39178){
                biggest39178=ends[66];
              }
              if(ends[69]>=biggest39178){
                biggest39178=ends[69];
              }
              if(biggest39178 == 1){
                active[58]=1;
                ends[58]=1;
                break RUN;
              }
              //FINXME code
              if(biggest39178 == 0){
                S38559=0;
                active[58]=0;
                ends[58]=0;
                S38559=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_58 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[58] != 0){
      int index = 58;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[58]!=0 || suspended[58]!=0 || active[58]!=1);
      else{
        if(!df){
          simCapper_in.gethook();
          capperReady_o.gethook();
          gripperZAxisLowered.gethook();
          gripperZAxisLifted.gethook();
          gripperTurnHomePos.gethook();
          gripperTurnFinalPos.gethook();
          df = true;
        }
        runClockDomain();
      }
      gripperZAxisLowered.setpreclear();
      gripperZAxisLifted.setpreclear();
      gripperTurnHomePos.setpreclear();
      gripperTurnFinalPos.setpreclear();
      cylPos5ZaxisExtend.setpreclear();
      gripperTurnRetract.setpreclear();
      gripperTurnExtend.setpreclear();
      capGripperPos5Extend.setpreclear();
      cylClampBottleExtend.setpreclear();
      bottleAtPos4E.setpreclear();
      bottleAtPos4_58.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = gripperZAxisLowered.getStatus() ? gripperZAxisLowered.setprepresent() : gripperZAxisLowered.setpreclear();
      gripperZAxisLowered.setpreval(gripperZAxisLowered.getValue());
      gripperZAxisLowered.setClear();
      dummyint = gripperZAxisLifted.getStatus() ? gripperZAxisLifted.setprepresent() : gripperZAxisLifted.setpreclear();
      gripperZAxisLifted.setpreval(gripperZAxisLifted.getValue());
      gripperZAxisLifted.setClear();
      dummyint = gripperTurnHomePos.getStatus() ? gripperTurnHomePos.setprepresent() : gripperTurnHomePos.setpreclear();
      gripperTurnHomePos.setpreval(gripperTurnHomePos.getValue());
      gripperTurnHomePos.setClear();
      dummyint = gripperTurnFinalPos.getStatus() ? gripperTurnFinalPos.setprepresent() : gripperTurnFinalPos.setpreclear();
      gripperTurnFinalPos.setpreval(gripperTurnFinalPos.getValue());
      gripperTurnFinalPos.setClear();
      cylPos5ZaxisExtend.sethook();
      cylPos5ZaxisExtend.setClear();
      gripperTurnRetract.sethook();
      gripperTurnRetract.setClear();
      gripperTurnExtend.sethook();
      gripperTurnExtend.setClear();
      capGripperPos5Extend.sethook();
      capGripperPos5Extend.setClear();
      cylClampBottleExtend.sethook();
      cylClampBottleExtend.setClear();
      bottleAtPos4E.sethook();
      bottleAtPos4E.setClear();
      bottleAtPos4_58.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[58]!=0 || suspended[58]!=0 || active[58]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[58] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
