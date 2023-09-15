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
  private Signal bottleAtPos4_1;
  private Signal done_1;
  private int S5765 = 1;
  private int S5764 = 1;
  private int S8 = 1;
  private int S3 = 1;
  private int S1305 = 1;
  private int S26 = 1;
  private int S33 = 1;
  private int S28 = 1;
  private int S95 = 1;
  private int S130 = 1;
  private int S97 = 1;
  private int S102 = 1;
  private int S110 = 1;
  private int S113 = 1;
  private int S182 = 1;
  private int S177 = 1;
  private int S233 = 1;
  private int S222 = 1;
  private int S1388 = 1;
  private int S1332 = 1;
  private int S1312 = 1;
  private int S1307 = 1;
  private int S1423 = 1;
  private int S1399 = 1;
  private int S1393 = 1;
  private int S1396 = 1;
  private int S1458 = 1;
  private int S1434 = 1;
  private int S1428 = 1;
  private int S1431 = 1;
  
  private int[] ends = new int[32];
  private int[] tdone = new int[32];
  
  public void thread6215(int [] tdone, int [] ends){
        S1431=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread6214(int [] tdone, int [] ends){
        S1428=1;
    bottleAtPos4E.setPresent();//sysj\capper.sysj line: 123, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread6212(int [] tdone, int [] ends){
        switch(S1431){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(done_1.getprestatus()){//sysj\capper.sysj line: 127, column: 36
          ends[14]=2;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread6211(int [] tdone, int [] ends){
        switch(S1428){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        bottleAtPos4E.setPresent();//sysj\capper.sysj line: 123, column: 30
        currsigs.addElement(bottleAtPos4E);
        active[13]=1;
        ends[13]=1;
        tdone[13]=1;
        break;
      
    }
  }

  public void thread6210(int [] tdone, int [] ends){
        switch(S1458){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        switch(S1434){
          case 0 : 
            thread6211(tdone,ends);
            thread6212(tdone,ends);
            int biggest6213 = 0;
            if(ends[13]>=biggest6213){
              biggest6213=ends[13];
            }
            if(ends[14]>=biggest6213){
              biggest6213=ends[14];
            }
            if(biggest6213 == 1){
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            if(biggest6213 == 2){
              ends[12]=2;
              ;//sysj\capper.sysj line: 121, column: 19
              S1434=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            //FINXME code
            if(biggest6213 == 0){
              S1434=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
          case 1 : 
            S1434=1;
            S1434=0;
            if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 120, column: 27
              thread6214(tdone,ends);
              thread6215(tdone,ends);
              int biggest6216 = 0;
              if(ends[13]>=biggest6216){
                biggest6216=ends[13];
              }
              if(ends[14]>=biggest6216){
                biggest6216=ends[14];
              }
              if(biggest6216 == 1){
                active[12]=1;
                ends[12]=1;
                tdone[12]=1;
              }
            }
            else {
              S1434=1;
              active[12]=1;
              ends[12]=1;
              tdone[12]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6208(int [] tdone, int [] ends){
        S1396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6207(int [] tdone, int [] ends){
        S1393=1;
    cylClampBottleExtend.setPresent();//sysj\capper.sysj line: 104, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6205(int [] tdone, int [] ends){
        switch(S1396){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper.sysj line: 108, column: 37
          ends[11]=2;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread6204(int [] tdone, int [] ends){
        switch(S1393){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        cylClampBottleExtend.setPresent();//sysj\capper.sysj line: 104, column: 31
        currsigs.addElement(cylClampBottleExtend);
        active[10]=1;
        ends[10]=1;
        tdone[10]=1;
        break;
      
    }
  }

  public void thread6203(int [] tdone, int [] ends){
        switch(S1423){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        switch(S1399){
          case 0 : 
            thread6204(tdone,ends);
            thread6205(tdone,ends);
            int biggest6206 = 0;
            if(ends[10]>=biggest6206){
              biggest6206=ends[10];
            }
            if(ends[11]>=biggest6206){
              biggest6206=ends[11];
            }
            if(biggest6206 == 1){
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            if(biggest6206 == 2){
              ends[9]=2;
              ;//sysj\capper.sysj line: 102, column: 20
              S1399=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            //FINXME code
            if(biggest6206 == 0){
              S1399=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
          case 1 : 
            S1399=1;
            S1399=0;
            if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 101, column: 39
              thread6207(tdone,ends);
              thread6208(tdone,ends);
              int biggest6209 = 0;
              if(ends[10]>=biggest6209){
                biggest6209=ends[10];
              }
              if(ends[11]>=biggest6209){
                biggest6209=ends[11];
              }
              if(biggest6209 == 1){
                active[9]=1;
                ends[9]=1;
                tdone[9]=1;
              }
            }
            else {
              S1399=1;
              active[9]=1;
              ends[9]=1;
              tdone[9]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6202(int [] tdone, int [] ends){
        switch(S1388){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S1332){
          case 0 : 
            switch(S1312){
              case 0 : 
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
                  simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
                  S1312=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  switch(S1307){
                    case 0 : 
                      if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                        simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
                        S1307=1;
                        if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                          simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
                          ends[8]=2;
                          ;//sysj\capper.sysj line: 88, column: 13
                          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
                            bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
                            currsigs.addElement(bottleAtPos4_1);
                            S1332=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                          else {
                            done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
                            currsigs.addElement(done_1);
                            S1332=1;
                            active[8]=1;
                            ends[8]=1;
                            tdone[8]=1;
                          }
                        }
                        else {
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                        simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
                        ends[8]=2;
                        ;//sysj\capper.sysj line: 88, column: 13
                        if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
                          bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
                          currsigs.addElement(bottleAtPos4_1);
                          S1332=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                        else {
                          done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
                          currsigs.addElement(done_1);
                          S1332=1;
                          active[8]=1;
                          ends[8]=1;
                          tdone[8]=1;
                        }
                      }
                      else {
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1312=1;
                S1312=0;
                if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
                  simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
                  S1312=1;
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
                else {
                  S1307=0;
                  if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                    simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
                    S1307=1;
                    if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                      simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
                      ends[8]=2;
                      ;//sysj\capper.sysj line: 88, column: 13
                      if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
                        bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
                        currsigs.addElement(bottleAtPos4_1);
                        S1332=1;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                      else {
                        done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
                        currsigs.addElement(done_1);
                        S1332=1;
                        active[8]=1;
                        ends[8]=1;
                        tdone[8]=1;
                      }
                    }
                    else {
                      active[8]=1;
                      ends[8]=1;
                      tdone[8]=1;
                    }
                  }
                  else {
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S1332=1;
            S1332=0;
            S1312=0;
            if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
              simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
              S1312=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              S1307=0;
              if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
                S1307=1;
                if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
                  simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
                  ends[8]=2;
                  ;//sysj\capper.sysj line: 88, column: 13
                  if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
                    bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
                    currsigs.addElement(bottleAtPos4_1);
                    S1332=1;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                  else {
                    done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
                    currsigs.addElement(done_1);
                    S1332=1;
                    active[8]=1;
                    ends[8]=1;
                    tdone[8]=1;
                  }
                }
                else {
                  active[8]=1;
                  ends[8]=1;
                  tdone[8]=1;
                }
              }
              else {
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6199(int [] tdone, int [] ends){
        switch(S113){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(gripperTurnFinalPos.getprestatus()){//sysj\capper.sysj line: 58, column: 22
          System.out.println("Capper: Gripper fully turned.");//sysj\capper.sysj line: 59, column: 16
          ends[7]=2;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread6198(int [] tdone, int [] ends){
        switch(S110){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        gripperTurnExtend.setPresent();//sysj\capper.sysj line: 54, column: 16
        currsigs.addElement(gripperTurnExtend);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread6197(int [] tdone, int [] ends){
        switch(S102){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        capGripperPos5Extend.setPresent();//sysj\capper.sysj line: 49, column: 16
        currsigs.addElement(capGripperPos5Extend);
        active[5]=1;
        ends[5]=1;
        tdone[5]=1;
        break;
      
    }
  }

  public void thread6195(int [] tdone, int [] ends){
        S113=1;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread6194(int [] tdone, int [] ends){
        S110=1;
    System.out.println("Capper: Twisting the gripper...");//sysj\capper.sysj line: 53, column: 16
    gripperTurnExtend.setPresent();//sysj\capper.sysj line: 54, column: 16
    currsigs.addElement(gripperTurnExtend);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread6193(int [] tdone, int [] ends){
        S102=1;
    capGripperPos5Extend.setPresent();//sysj\capper.sysj line: 49, column: 16
    currsigs.addElement(capGripperPos5Extend);
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread6192(int [] tdone, int [] ends){
        switch(S130){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S97){
          case 0 : 
            if(gripperZAxisLowered.getprestatus()){//sysj\capper.sysj line: 46, column: 21
              System.out.println("Capper: Gripper fully lowered. Gripping the cap...");//sysj\capper.sysj line: 47, column: 15
              S97=1;
              thread6193(tdone,ends);
              thread6194(tdone,ends);
              thread6195(tdone,ends);
              int biggest6196 = 0;
              if(ends[5]>=biggest6196){
                biggest6196=ends[5];
              }
              if(ends[6]>=biggest6196){
                biggest6196=ends[6];
              }
              if(ends[7]>=biggest6196){
                biggest6196=ends[7];
              }
              if(biggest6196 == 1){
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            thread6197(tdone,ends);
            thread6198(tdone,ends);
            thread6199(tdone,ends);
            int biggest6200 = 0;
            if(ends[5]>=biggest6200){
              biggest6200=ends[5];
            }
            if(ends[6]>=biggest6200){
              biggest6200=ends[6];
            }
            if(ends[7]>=biggest6200){
              biggest6200=ends[7];
            }
            if(biggest6200 == 1){
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            if(biggest6200 == 2){
              ends[4]=2;
              tdone[4]=1;
            }
            //FINXME code
            if(biggest6200 == 0){
              S130=0;
              active[4]=0;
              ends[4]=0;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6191(int [] tdone, int [] ends){
        switch(S95){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        cylPos5ZaxisExtend.setPresent();//sysj\capper.sysj line: 42, column: 15
        currsigs.addElement(cylPos5ZaxisExtend);
        active[3]=1;
        ends[3]=1;
        tdone[3]=1;
        break;
      
    }
  }

  public void thread6189(int [] tdone, int [] ends){
        S130=1;
    S97=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread6188(int [] tdone, int [] ends){
        S95=1;
    cylPos5ZaxisExtend.setPresent();//sysj\capper.sysj line: 42, column: 15
    currsigs.addElement(cylPos5ZaxisExtend);
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread6187(int [] tdone, int [] ends){
        switch(S1305){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S26){
          case 0 : 
            if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 21, column: 19
              S26=1;
              S33=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 22, column: 13
                capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                S33=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S28=0;
                if(capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                  capperReady_o.setVal(Boolean.FALSE);//sysj\capper.sysj line: 22, column: 13
                  S28=1;
                  if(!capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                    capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                    ends[2]=2;
                    ;//sysj\capper.sysj line: 22, column: 13
                    System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\capper.sysj line: 23, column: 13
                    System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\capper.sysj line: 24, column: 13
                    S26=2;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 1 : 
            switch(S33){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 22, column: 13
                  capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                  S33=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S28){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                        capperReady_o.setVal(Boolean.FALSE);//sysj\capper.sysj line: 22, column: 13
                        S28=1;
                        if(!capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                          capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                          ends[2]=2;
                          ;//sysj\capper.sysj line: 22, column: 13
                          System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\capper.sysj line: 23, column: 13
                          System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\capper.sysj line: 24, column: 13
                          S26=2;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                        capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                        ends[2]=2;
                        ;//sysj\capper.sysj line: 22, column: 13
                        System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\capper.sysj line: 23, column: 13
                        System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\capper.sysj line: 24, column: 13
                        S26=2;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S33=1;
                S33=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 22, column: 13
                  capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                  S33=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S28=0;
                  if(capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                    capperReady_o.setVal(Boolean.FALSE);//sysj\capper.sysj line: 22, column: 13
                    S28=1;
                    if(!capperReady_o.isACK()){//sysj\capper.sysj line: 22, column: 13
                      capperReady_o.setREQ(false);//sysj\capper.sysj line: 22, column: 13
                      ends[2]=2;
                      ;//sysj\capper.sysj line: 22, column: 13
                      System.out.println("*Capper: Bottle Arivied at Position 4.*");//sysj\capper.sysj line: 23, column: 13
                      System.out.println("Capper: Checking if gripper is fully lifted...");//sysj\capper.sysj line: 24, column: 13
                      S26=2;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\capper.sysj line: 25, column: 19
              System.out.println("Capper: Gripper is lifted.");//sysj\capper.sysj line: 29, column: 13
              S26=3;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 3 : 
            S26=3;
            S26=4;
            System.out.println("Capper: Untwisting the gripper...");//sysj\capper.sysj line: 35, column: 14
            gripperTurnRetract.setPresent();//sysj\capper.sysj line: 36, column: 14
            currsigs.addElement(gripperTurnRetract);
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 4 : 
            if(gripperTurnHomePos.getprestatus()){//sysj\capper.sysj line: 33, column: 19
              System.out.println("Capper: Gripper at home position...");//sysj\capper.sysj line: 38, column: 13
              S26=5;
              thread6188(tdone,ends);
              thread6189(tdone,ends);
              int biggest6190 = 0;
              if(ends[3]>=biggest6190){
                biggest6190=ends[3];
              }
              if(ends[4]>=biggest6190){
                biggest6190=ends[4];
              }
              if(biggest6190 == 1){
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              gripperTurnRetract.setPresent();//sysj\capper.sysj line: 36, column: 14
              currsigs.addElement(gripperTurnRetract);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 5 : 
            thread6191(tdone,ends);
            thread6192(tdone,ends);
            int biggest6201 = 0;
            if(ends[3]>=biggest6201){
              biggest6201=ends[3];
            }
            if(ends[4]>=biggest6201){
              biggest6201=ends[4];
            }
            if(biggest6201 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest6201 == 2){
              ends[2]=2;
              ;//sysj\capper.sysj line: 41, column: 13
              S26=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest6201 == 0){
              S26=6;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 6 : 
            if(gripperZAxisLifted.getprestatus()){//sysj\capper.sysj line: 65, column: 19
              S26=7;
              S182=0;
              if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 67, column: 13
                capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                S182=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S177=0;
                if(capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                  capperReady_o.setVal(Boolean.TRUE);//sysj\capper.sysj line: 67, column: 13
                  S177=1;
                  if(!capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                    capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                    ends[2]=2;
                    ;//sysj\capper.sysj line: 67, column: 13
                    System.out.println("CapperController: Gripper raised...");//sysj\capper.sysj line: 68, column: 13
                    System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\capper.sysj line: 69, column: 13
                    S26=8;
                    S233=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 7 : 
            switch(S182){
              case 0 : 
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 67, column: 13
                  capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                  S182=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S177){
                    case 0 : 
                      if(capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                        capperReady_o.setVal(Boolean.TRUE);//sysj\capper.sysj line: 67, column: 13
                        S177=1;
                        if(!capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                          capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                          ends[2]=2;
                          ;//sysj\capper.sysj line: 67, column: 13
                          System.out.println("CapperController: Gripper raised...");//sysj\capper.sysj line: 68, column: 13
                          System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\capper.sysj line: 69, column: 13
                          S26=8;
                          S233=0;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                        capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                        ends[2]=2;
                        ;//sysj\capper.sysj line: 67, column: 13
                        System.out.println("CapperController: Gripper raised...");//sysj\capper.sysj line: 68, column: 13
                        System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\capper.sysj line: 69, column: 13
                        S26=8;
                        S233=0;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S182=1;
                S182=0;
                if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 67, column: 13
                  capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                  S182=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S177=0;
                  if(capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                    capperReady_o.setVal(Boolean.TRUE);//sysj\capper.sysj line: 67, column: 13
                    S177=1;
                    if(!capperReady_o.isACK()){//sysj\capper.sysj line: 67, column: 13
                      capperReady_o.setREQ(false);//sysj\capper.sysj line: 67, column: 13
                      ends[2]=2;
                      ;//sysj\capper.sysj line: 67, column: 13
                      System.out.println("CapperController: Gripper raised...");//sysj\capper.sysj line: 68, column: 13
                      System.out.println("CapperController: Bottle capped. Waiting for bottle to move to next position...");//sysj\capper.sysj line: 69, column: 13
                      S26=8;
                      S233=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  else {
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S233){
              case 0 : 
                if(!bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 70, column: 29
                  S233=1;
                  S222=0;
                  if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 72, column: 23
                    S222=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    ends[2]=2;
                    ;//sysj\capper.sysj line: 70, column: 13
                    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
                    S26=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                break;
              
              case 1 : 
                switch(S222){
                  case 0 : 
                    S222=0;
                    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 72, column: 23
                      S222=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      ends[2]=2;
                      ;//sysj\capper.sysj line: 70, column: 13
                      System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
                      S26=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                  case 1 : 
                    S222=1;
                    S222=0;
                    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 72, column: 23
                      S222=1;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      ends[2]=2;
                      ;//sysj\capper.sysj line: 70, column: 13
                      System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
                      S26=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    break;
                  
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread6184(int [] tdone, int [] ends){
        S1431=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread6183(int [] tdone, int [] ends){
        S1428=1;
    bottleAtPos4E.setPresent();//sysj\capper.sysj line: 123, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread6182(int [] tdone, int [] ends){
        S1458=1;
    S1434=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 120, column: 27
      thread6183(tdone,ends);
      thread6184(tdone,ends);
      int biggest6185 = 0;
      if(ends[13]>=biggest6185){
        biggest6185=ends[13];
      }
      if(ends[14]>=biggest6185){
        biggest6185=ends[14];
      }
      if(biggest6185 == 1){
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S1434=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread6180(int [] tdone, int [] ends){
        S1396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6179(int [] tdone, int [] ends){
        S1393=1;
    cylClampBottleExtend.setPresent();//sysj\capper.sysj line: 104, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6178(int [] tdone, int [] ends){
        S1423=1;
    S1399=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 101, column: 39
      thread6179(tdone,ends);
      thread6180(tdone,ends);
      int biggest6181 = 0;
      if(ends[10]>=biggest6181){
        biggest6181=ends[10];
      }
      if(ends[11]>=biggest6181){
        biggest6181=ends[11];
      }
      if(biggest6181 == 1){
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
    }
    else {
      S1399=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread6177(int [] tdone, int [] ends){
        S1388=1;
    S1332=0;
    S1312=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
      simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
      S1312=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S1307=0;
      if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
        simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
        S1307=1;
        if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
          simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
          ends[8]=2;
          ;//sysj\capper.sysj line: 88, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
            bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
            currsigs.addElement(bottleAtPos4_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
            currsigs.addElement(done_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread6176(int [] tdone, int [] ends){
        S1305=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
    S26=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread6173(int [] tdone, int [] ends){
        S1431=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread6172(int [] tdone, int [] ends){
        S1428=1;
    bottleAtPos4E.setPresent();//sysj\capper.sysj line: 123, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread6171(int [] tdone, int [] ends){
        S1458=1;
    S1434=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 120, column: 27
      thread6172(tdone,ends);
      thread6173(tdone,ends);
      int biggest6174 = 0;
      if(ends[13]>=biggest6174){
        biggest6174=ends[13];
      }
      if(ends[14]>=biggest6174){
        biggest6174=ends[14];
      }
      if(biggest6174 == 1){
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S1434=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread6169(int [] tdone, int [] ends){
        S1396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6168(int [] tdone, int [] ends){
        S1393=1;
    cylClampBottleExtend.setPresent();//sysj\capper.sysj line: 104, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6167(int [] tdone, int [] ends){
        S1423=1;
    S1399=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 101, column: 39
      thread6168(tdone,ends);
      thread6169(tdone,ends);
      int biggest6170 = 0;
      if(ends[10]>=biggest6170){
        biggest6170=ends[10];
      }
      if(ends[11]>=biggest6170){
        biggest6170=ends[11];
      }
      if(biggest6170 == 1){
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
    }
    else {
      S1399=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread6166(int [] tdone, int [] ends){
        S1388=1;
    S1332=0;
    S1312=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
      simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
      S1312=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S1307=0;
      if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
        simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
        S1307=1;
        if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
          simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
          ends[8]=2;
          ;//sysj\capper.sysj line: 88, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
            bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
            currsigs.addElement(bottleAtPos4_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
            currsigs.addElement(done_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread6165(int [] tdone, int [] ends){
        S1305=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
    S26=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread6162(int [] tdone, int [] ends){
        S1431=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread6161(int [] tdone, int [] ends){
        S1428=1;
    bottleAtPos4E.setPresent();//sysj\capper.sysj line: 123, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread6160(int [] tdone, int [] ends){
        S1458=1;
    S1434=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 120, column: 27
      thread6161(tdone,ends);
      thread6162(tdone,ends);
      int biggest6163 = 0;
      if(ends[13]>=biggest6163){
        biggest6163=ends[13];
      }
      if(ends[14]>=biggest6163){
        biggest6163=ends[14];
      }
      if(biggest6163 == 1){
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S1434=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread6158(int [] tdone, int [] ends){
        S1396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6157(int [] tdone, int [] ends){
        S1393=1;
    cylClampBottleExtend.setPresent();//sysj\capper.sysj line: 104, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6156(int [] tdone, int [] ends){
        S1423=1;
    S1399=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 101, column: 39
      thread6157(tdone,ends);
      thread6158(tdone,ends);
      int biggest6159 = 0;
      if(ends[10]>=biggest6159){
        biggest6159=ends[10];
      }
      if(ends[11]>=biggest6159){
        biggest6159=ends[11];
      }
      if(biggest6159 == 1){
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
    }
    else {
      S1399=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread6155(int [] tdone, int [] ends){
        S1388=1;
    S1332=0;
    S1312=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
      simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
      S1312=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S1307=0;
      if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
        simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
        S1307=1;
        if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
          simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
          ends[8]=2;
          ;//sysj\capper.sysj line: 88, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
            bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
            currsigs.addElement(bottleAtPos4_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
            currsigs.addElement(done_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread6154(int [] tdone, int [] ends){
        S1305=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
    S26=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void thread6151(int [] tdone, int [] ends){
        S1431=1;
    active[14]=1;
    ends[14]=1;
    tdone[14]=1;
  }

  public void thread6150(int [] tdone, int [] ends){
        S1428=1;
    bottleAtPos4E.setPresent();//sysj\capper.sysj line: 123, column: 30
    currsigs.addElement(bottleAtPos4E);
    active[13]=1;
    ends[13]=1;
    tdone[13]=1;
  }

  public void thread6149(int [] tdone, int [] ends){
        S1458=1;
    S1434=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 120, column: 27
      thread6150(tdone,ends);
      thread6151(tdone,ends);
      int biggest6152 = 0;
      if(ends[13]>=biggest6152){
        biggest6152=ends[13];
      }
      if(ends[14]>=biggest6152){
        biggest6152=ends[14];
      }
      if(biggest6152 == 1){
        active[12]=1;
        ends[12]=1;
        tdone[12]=1;
      }
    }
    else {
      S1434=1;
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread6147(int [] tdone, int [] ends){
        S1396=1;
    active[11]=1;
    ends[11]=1;
    tdone[11]=1;
  }

  public void thread6146(int [] tdone, int [] ends){
        S1393=1;
    cylClampBottleExtend.setPresent();//sysj\capper.sysj line: 104, column: 31
    currsigs.addElement(cylClampBottleExtend);
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread6145(int [] tdone, int [] ends){
        S1423=1;
    S1399=0;
    if(bottleAtPos4_1.getprestatus()){//sysj\capper.sysj line: 101, column: 39
      thread6146(tdone,ends);
      thread6147(tdone,ends);
      int biggest6148 = 0;
      if(ends[10]>=biggest6148){
        biggest6148=ends[10];
      }
      if(ends[11]>=biggest6148){
        biggest6148=ends[11];
      }
      if(biggest6148 == 1){
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
      }
    }
    else {
      S1399=1;
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread6144(int [] tdone, int [] ends){
        S1388=1;
    S1332=0;
    S1312=0;
    if(!simCapper_in.isPartnerPresent() || simCapper_in.isPartnerPreempted()){//sysj\capper.sysj line: 88, column: 13
      simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
      S1312=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      S1307=0;
      if(!simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
        simCapper_in.setACK(true);//sysj\capper.sysj line: 88, column: 13
        S1307=1;
        if(simCapper_in.isREQ()){//sysj\capper.sysj line: 88, column: 13
          simCapper_in.setACK(false);//sysj\capper.sysj line: 88, column: 13
          ends[8]=2;
          ;//sysj\capper.sysj line: 88, column: 13
          if((Boolean)(simCapper_in.getVal() == null ? null : ((Boolean)simCapper_in.getVal()))){//sysj\capper.sysj line: 89, column: 16
            bottleAtPos4_1.setPresent();//sysj\capper.sysj line: 90, column: 14
            currsigs.addElement(bottleAtPos4_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
          else {
            done_1.setPresent();//sysj\capper.sysj line: 93, column: 14
            currsigs.addElement(done_1);
            S1332=1;
            active[8]=1;
            ends[8]=1;
            tdone[8]=1;
          }
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
      }
      else {
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
  }

  public void thread6143(int [] tdone, int [] ends){
        S1305=1;
    System.out.println("*Capper: Waiting for bottle at position 4...*");//sysj\capper.sysj line: 20, column: 13
    S26=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S5765){
        case 0 : 
          S5765=0;
          break RUN;
        
        case 1 : 
          S5765=2;
          S5765=2;
          bottleAtPos4_1.setClear();//sysj\capper.sysj line: 14, column: 11
          done_1.setClear();//sysj\capper.sysj line: 14, column: 11
          S5764=0;
          S8=0;
          if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 15, column: 11
            capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
            S8=1;
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          else {
            S3=0;
            if(capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
              capperReady_o.setVal(Boolean.TRUE);//sysj\capper.sysj line: 15, column: 11
              S3=1;
              if(!capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
                capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
                ends[1]=2;
                ;//sysj\capper.sysj line: 15, column: 11
                S5764=1;
                thread6143(tdone,ends);
                thread6144(tdone,ends);
                thread6145(tdone,ends);
                thread6149(tdone,ends);
                int biggest6153 = 0;
                if(ends[2]>=biggest6153){
                  biggest6153=ends[2];
                }
                if(ends[8]>=biggest6153){
                  biggest6153=ends[8];
                }
                if(ends[9]>=biggest6153){
                  biggest6153=ends[9];
                }
                if(ends[12]>=biggest6153){
                  biggest6153=ends[12];
                }
                if(biggest6153 == 1){
                  active[1]=1;
                  ends[1]=1;
                  break RUN;
                }
              }
              else {
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
            }
            else {
              active[1]=1;
              ends[1]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos4_1.setClear();//sysj\capper.sysj line: 14, column: 11
          done_1.setClear();//sysj\capper.sysj line: 14, column: 11
          switch(S5764){
            case 0 : 
              switch(S8){
                case 0 : 
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 15, column: 11
                    capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
                    S8=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    switch(S3){
                      case 0 : 
                        if(capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
                          capperReady_o.setVal(Boolean.TRUE);//sysj\capper.sysj line: 15, column: 11
                          S3=1;
                          if(!capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
                            capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
                            ends[1]=2;
                            ;//sysj\capper.sysj line: 15, column: 11
                            S5764=1;
                            thread6154(tdone,ends);
                            thread6155(tdone,ends);
                            thread6156(tdone,ends);
                            thread6160(tdone,ends);
                            int biggest6164 = 0;
                            if(ends[2]>=biggest6164){
                              biggest6164=ends[2];
                            }
                            if(ends[8]>=biggest6164){
                              biggest6164=ends[8];
                            }
                            if(ends[9]>=biggest6164){
                              biggest6164=ends[9];
                            }
                            if(ends[12]>=biggest6164){
                              biggest6164=ends[12];
                            }
                            if(biggest6164 == 1){
                              active[1]=1;
                              ends[1]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
                          capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
                          ends[1]=2;
                          ;//sysj\capper.sysj line: 15, column: 11
                          S5764=1;
                          thread6165(tdone,ends);
                          thread6166(tdone,ends);
                          thread6167(tdone,ends);
                          thread6171(tdone,ends);
                          int biggest6175 = 0;
                          if(ends[2]>=biggest6175){
                            biggest6175=ends[2];
                          }
                          if(ends[8]>=biggest6175){
                            biggest6175=ends[8];
                          }
                          if(ends[9]>=biggest6175){
                            biggest6175=ends[9];
                          }
                          if(ends[12]>=biggest6175){
                            biggest6175=ends[12];
                          }
                          if(biggest6175 == 1){
                            active[1]=1;
                            ends[1]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S8=1;
                  S8=0;
                  if(!capperReady_o.isPartnerPresent() || capperReady_o.isPartnerPreempted()){//sysj\capper.sysj line: 15, column: 11
                    capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
                    S8=1;
                    active[1]=1;
                    ends[1]=1;
                    break RUN;
                  }
                  else {
                    S3=0;
                    if(capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
                      capperReady_o.setVal(Boolean.TRUE);//sysj\capper.sysj line: 15, column: 11
                      S3=1;
                      if(!capperReady_o.isACK()){//sysj\capper.sysj line: 15, column: 11
                        capperReady_o.setREQ(false);//sysj\capper.sysj line: 15, column: 11
                        ends[1]=2;
                        ;//sysj\capper.sysj line: 15, column: 11
                        S5764=1;
                        thread6176(tdone,ends);
                        thread6177(tdone,ends);
                        thread6178(tdone,ends);
                        thread6182(tdone,ends);
                        int biggest6186 = 0;
                        if(ends[2]>=biggest6186){
                          biggest6186=ends[2];
                        }
                        if(ends[8]>=biggest6186){
                          biggest6186=ends[8];
                        }
                        if(ends[9]>=biggest6186){
                          biggest6186=ends[9];
                        }
                        if(ends[12]>=biggest6186){
                          biggest6186=ends[12];
                        }
                        if(biggest6186 == 1){
                          active[1]=1;
                          ends[1]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[1]=1;
                        ends[1]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[1]=1;
                      ends[1]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread6187(tdone,ends);
              thread6202(tdone,ends);
              thread6203(tdone,ends);
              thread6210(tdone,ends);
              int biggest6217 = 0;
              if(ends[2]>=biggest6217){
                biggest6217=ends[2];
              }
              if(ends[8]>=biggest6217){
                biggest6217=ends[8];
              }
              if(ends[9]>=biggest6217){
                biggest6217=ends[9];
              }
              if(ends[12]>=biggest6217){
                biggest6217=ends[12];
              }
              if(biggest6217 == 1){
                active[1]=1;
                ends[1]=1;
                break RUN;
              }
              //FINXME code
              if(biggest6217 == 0){
                S5765=0;
                active[1]=0;
                ends[1]=0;
                S5765=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos4_1 = new Signal();
    done_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
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
      bottleAtPos4_1.setpreclear();
      done_1.setpreclear();
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
      bottleAtPos4_1.setClear();
      done_1.setClear();
      simCapper_in.sethook();
      capperReady_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        simCapper_in.gethook();
        capperReady_o.gethook();
        gripperZAxisLowered.gethook();
        gripperZAxisLifted.gethook();
        gripperTurnHomePos.gethook();
        gripperTurnFinalPos.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
