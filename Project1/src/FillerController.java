import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class FillerController extends ClockDomain{
  public FillerController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos2 = new Signal("bottleAtPos2", Signal.INPUT);
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public output_Channel fillerReady_o = new output_Channel();
  private int S15768 = 1;
  private int S15767 = 1;
  private int S10031 = 1;
  private int S10026 = 1;
  private int S10049 = 1;
  private int S10056 = 1;
  private int S10051 = 1;
  private int S10101 = 1;
  private int S10106 = 1;
  private int S10157 = 1;
  private int S10162 = 1;
  private int S10198 = 1;
  private int S10193 = 1;
  private int S10271 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread15968(int [] tdone, int [] ends){
        switch(S10162){
      case 0 : 
        active[28]=0;
        ends[28]=0;
        tdone[28]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 204, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[28]=1;
        ends[28]=1;
        tdone[28]=1;
        break;
      
    }
  }

  public void thread15967(int [] tdone, int [] ends){
        switch(S10157){
      case 0 : 
        active[27]=0;
        ends[27]=0;
        tdone[27]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 200, column: 13
        currsigs.addElement(valveInletOnOff);
        active[27]=1;
        ends[27]=1;
        tdone[27]=1;
        break;
      
    }
  }

  public void thread15965(int [] tdone, int [] ends){
        S10162=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 204, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread15964(int [] tdone, int [] ends){
        S10157=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 199, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 200, column: 13
    currsigs.addElement(valveInletOnOff);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread15962(int [] tdone, int [] ends){
        switch(S10106){
      case 0 : 
        active[26]=0;
        ends[26]=0;
        tdone[26]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 193, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[26]=1;
        ends[26]=1;
        tdone[26]=1;
        break;
      
    }
  }

  public void thread15961(int [] tdone, int [] ends){
        switch(S10101){
      case 0 : 
        active[25]=0;
        ends[25]=0;
        tdone[25]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 189, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[25]=1;
        ends[25]=1;
        tdone[25]=1;
        break;
      
    }
  }

  public void thread15959(int [] tdone, int [] ends){
        S10162=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 204, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[28]=1;
    ends[28]=1;
    tdone[28]=1;
  }

  public void thread15958(int [] tdone, int [] ends){
        S10157=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 199, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 200, column: 13
    currsigs.addElement(valveInletOnOff);
    active[27]=1;
    ends[27]=1;
    tdone[27]=1;
  }

  public void thread15956(int [] tdone, int [] ends){
        S10106=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 193, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread15955(int [] tdone, int [] ends){
        S10101=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 188, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 189, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread15953(int [] tdone, int [] ends){
        S10106=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 193, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread15952(int [] tdone, int [] ends){
        S10101=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 188, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 189, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread15950(int [] tdone, int [] ends){
        S10106=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 193, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread15949(int [] tdone, int [] ends){
        S10101=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 188, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 189, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void thread15947(int [] tdone, int [] ends){
        S10106=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 193, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[26]=1;
    ends[26]=1;
    tdone[26]=1;
  }

  public void thread15946(int [] tdone, int [] ends){
        S10101=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 188, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 189, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[25]=1;
    ends[25]=1;
    tdone[25]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S15768){
        case 0 : 
          S15768=0;
          break RUN;
        
        case 1 : 
          S15768=2;
          S15768=2;
          S15767=0;
          S10031=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 174, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
            S10031=1;
            active[24]=1;
            ends[24]=1;
            break RUN;
          }
          else {
            S10026=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 174, column: 9
              S10026=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
                ends[24]=2;
                ;//sysj\conveyor_controller.sysj line: 174, column: 9
                S15767=1;
                System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 178, column: 14
                S10049=0;
                active[24]=1;
                ends[24]=1;
                break RUN;
              }
              else {
                active[24]=1;
                ends[24]=1;
                break RUN;
              }
            }
            else {
              active[24]=1;
              ends[24]=1;
              break RUN;
            }
          }
        
        case 2 : 
          switch(S15767){
            case 0 : 
              switch(S10031){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 174, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
                    S10031=1;
                    active[24]=1;
                    ends[24]=1;
                    break RUN;
                  }
                  else {
                    switch(S10026){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 174, column: 9
                          S10026=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
                            ends[24]=2;
                            ;//sysj\conveyor_controller.sysj line: 174, column: 9
                            S15767=1;
                            System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 178, column: 14
                            S10049=0;
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                          else {
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
                          ends[24]=2;
                          ;//sysj\conveyor_controller.sysj line: 174, column: 9
                          S15767=1;
                          System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 178, column: 14
                          S10049=0;
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S10031=1;
                  S10031=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 174, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
                    S10031=1;
                    active[24]=1;
                    ends[24]=1;
                    break RUN;
                  }
                  else {
                    S10026=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 174, column: 9
                      S10026=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 174, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 174, column: 9
                        ends[24]=2;
                        ;//sysj\conveyor_controller.sysj line: 174, column: 9
                        S15767=1;
                        System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 178, column: 14
                        S10049=0;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[24]=1;
                      ends[24]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              switch(S10049){
                case 0 : 
                  if(bottleAtPos2.getprestatus()){//sysj\conveyor_controller.sysj line: 179, column: 17
                    S10049=1;
                    S10056=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 181, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                      S10056=1;
                      active[24]=1;
                      ends[24]=1;
                      break RUN;
                    }
                    else {
                      S10051=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 181, column: 11
                        S10051=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                          ends[24]=2;
                          ;//sysj\conveyor_controller.sysj line: 181, column: 11
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 184, column: 11
                          S10049=2;
                          thread15946(tdone,ends);
                          thread15947(tdone,ends);
                          int biggest15948 = 0;
                          if(ends[25]>=biggest15948){
                            biggest15948=ends[25];
                          }
                          if(ends[26]>=biggest15948){
                            biggest15948=ends[26];
                          }
                          if(biggest15948 == 1){
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    active[24]=1;
                    ends[24]=1;
                    break RUN;
                  }
                
                case 1 : 
                  switch(S10056){
                    case 0 : 
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 181, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                        S10056=1;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        switch(S10051){
                          case 0 : 
                            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                              fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 181, column: 11
                              S10051=1;
                              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                                ends[24]=2;
                                ;//sysj\conveyor_controller.sysj line: 181, column: 11
                                System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 184, column: 11
                                S10049=2;
                                thread15949(tdone,ends);
                                thread15950(tdone,ends);
                                int biggest15951 = 0;
                                if(ends[25]>=biggest15951){
                                  biggest15951=ends[25];
                                }
                                if(ends[26]>=biggest15951){
                                  biggest15951=ends[26];
                                }
                                if(biggest15951 == 1){
                                  active[24]=1;
                                  ends[24]=1;
                                  break RUN;
                                }
                              }
                              else {
                                active[24]=1;
                                ends[24]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[24]=1;
                              ends[24]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                              ends[24]=2;
                              ;//sysj\conveyor_controller.sysj line: 181, column: 11
                              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 184, column: 11
                              S10049=2;
                              thread15952(tdone,ends);
                              thread15953(tdone,ends);
                              int biggest15954 = 0;
                              if(ends[25]>=biggest15954){
                                biggest15954=ends[25];
                              }
                              if(ends[26]>=biggest15954){
                                biggest15954=ends[26];
                              }
                              if(biggest15954 == 1){
                                active[24]=1;
                                ends[24]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[24]=1;
                              ends[24]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S10056=1;
                      S10056=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 181, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                        S10056=1;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        S10051=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                          fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 181, column: 11
                          S10051=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 181, column: 11
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 181, column: 11
                            ends[24]=2;
                            ;//sysj\conveyor_controller.sysj line: 181, column: 11
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 184, column: 11
                            S10049=2;
                            thread15955(tdone,ends);
                            thread15956(tdone,ends);
                            int biggest15957 = 0;
                            if(ends[25]>=biggest15957){
                              biggest15957=ends[25];
                            }
                            if(ends[26]>=biggest15957){
                              biggest15957=ends[26];
                            }
                            if(biggest15957 == 1){
                              active[24]=1;
                              ends[24]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 2 : 
                  if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 186, column: 17
                    S10049=3;
                    thread15958(tdone,ends);
                    thread15959(tdone,ends);
                    int biggest15960 = 0;
                    if(ends[27]>=biggest15960){
                      biggest15960=ends[27];
                    }
                    if(ends[28]>=biggest15960){
                      biggest15960=ends[28];
                    }
                    if(biggest15960 == 1){
                      active[24]=1;
                      ends[24]=1;
                      break RUN;
                    }
                  }
                  else {
                    thread15961(tdone,ends);
                    thread15962(tdone,ends);
                    int biggest15963 = 0;
                    if(ends[25]>=biggest15963){
                      biggest15963=ends[25];
                    }
                    if(ends[26]>=biggest15963){
                      biggest15963=ends[26];
                    }
                    if(biggest15963 == 1){
                      active[24]=1;
                      ends[24]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest15963 == 0){
                      S10049=3;
                      thread15964(tdone,ends);
                      thread15965(tdone,ends);
                      int biggest15966 = 0;
                      if(ends[27]>=biggest15966){
                        biggest15966=ends[27];
                      }
                      if(ends[28]>=biggest15966){
                        biggest15966=ends[28];
                      }
                      if(biggest15966 == 1){
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                    }
                  }
                
                case 3 : 
                  if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 197, column: 17
                    S10049=4;
                    S10198=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 208, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                      S10198=1;
                      active[24]=1;
                      ends[24]=1;
                      break RUN;
                    }
                    else {
                      S10193=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 208, column: 11
                        S10193=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                          ends[24]=2;
                          ;//sysj\conveyor_controller.sysj line: 208, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 209, column: 11
                          S10049=5;
                          S10271=0;
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                    }
                  }
                  else {
                    thread15967(tdone,ends);
                    thread15968(tdone,ends);
                    int biggest15969 = 0;
                    if(ends[27]>=biggest15969){
                      biggest15969=ends[27];
                    }
                    if(ends[28]>=biggest15969){
                      biggest15969=ends[28];
                    }
                    if(biggest15969 == 1){
                      active[24]=1;
                      ends[24]=1;
                      break RUN;
                    }
                    //FINXME code
                    if(biggest15969 == 0){
                      S10049=4;
                      S10198=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 208, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                        S10198=1;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        S10193=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 208, column: 11
                          S10193=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                            ends[24]=2;
                            ;//sysj\conveyor_controller.sysj line: 208, column: 11
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 209, column: 11
                            S10049=5;
                            S10271=0;
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                          else {
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      }
                    }
                  }
                
                case 4 : 
                  switch(S10198){
                    case 0 : 
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 208, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                        S10198=1;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        switch(S10193){
                          case 0 : 
                            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 208, column: 11
                              S10193=1;
                              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                                ends[24]=2;
                                ;//sysj\conveyor_controller.sysj line: 208, column: 11
                                System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 209, column: 11
                                S10049=5;
                                S10271=0;
                                active[24]=1;
                                ends[24]=1;
                                break RUN;
                              }
                              else {
                                active[24]=1;
                                ends[24]=1;
                                break RUN;
                              }
                            }
                            else {
                              active[24]=1;
                              ends[24]=1;
                              break RUN;
                            }
                          
                          case 1 : 
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                              ends[24]=2;
                              ;//sysj\conveyor_controller.sysj line: 208, column: 11
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 209, column: 11
                              S10049=5;
                              S10271=0;
                              active[24]=1;
                              ends[24]=1;
                              break RUN;
                            }
                            else {
                              active[24]=1;
                              ends[24]=1;
                              break RUN;
                            }
                          
                        }
                      }
                      break;
                    
                    case 1 : 
                      S10198=1;
                      S10198=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 208, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                        S10198=1;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        S10193=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 208, column: 11
                          S10193=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 208, column: 11
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 208, column: 11
                            ends[24]=2;
                            ;//sysj\conveyor_controller.sysj line: 208, column: 11
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 209, column: 11
                            S10049=5;
                            S10271=0;
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                          else {
                            active[24]=1;
                            ends[24]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      }
                    
                  }
                  break;
                
                case 5 : 
                  switch(S10271){
                    case 0 : 
                      if(!bottleAtPos2.getprestatus()){//sysj\conveyor_controller.sysj line: 212, column: 18
                        S10271=1;
                        if(bottleAtPos2.getprestatus()){//sysj\conveyor_controller.sysj line: 214, column: 21
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                        else {
                          ends[24]=2;
                          ;//sysj\conveyor_controller.sysj line: 211, column: 11
                          System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 178, column: 14
                          S10049=0;
                          active[24]=1;
                          ends[24]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                    
                    case 1 : 
                      if(bottleAtPos2.getprestatus()){//sysj\conveyor_controller.sysj line: 214, column: 21
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                      else {
                        ends[24]=2;
                        ;//sysj\conveyor_controller.sysj line: 211, column: 11
                        System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 178, column: 14
                        S10049=0;
                        active[24]=1;
                        ends[24]=1;
                        break RUN;
                      }
                    
                  }
                  break;
                
              }
              break;
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[24] != 0){
      int index = 24;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[24]!=0 || suspended[24]!=0 || active[24]!=1);
      else{
        if(!df){
          fillerReady_o.gethook();
          bottleAtPos2.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos2.setpreclear();
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos2.getStatus() ? bottleAtPos2.setprepresent() : bottleAtPos2.setpreclear();
      bottleAtPos2.setpreval(bottleAtPos2.getValue());
      bottleAtPos2.setClear();
      dummyint = dosUnitEvac.getStatus() ? dosUnitEvac.setprepresent() : dosUnitEvac.setpreclear();
      dosUnitEvac.setpreval(dosUnitEvac.getValue());
      dosUnitEvac.setClear();
      dummyint = dosUnitFilled.getStatus() ? dosUnitFilled.setprepresent() : dosUnitFilled.setpreclear();
      dosUnitFilled.setpreval(dosUnitFilled.getValue());
      dosUnitFilled.setClear();
      valveInjectorOnOff.sethook();
      valveInjectorOnOff.setClear();
      valveInletOnOff.sethook();
      valveInletOnOff.setClear();
      dosUnitValveRetract.sethook();
      dosUnitValveRetract.setClear();
      dosUnitValveExtend.sethook();
      dosUnitValveExtend.setClear();
      fillerReady_o.sethook();
      if(paused[24]!=0 || suspended[24]!=0 || active[24]!=1);
      else{
        fillerReady_o.gethook();
        bottleAtPos2.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[24] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
