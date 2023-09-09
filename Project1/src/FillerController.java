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
  public Signal dosUnitEvac = new Signal("dosUnitEvac", Signal.INPUT);
  public Signal dosUnitFilled = new Signal("dosUnitFilled", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal bottleAtPos2_36;
  private long __start_thread_37;//sysj\conveyor_controller.sysj line: 281, column: 9
  private int S27878 = 1;
  private int S27877 = 1;
  private int S19981 = 1;
  private int S19976 = 1;
  private int S21848 = 1;
  private int S19999 = 1;
  private int S20006 = 1;
  private int S20001 = 1;
  private int S20107 = 1;
  private int S20112 = 1;
  private int S20191 = 1;
  private int S20196 = 1;
  private int S20232 = 1;
  private int S20227 = 1;
  private int S20305 = 1;
  private int S21931 = 1;
  private int S21875 = 1;
  private int S21855 = 1;
  private int S21850 = 1;
  private int S21966 = 1;
  private int S21942 = 1;
  private int S21936 = 1;
  private int S21939 = 1;
  
  private int[] ends = new int[60];
  private int[] tdone = new int[60];
  
  public void thread31311(int [] tdone, int [] ends){
        S21939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31310(int [] tdone, int [] ends){
        S21936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31308(int [] tdone, int [] ends){
        switch(S21939){
      case 0 : 
        active[45]=0;
        ends[45]=0;
        tdone[45]=1;
        break;
      
      case 1 : 
        if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 347, column: 35
          ends[45]=2;
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

  public void thread31307(int [] tdone, int [] ends){
        switch(S21936){
      case 0 : 
        active[44]=0;
        ends[44]=0;
        tdone[44]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[44]=1;
        ends[44]=1;
        tdone[44]=1;
        break;
      
    }
  }

  public void thread31306(int [] tdone, int [] ends){
        switch(S21966){
      case 0 : 
        active[43]=0;
        ends[43]=0;
        tdone[43]=1;
        break;
      
      case 1 : 
        switch(S21942){
          case 0 : 
            thread31307(tdone,ends);
            thread31308(tdone,ends);
            int biggest31309 = 0;
            if(ends[44]>=biggest31309){
              biggest31309=ends[44];
            }
            if(ends[45]>=biggest31309){
              biggest31309=ends[45];
            }
            if(biggest31309 == 1){
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            if(biggest31309 == 2){
              ends[43]=2;
              ;//sysj\conveyor_controller.sysj line: 341, column: 18
              S21942=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            //FINXME code
            if(biggest31309 == 0){
              S21942=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
          case 1 : 
            S21942=1;
            S21942=0;
            if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 340, column: 26
              thread31310(tdone,ends);
              thread31311(tdone,ends);
              int biggest31312 = 0;
              if(ends[44]>=biggest31312){
                biggest31312=ends[44];
              }
              if(ends[45]>=biggest31312){
                biggest31312=ends[45];
              }
              if(biggest31312 == 1){
                active[43]=1;
                ends[43]=1;
                tdone[43]=1;
              }
            }
            else {
              S21942=1;
              active[43]=1;
              ends[43]=1;
              tdone[43]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31305(int [] tdone, int [] ends){
        switch(S21931){
      case 0 : 
        active[42]=0;
        ends[42]=0;
        tdone[42]=1;
        break;
      
      case 1 : 
        switch(S21875){
          case 0 : 
            switch(S21855){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
                  S21855=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  switch(S21850){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
                        S21850=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
                          ends[42]=2;
                          ;//sysj\conveyor_controller.sysj line: 329, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
                            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
                            currsigs.addElement(bottleAtPos2_36);
                            S21875=1;
                            active[42]=1;
                            ends[42]=1;
                            tdone[42]=1;
                          }
                          else {
                            S21875=1;
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
                      else {
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
                        ends[42]=2;
                        ;//sysj\conveyor_controller.sysj line: 329, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
                          bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
                          currsigs.addElement(bottleAtPos2_36);
                          S21875=1;
                          active[42]=1;
                          ends[42]=1;
                          tdone[42]=1;
                        }
                        else {
                          S21875=1;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S21855=1;
                S21855=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
                  S21855=1;
                  active[42]=1;
                  ends[42]=1;
                  tdone[42]=1;
                }
                else {
                  S21850=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
                    S21850=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
                      ends[42]=2;
                      ;//sysj\conveyor_controller.sysj line: 329, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
                        bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
                        currsigs.addElement(bottleAtPos2_36);
                        S21875=1;
                        active[42]=1;
                        ends[42]=1;
                        tdone[42]=1;
                      }
                      else {
                        S21875=1;
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
            S21875=1;
            S21875=0;
            S21855=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
              S21855=1;
              active[42]=1;
              ends[42]=1;
              tdone[42]=1;
            }
            else {
              S21850=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
                S21850=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
                  ends[42]=2;
                  ;//sysj\conveyor_controller.sysj line: 329, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
                    bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
                    currsigs.addElement(bottleAtPos2_36);
                    S21875=1;
                    active[42]=1;
                    ends[42]=1;
                    tdone[42]=1;
                  }
                  else {
                    S21875=1;
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
              else {
                active[42]=1;
                ends[42]=1;
                tdone[42]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31303(int [] tdone, int [] ends){
        switch(S20196){
      case 0 : 
        active[41]=0;
        ends[41]=0;
        tdone[41]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 308, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[41]=1;
        ends[41]=1;
        tdone[41]=1;
        break;
      
    }
  }

  public void thread31302(int [] tdone, int [] ends){
        switch(S20191){
      case 0 : 
        active[40]=0;
        ends[40]=0;
        tdone[40]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 304, column: 13
        currsigs.addElement(valveInletOnOff);
        active[40]=1;
        ends[40]=1;
        tdone[40]=1;
        break;
      
    }
  }

  public void thread31300(int [] tdone, int [] ends){
        S20196=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 308, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31299(int [] tdone, int [] ends){
        S20191=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 303, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 304, column: 13
    currsigs.addElement(valveInletOnOff);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31297(int [] tdone, int [] ends){
        switch(S20112){
      case 0 : 
        active[39]=0;
        ends[39]=0;
        tdone[39]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 297, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[39]=1;
        ends[39]=1;
        tdone[39]=1;
        break;
      
    }
  }

  public void thread31296(int [] tdone, int [] ends){
        switch(S20107){
      case 0 : 
        active[38]=0;
        ends[38]=0;
        tdone[38]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 293, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[38]=1;
        ends[38]=1;
        tdone[38]=1;
        break;
      
    }
  }

  public void thread31294(int [] tdone, int [] ends){
        S20196=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 308, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[41]=1;
    ends[41]=1;
    tdone[41]=1;
  }

  public void thread31293(int [] tdone, int [] ends){
        S20191=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 303, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 304, column: 13
    currsigs.addElement(valveInletOnOff);
    active[40]=1;
    ends[40]=1;
    tdone[40]=1;
  }

  public void thread31291(int [] tdone, int [] ends){
        S20112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 297, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31290(int [] tdone, int [] ends){
        S20107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 292, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 293, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31288(int [] tdone, int [] ends){
        S20112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 297, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31287(int [] tdone, int [] ends){
        S20107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 292, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 293, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31285(int [] tdone, int [] ends){
        S20112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 297, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31284(int [] tdone, int [] ends){
        S20107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 292, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 293, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31282(int [] tdone, int [] ends){
        S20112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 297, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31281(int [] tdone, int [] ends){
        S20107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 292, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 293, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31279(int [] tdone, int [] ends){
        S20112=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 297, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[39]=1;
    ends[39]=1;
    tdone[39]=1;
  }

  public void thread31278(int [] tdone, int [] ends){
        S20107=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 292, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 293, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[38]=1;
    ends[38]=1;
    tdone[38]=1;
  }

  public void thread31277(int [] tdone, int [] ends){
        switch(S21848){
      case 0 : 
        active[37]=0;
        ends[37]=0;
        tdone[37]=1;
        break;
      
      case 1 : 
        switch(S19999){
          case 0 : 
            if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 284, column: 17
              S19999=1;
              S20006=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 285, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                S20006=1;
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              else {
                S20001=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 285, column: 11
                  S20001=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 285, column: 11
                    S19999=2;
                    __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 281, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 288, column: 11
                      S19999=3;
                      thread31278(tdone,ends);
                      thread31279(tdone,ends);
                      int biggest31280 = 0;
                      if(ends[38]>=biggest31280){
                        biggest31280=ends[38];
                      }
                      if(ends[39]>=biggest31280){
                        biggest31280=ends[39];
                      }
                      if(biggest31280 == 1){
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 1 : 
            switch(S20006){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 285, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                  S20006=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S20001){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 285, column: 11
                        S20001=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 285, column: 11
                          S19999=2;
                          __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
                            ends[37]=2;
                            ;//sysj\conveyor_controller.sysj line: 281, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 288, column: 11
                            S19999=3;
                            thread31281(tdone,ends);
                            thread31282(tdone,ends);
                            int biggest31283 = 0;
                            if(ends[38]>=biggest31283){
                              biggest31283=ends[38];
                            }
                            if(ends[39]>=biggest31283){
                              biggest31283=ends[39];
                            }
                            if(biggest31283 == 1){
                              active[37]=1;
                              ends[37]=1;
                              tdone[37]=1;
                            }
                          }
                          else {
                            active[37]=1;
                            ends[37]=1;
                            tdone[37]=1;
                          }
                        }
                        else {
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 285, column: 11
                        S19999=2;
                        __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 281, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 288, column: 11
                          S19999=3;
                          thread31284(tdone,ends);
                          thread31285(tdone,ends);
                          int biggest31286 = 0;
                          if(ends[38]>=biggest31286){
                            biggest31286=ends[38];
                          }
                          if(ends[39]>=biggest31286){
                            biggest31286=ends[39];
                          }
                          if(biggest31286 == 1){
                            active[37]=1;
                            ends[37]=1;
                            tdone[37]=1;
                          }
                        }
                        else {
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S20006=1;
                S20006=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 285, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                  S20006=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20001=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 285, column: 11
                    S20001=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 285, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 285, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 285, column: 11
                      S19999=2;
                      __start_thread_37 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 281, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 281, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 288, column: 11
                        S19999=3;
                        thread31287(tdone,ends);
                        thread31288(tdone,ends);
                        int biggest31289 = 0;
                        if(ends[38]>=biggest31289){
                          biggest31289=ends[38];
                        }
                        if(ends[39]>=biggest31289){
                          biggest31289=ends[39];
                        }
                        if(biggest31289 == 1){
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_37 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 281, column: 9
              ends[37]=2;
              ;//sysj\conveyor_controller.sysj line: 281, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 288, column: 11
              S19999=3;
              thread31290(tdone,ends);
              thread31291(tdone,ends);
              int biggest31292 = 0;
              if(ends[38]>=biggest31292){
                biggest31292=ends[38];
              }
              if(ends[39]>=biggest31292){
                biggest31292=ends[39];
              }
              if(biggest31292 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              active[37]=1;
              ends[37]=1;
              tdone[37]=1;
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 290, column: 17
              S19999=4;
              thread31293(tdone,ends);
              thread31294(tdone,ends);
              int biggest31295 = 0;
              if(ends[40]>=biggest31295){
                biggest31295=ends[40];
              }
              if(ends[41]>=biggest31295){
                biggest31295=ends[41];
              }
              if(biggest31295 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
            }
            else {
              thread31296(tdone,ends);
              thread31297(tdone,ends);
              int biggest31298 = 0;
              if(ends[38]>=biggest31298){
                biggest31298=ends[38];
              }
              if(ends[39]>=biggest31298){
                biggest31298=ends[39];
              }
              if(biggest31298 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              //FINXME code
              if(biggest31298 == 0){
                S19999=4;
                thread31299(tdone,ends);
                thread31300(tdone,ends);
                int biggest31301 = 0;
                if(ends[40]>=biggest31301){
                  biggest31301=ends[40];
                }
                if(ends[41]>=biggest31301){
                  biggest31301=ends[41];
                }
                if(biggest31301 == 1){
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 301, column: 17
              S19999=5;
              S20232=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 312, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                S20232=1;
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              else {
                S20227=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 312, column: 11
                  S20227=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 312, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 313, column: 11
                    S19999=6;
                    S20305=0;
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
              }
            }
            else {
              thread31302(tdone,ends);
              thread31303(tdone,ends);
              int biggest31304 = 0;
              if(ends[40]>=biggest31304){
                biggest31304=ends[40];
              }
              if(ends[41]>=biggest31304){
                biggest31304=ends[41];
              }
              if(biggest31304 == 1){
                active[37]=1;
                ends[37]=1;
                tdone[37]=1;
              }
              //FINXME code
              if(biggest31304 == 0){
                S19999=5;
                S20232=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 312, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                  S20232=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20227=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 312, column: 11
                    S20227=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 312, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 313, column: 11
                      S19999=6;
                      S20305=0;
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S20232){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 312, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                  S20232=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  switch(S20227){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 312, column: 11
                        S20227=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                          ends[37]=2;
                          ;//sysj\conveyor_controller.sysj line: 312, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 313, column: 11
                          S19999=6;
                          S20305=0;
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                        else {
                          active[37]=1;
                          ends[37]=1;
                          tdone[37]=1;
                        }
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                        ends[37]=2;
                        ;//sysj\conveyor_controller.sysj line: 312, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 313, column: 11
                        S19999=6;
                        S20305=0;
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      else {
                        active[37]=1;
                        ends[37]=1;
                        tdone[37]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S20232=1;
                S20232=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 312, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                  S20232=1;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  S20227=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 312, column: 11
                    S20227=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 312, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 312, column: 11
                      ends[37]=2;
                      ;//sysj\conveyor_controller.sysj line: 312, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 313, column: 11
                      S19999=6;
                      S20305=0;
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                    else {
                      active[37]=1;
                      ends[37]=1;
                      tdone[37]=1;
                    }
                  }
                  else {
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S20305){
              case 0 : 
                if(!bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 316, column: 18
                  S20305=1;
                  if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 318, column: 21
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                  else {
                    ends[37]=2;
                    ;//sysj\conveyor_controller.sysj line: 315, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
                    S19999=0;
                    active[37]=1;
                    ends[37]=1;
                    tdone[37]=1;
                  }
                }
                else {
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 318, column: 21
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                else {
                  ends[37]=2;
                  ;//sysj\conveyor_controller.sysj line: 315, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
                  S19999=0;
                  active[37]=1;
                  ends[37]=1;
                  tdone[37]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread31274(int [] tdone, int [] ends){
        S21939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31273(int [] tdone, int [] ends){
        S21936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31272(int [] tdone, int [] ends){
        S21966=1;
    S21942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 340, column: 26
      thread31273(tdone,ends);
      thread31274(tdone,ends);
      int biggest31275 = 0;
      if(ends[44]>=biggest31275){
        biggest31275=ends[44];
      }
      if(ends[45]>=biggest31275){
        biggest31275=ends[45];
      }
      if(biggest31275 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S21942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31271(int [] tdone, int [] ends){
        S21931=1;
    S21875=0;
    S21855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
      S21855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
        S21850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21875=1;
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
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31270(int [] tdone, int [] ends){
        S21848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31267(int [] tdone, int [] ends){
        S21939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31266(int [] tdone, int [] ends){
        S21936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31265(int [] tdone, int [] ends){
        S21966=1;
    S21942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 340, column: 26
      thread31266(tdone,ends);
      thread31267(tdone,ends);
      int biggest31268 = 0;
      if(ends[44]>=biggest31268){
        biggest31268=ends[44];
      }
      if(ends[45]>=biggest31268){
        biggest31268=ends[45];
      }
      if(biggest31268 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S21942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31264(int [] tdone, int [] ends){
        S21931=1;
    S21875=0;
    S21855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
      S21855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
        S21850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21875=1;
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
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31263(int [] tdone, int [] ends){
        S21848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31260(int [] tdone, int [] ends){
        S21939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31259(int [] tdone, int [] ends){
        S21936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31258(int [] tdone, int [] ends){
        S21966=1;
    S21942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 340, column: 26
      thread31259(tdone,ends);
      thread31260(tdone,ends);
      int biggest31261 = 0;
      if(ends[44]>=biggest31261){
        biggest31261=ends[44];
      }
      if(ends[45]>=biggest31261){
        biggest31261=ends[45];
      }
      if(biggest31261 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S21942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31257(int [] tdone, int [] ends){
        S21931=1;
    S21875=0;
    S21855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
      S21855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
        S21850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21875=1;
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
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31256(int [] tdone, int [] ends){
        S21848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void thread31253(int [] tdone, int [] ends){
        S21939=1;
    active[45]=1;
    ends[45]=1;
    tdone[45]=1;
  }

  public void thread31252(int [] tdone, int [] ends){
        S21936=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 343, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[44]=1;
    ends[44]=1;
    tdone[44]=1;
  }

  public void thread31251(int [] tdone, int [] ends){
        S21966=1;
    S21942=0;
    if(bottleAtPos2_36.getprestatus()){//sysj\conveyor_controller.sysj line: 340, column: 26
      thread31252(tdone,ends);
      thread31253(tdone,ends);
      int biggest31254 = 0;
      if(ends[44]>=biggest31254){
        biggest31254=ends[44];
      }
      if(ends[45]>=biggest31254){
        biggest31254=ends[45];
      }
      if(biggest31254 == 1){
        active[43]=1;
        ends[43]=1;
        tdone[43]=1;
      }
    }
    else {
      S21942=1;
      active[43]=1;
      ends[43]=1;
      tdone[43]=1;
    }
  }

  public void thread31250(int [] tdone, int [] ends){
        S21931=1;
    S21875=0;
    S21855=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 329, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
      S21855=1;
      active[42]=1;
      ends[42]=1;
      tdone[42]=1;
    }
    else {
      S21850=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 329, column: 12
        S21850=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 329, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 329, column: 12
          ends[42]=2;
          ;//sysj\conveyor_controller.sysj line: 329, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 330, column: 15
            bottleAtPos2_36.setPresent();//sysj\conveyor_controller.sysj line: 331, column: 13
            currsigs.addElement(bottleAtPos2_36);
            S21875=1;
            active[42]=1;
            ends[42]=1;
            tdone[42]=1;
          }
          else {
            S21875=1;
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
      else {
        active[42]=1;
        ends[42]=1;
        tdone[42]=1;
      }
    }
  }

  public void thread31249(int [] tdone, int [] ends){
        S21848=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 283, column: 14
    S19999=0;
    active[37]=1;
    ends[37]=1;
    tdone[37]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S27878){
        case 0 : 
          S27878=0;
          break RUN;
        
        case 1 : 
          S27878=2;
          S27878=2;
          bottleAtPos2_36.setClear();//sysj\conveyor_controller.sysj line: 276, column: 9
          S27877=0;
          S19981=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 278, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
            S19981=1;
            active[36]=1;
            ends[36]=1;
            break RUN;
          }
          else {
            S19976=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 278, column: 9
              S19976=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                ends[36]=2;
                ;//sysj\conveyor_controller.sysj line: 278, column: 9
                S27877=1;
                thread31249(tdone,ends);
                thread31250(tdone,ends);
                thread31251(tdone,ends);
                int biggest31255 = 0;
                if(ends[37]>=biggest31255){
                  biggest31255=ends[37];
                }
                if(ends[42]>=biggest31255){
                  biggest31255=ends[42];
                }
                if(ends[43]>=biggest31255){
                  biggest31255=ends[43];
                }
                if(biggest31255 == 1){
                  active[36]=1;
                  ends[36]=1;
                  break RUN;
                }
              }
              else {
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
            }
            else {
              active[36]=1;
              ends[36]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_36.setClear();//sysj\conveyor_controller.sysj line: 276, column: 9
          switch(S27877){
            case 0 : 
              switch(S19981){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 278, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                    S19981=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  }
                  else {
                    switch(S19976){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 278, column: 9
                          S19976=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                            ends[36]=2;
                            ;//sysj\conveyor_controller.sysj line: 278, column: 9
                            S27877=1;
                            thread31256(tdone,ends);
                            thread31257(tdone,ends);
                            thread31258(tdone,ends);
                            int biggest31262 = 0;
                            if(ends[37]>=biggest31262){
                              biggest31262=ends[37];
                            }
                            if(ends[42]>=biggest31262){
                              biggest31262=ends[42];
                            }
                            if(ends[43]>=biggest31262){
                              biggest31262=ends[43];
                            }
                            if(biggest31262 == 1){
                              active[36]=1;
                              ends[36]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[36]=1;
                            ends[36]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                          ends[36]=2;
                          ;//sysj\conveyor_controller.sysj line: 278, column: 9
                          S27877=1;
                          thread31263(tdone,ends);
                          thread31264(tdone,ends);
                          thread31265(tdone,ends);
                          int biggest31269 = 0;
                          if(ends[37]>=biggest31269){
                            biggest31269=ends[37];
                          }
                          if(ends[42]>=biggest31269){
                            biggest31269=ends[42];
                          }
                          if(ends[43]>=biggest31269){
                            biggest31269=ends[43];
                          }
                          if(biggest31269 == 1){
                            active[36]=1;
                            ends[36]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S19981=1;
                  S19981=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 278, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                    S19981=1;
                    active[36]=1;
                    ends[36]=1;
                    break RUN;
                  }
                  else {
                    S19976=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 278, column: 9
                      S19976=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 278, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 278, column: 9
                        ends[36]=2;
                        ;//sysj\conveyor_controller.sysj line: 278, column: 9
                        S27877=1;
                        thread31270(tdone,ends);
                        thread31271(tdone,ends);
                        thread31272(tdone,ends);
                        int biggest31276 = 0;
                        if(ends[37]>=biggest31276){
                          biggest31276=ends[37];
                        }
                        if(ends[42]>=biggest31276){
                          biggest31276=ends[42];
                        }
                        if(ends[43]>=biggest31276){
                          biggest31276=ends[43];
                        }
                        if(biggest31276 == 1){
                          active[36]=1;
                          ends[36]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[36]=1;
                        ends[36]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[36]=1;
                      ends[36]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread31277(tdone,ends);
              thread31305(tdone,ends);
              thread31306(tdone,ends);
              int biggest31313 = 0;
              if(ends[37]>=biggest31313){
                biggest31313=ends[37];
              }
              if(ends[42]>=biggest31313){
                biggest31313=ends[42];
              }
              if(ends[43]>=biggest31313){
                biggest31313=ends[43];
              }
              if(biggest31313 == 1){
                active[36]=1;
                ends[36]=1;
                break RUN;
              }
              //FINXME code
              if(biggest31313 == 0){
                S27878=0;
                active[36]=0;
                ends[36]=0;
                S27878=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    bottleAtPos2_36 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[36] != 0){
      int index = 36;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      bottleAtPos2_36.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
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
      bottleAtPos2E.sethook();
      bottleAtPos2E.setClear();
      bottleAtPos2_36.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[36]!=0 || suspended[36]!=0 || active[36]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[36] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
