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
  private Signal bottleAtPos2_48;
  private long __start_thread_49;//sysj\conveyor_controller.sysj line: 360, column: 9
  private int S32794 = 1;
  private int S32793 = 1;
  private int S24897 = 1;
  private int S24892 = 1;
  private int S26764 = 1;
  private int S24915 = 1;
  private int S24922 = 1;
  private int S24917 = 1;
  private int S25023 = 1;
  private int S25028 = 1;
  private int S25107 = 1;
  private int S25112 = 1;
  private int S25148 = 1;
  private int S25143 = 1;
  private int S25221 = 1;
  private int S26847 = 1;
  private int S26791 = 1;
  private int S26771 = 1;
  private int S26766 = 1;
  private int S26882 = 1;
  private int S26858 = 1;
  private int S26852 = 1;
  private int S26855 = 1;
  
  private int[] ends = new int[72];
  private int[] tdone = new int[72];
  
  public void thread39101(int [] tdone, int [] ends){
        S26855=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread39100(int [] tdone, int [] ends){
        S26852=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread39098(int [] tdone, int [] ends){
        switch(S26855){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 427, column: 35
          ends[57]=2;
          tdone[57]=1;
        }
        else {
          active[57]=1;
          ends[57]=1;
          tdone[57]=1;
        }
        break;
      
    }
  }

  public void thread39097(int [] tdone, int [] ends){
        switch(S26852){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread39096(int [] tdone, int [] ends){
        switch(S26882){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        switch(S26858){
          case 0 : 
            thread39097(tdone,ends);
            thread39098(tdone,ends);
            int biggest39099 = 0;
            if(ends[56]>=biggest39099){
              biggest39099=ends[56];
            }
            if(ends[57]>=biggest39099){
              biggest39099=ends[57];
            }
            if(biggest39099 == 1){
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            if(biggest39099 == 2){
              ends[55]=2;
              ;//sysj\conveyor_controller.sysj line: 421, column: 18
              S26858=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            //FINXME code
            if(biggest39099 == 0){
              S26858=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
          case 1 : 
            S26858=1;
            S26858=0;
            if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
              thread39100(tdone,ends);
              thread39101(tdone,ends);
              int biggest39102 = 0;
              if(ends[56]>=biggest39102){
                biggest39102=ends[56];
              }
              if(ends[57]>=biggest39102){
                biggest39102=ends[57];
              }
              if(biggest39102 == 1){
                active[55]=1;
                ends[55]=1;
                tdone[55]=1;
              }
            }
            else {
              S26858=1;
              active[55]=1;
              ends[55]=1;
              tdone[55]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39095(int [] tdone, int [] ends){
        switch(S26847){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        switch(S26791){
          case 0 : 
            switch(S26771){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                  S26771=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  switch(S26766){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
                        S26766=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                          ends[54]=2;
                          ;//sysj\conveyor_controller.sysj line: 409, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                            currsigs.addElement(bottleAtPos2_48);
                            S26791=1;
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                          else {
                            S26791=1;
                            active[54]=1;
                            ends[54]=1;
                            tdone[54]=1;
                          }
                        }
                        else {
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                        ends[54]=2;
                        ;//sysj\conveyor_controller.sysj line: 409, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                          bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                          currsigs.addElement(bottleAtPos2_48);
                          S26791=1;
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                        else {
                          S26791=1;
                          active[54]=1;
                          ends[54]=1;
                          tdone[54]=1;
                        }
                      }
                      else {
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S26771=1;
                S26771=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                  S26771=1;
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
                else {
                  S26766=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
                    S26766=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                      ends[54]=2;
                      ;//sysj\conveyor_controller.sysj line: 409, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                        bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                        currsigs.addElement(bottleAtPos2_48);
                        S26791=1;
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                      else {
                        S26791=1;
                        active[54]=1;
                        ends[54]=1;
                        tdone[54]=1;
                      }
                    }
                    else {
                      active[54]=1;
                      ends[54]=1;
                      tdone[54]=1;
                    }
                  }
                  else {
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S26791=1;
            S26791=0;
            S26771=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
              S26771=1;
              active[54]=1;
              ends[54]=1;
              tdone[54]=1;
            }
            else {
              S26766=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
                S26766=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
                  ends[54]=2;
                  ;//sysj\conveyor_controller.sysj line: 409, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
                    bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
                    currsigs.addElement(bottleAtPos2_48);
                    S26791=1;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                  else {
                    S26791=1;
                    active[54]=1;
                    ends[54]=1;
                    tdone[54]=1;
                  }
                }
                else {
                  active[54]=1;
                  ends[54]=1;
                  tdone[54]=1;
                }
              }
              else {
                active[54]=1;
                ends[54]=1;
                tdone[54]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39093(int [] tdone, int [] ends){
        switch(S25112){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
        currsigs.addElement(dosUnitValveExtend);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread39092(int [] tdone, int [] ends){
        switch(S25107){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 13
        currsigs.addElement(valveInletOnOff);
        active[52]=1;
        ends[52]=1;
        tdone[52]=1;
        break;
      
    }
  }

  public void thread39090(int [] tdone, int [] ends){
        S25112=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread39089(int [] tdone, int [] ends){
        S25107=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 382, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 13
    currsigs.addElement(valveInletOnOff);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread39087(int [] tdone, int [] ends){
        switch(S25028){
      case 0 : 
        active[51]=0;
        ends[51]=0;
        tdone[51]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
        currsigs.addElement(dosUnitValveRetract);
        active[51]=1;
        ends[51]=1;
        tdone[51]=1;
        break;
      
    }
  }

  public void thread39086(int [] tdone, int [] ends){
        switch(S25023){
      case 0 : 
        active[50]=0;
        ends[50]=0;
        tdone[50]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
        currsigs.addElement(valveInjectorOnOff);
        active[50]=1;
        ends[50]=1;
        tdone[50]=1;
        break;
      
    }
  }

  public void thread39084(int [] tdone, int [] ends){
        S25112=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 387, column: 13
    currsigs.addElement(dosUnitValveExtend);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread39083(int [] tdone, int [] ends){
        S25107=1;
    System.out.println("*Filler - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 382, column: 13
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 13
    currsigs.addElement(valveInletOnOff);
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread39081(int [] tdone, int [] ends){
        S25028=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread39080(int [] tdone, int [] ends){
        S25023=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread39078(int [] tdone, int [] ends){
        S25028=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread39077(int [] tdone, int [] ends){
        S25023=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread39075(int [] tdone, int [] ends){
        S25028=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread39074(int [] tdone, int [] ends){
        S25023=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread39072(int [] tdone, int [] ends){
        S25028=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread39071(int [] tdone, int [] ends){
        S25023=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread39069(int [] tdone, int [] ends){
        S25028=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 376, column: 13
    currsigs.addElement(dosUnitValveRetract);
    active[51]=1;
    ends[51]=1;
    tdone[51]=1;
  }

  public void thread39068(int [] tdone, int [] ends){
        S25023=1;
    System.out.println("*Filler - Valve Injector On*");//sysj\conveyor_controller.sysj line: 371, column: 13
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 372, column: 13
    currsigs.addElement(valveInjectorOnOff);
    active[50]=1;
    ends[50]=1;
    tdone[50]=1;
  }

  public void thread39067(int [] tdone, int [] ends){
        switch(S26764){
      case 0 : 
        active[49]=0;
        ends[49]=0;
        tdone[49]=1;
        break;
      
      case 1 : 
        switch(S24915){
          case 0 : 
            if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 363, column: 17
              S24915=1;
              S24922=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 364, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                S24922=1;
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              else {
                S24917=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 364, column: 11
                  S24917=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                    ends[49]=2;
                    ;//sysj\conveyor_controller.sysj line: 364, column: 11
                    S24915=2;
                    __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 360, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                      S24915=3;
                      thread39068(tdone,ends);
                      thread39069(tdone,ends);
                      int biggest39070 = 0;
                      if(ends[50]>=biggest39070){
                        biggest39070=ends[50];
                      }
                      if(ends[51]>=biggest39070){
                        biggest39070=ends[51];
                      }
                      if(biggest39070 == 1){
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
            }
            else {
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            break;
          
          case 1 : 
            switch(S24922){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 364, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                  S24922=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  switch(S24917){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 364, column: 11
                        S24917=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 364, column: 11
                          S24915=2;
                          __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                            ends[49]=2;
                            ;//sysj\conveyor_controller.sysj line: 360, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                            S24915=3;
                            thread39071(tdone,ends);
                            thread39072(tdone,ends);
                            int biggest39073 = 0;
                            if(ends[50]>=biggest39073){
                              biggest39073=ends[50];
                            }
                            if(ends[51]>=biggest39073){
                              biggest39073=ends[51];
                            }
                            if(biggest39073 == 1){
                              active[49]=1;
                              ends[49]=1;
                              tdone[49]=1;
                            }
                          }
                          else {
                            active[49]=1;
                            ends[49]=1;
                            tdone[49]=1;
                          }
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 364, column: 11
                        S24915=2;
                        __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 360, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                          S24915=3;
                          thread39074(tdone,ends);
                          thread39075(tdone,ends);
                          int biggest39076 = 0;
                          if(ends[50]>=biggest39076){
                            biggest39076=ends[50];
                          }
                          if(ends[51]>=biggest39076){
                            biggest39076=ends[51];
                          }
                          if(biggest39076 == 1){
                            active[49]=1;
                            ends[49]=1;
                            tdone[49]=1;
                          }
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S24922=1;
                S24922=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 364, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                  S24922=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S24917=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 364, column: 11
                    S24917=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 364, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 364, column: 11
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 364, column: 11
                      S24915=2;
                      __start_thread_49 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 360, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 360, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
                        S24915=3;
                        thread39077(tdone,ends);
                        thread39078(tdone,ends);
                        int biggest39079 = 0;
                        if(ends[50]>=biggest39079){
                          biggest39079=ends[50];
                        }
                        if(ends[51]>=biggest39079){
                          biggest39079=ends[51];
                        }
                        if(biggest39079 == 1){
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_49 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 360, column: 9
              ends[49]=2;
              ;//sysj\conveyor_controller.sysj line: 360, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 367, column: 11
              S24915=3;
              thread39080(tdone,ends);
              thread39081(tdone,ends);
              int biggest39082 = 0;
              if(ends[50]>=biggest39082){
                biggest39082=ends[50];
              }
              if(ends[51]>=biggest39082){
                biggest39082=ends[51];
              }
              if(biggest39082 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
            }
            else {
              active[49]=1;
              ends[49]=1;
              tdone[49]=1;
            }
            break;
          
          case 3 : 
            if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 369, column: 17
              S24915=4;
              thread39083(tdone,ends);
              thread39084(tdone,ends);
              int biggest39085 = 0;
              if(ends[52]>=biggest39085){
                biggest39085=ends[52];
              }
              if(ends[53]>=biggest39085){
                biggest39085=ends[53];
              }
              if(biggest39085 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
            }
            else {
              thread39086(tdone,ends);
              thread39087(tdone,ends);
              int biggest39088 = 0;
              if(ends[50]>=biggest39088){
                biggest39088=ends[50];
              }
              if(ends[51]>=biggest39088){
                biggest39088=ends[51];
              }
              if(biggest39088 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              //FINXME code
              if(biggest39088 == 0){
                S24915=4;
                thread39089(tdone,ends);
                thread39090(tdone,ends);
                int biggest39091 = 0;
                if(ends[52]>=biggest39091){
                  biggest39091=ends[52];
                }
                if(ends[53]>=biggest39091){
                  biggest39091=ends[53];
                }
                if(biggest39091 == 1){
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
            }
            break;
          
          case 4 : 
            if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 380, column: 17
              S24915=5;
              S25148=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                S25148=1;
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              else {
                S25143=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S25143=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                    ends[49]=2;
                    ;//sysj\conveyor_controller.sysj line: 392, column: 11
                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                    S24915=6;
                    S25221=0;
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
              }
            }
            else {
              thread39092(tdone,ends);
              thread39093(tdone,ends);
              int biggest39094 = 0;
              if(ends[52]>=biggest39094){
                biggest39094=ends[52];
              }
              if(ends[53]>=biggest39094){
                biggest39094=ends[53];
              }
              if(biggest39094 == 1){
                active[49]=1;
                ends[49]=1;
                tdone[49]=1;
              }
              //FINXME code
              if(biggest39094 == 0){
                S24915=5;
                S25148=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S25148=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S25143=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                    S25143=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 392, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                      S24915=6;
                      S25221=0;
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
              }
            }
            break;
          
          case 5 : 
            switch(S25148){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S25148=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  switch(S25143){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                        S25143=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                          ends[49]=2;
                          ;//sysj\conveyor_controller.sysj line: 392, column: 11
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                          S24915=6;
                          S25221=0;
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                        else {
                          active[49]=1;
                          ends[49]=1;
                          tdone[49]=1;
                        }
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                        ends[49]=2;
                        ;//sysj\conveyor_controller.sysj line: 392, column: 11
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                        S24915=6;
                        S25221=0;
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      else {
                        active[49]=1;
                        ends[49]=1;
                        tdone[49]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S25148=1;
                S25148=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 392, column: 11
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                  S25148=1;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  S25143=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 392, column: 11
                    S25143=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 392, column: 11
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 392, column: 11
                      ends[49]=2;
                      ;//sysj\conveyor_controller.sysj line: 392, column: 11
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 393, column: 11
                      S24915=6;
                      S25221=0;
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                    else {
                      active[49]=1;
                      ends[49]=1;
                      tdone[49]=1;
                    }
                  }
                  else {
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S25221){
              case 0 : 
                if(!bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 396, column: 18
                  S25221=1;
                  if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 21
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                  else {
                    ends[49]=2;
                    ;//sysj\conveyor_controller.sysj line: 395, column: 11
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
                    S24915=0;
                    active[49]=1;
                    ends[49]=1;
                    tdone[49]=1;
                  }
                }
                else {
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 398, column: 21
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                else {
                  ends[49]=2;
                  ;//sysj\conveyor_controller.sysj line: 395, column: 11
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
                  S24915=0;
                  active[49]=1;
                  ends[49]=1;
                  tdone[49]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread39064(int [] tdone, int [] ends){
        S26855=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread39063(int [] tdone, int [] ends){
        S26852=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread39062(int [] tdone, int [] ends){
        S26882=1;
    S26858=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread39063(tdone,ends);
      thread39064(tdone,ends);
      int biggest39065 = 0;
      if(ends[56]>=biggest39065){
        biggest39065=ends[56];
      }
      if(ends[57]>=biggest39065){
        biggest39065=ends[57];
      }
      if(biggest39065 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26858=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread39061(int [] tdone, int [] ends){
        S26847=1;
    S26791=0;
    S26771=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26771=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26766=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26766=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread39060(int [] tdone, int [] ends){
        S26764=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24915=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread39057(int [] tdone, int [] ends){
        S26855=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread39056(int [] tdone, int [] ends){
        S26852=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread39055(int [] tdone, int [] ends){
        S26882=1;
    S26858=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread39056(tdone,ends);
      thread39057(tdone,ends);
      int biggest39058 = 0;
      if(ends[56]>=biggest39058){
        biggest39058=ends[56];
      }
      if(ends[57]>=biggest39058){
        biggest39058=ends[57];
      }
      if(biggest39058 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26858=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread39054(int [] tdone, int [] ends){
        S26847=1;
    S26791=0;
    S26771=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26771=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26766=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26766=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread39053(int [] tdone, int [] ends){
        S26764=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24915=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread39050(int [] tdone, int [] ends){
        S26855=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread39049(int [] tdone, int [] ends){
        S26852=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread39048(int [] tdone, int [] ends){
        S26882=1;
    S26858=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread39049(tdone,ends);
      thread39050(tdone,ends);
      int biggest39051 = 0;
      if(ends[56]>=biggest39051){
        biggest39051=ends[56];
      }
      if(ends[57]>=biggest39051){
        biggest39051=ends[57];
      }
      if(biggest39051 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26858=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread39047(int [] tdone, int [] ends){
        S26847=1;
    S26791=0;
    S26771=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26771=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26766=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26766=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread39046(int [] tdone, int [] ends){
        S26764=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24915=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void thread39043(int [] tdone, int [] ends){
        S26855=1;
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread39042(int [] tdone, int [] ends){
        S26852=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread39041(int [] tdone, int [] ends){
        S26882=1;
    S26858=0;
    if(bottleAtPos2_48.getprestatus()){//sysj\conveyor_controller.sysj line: 420, column: 26
      thread39042(tdone,ends);
      thread39043(tdone,ends);
      int biggest39044 = 0;
      if(ends[56]>=biggest39044){
        biggest39044=ends[56];
      }
      if(ends[57]>=biggest39044){
        biggest39044=ends[57];
      }
      if(biggest39044 == 1){
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
      }
    }
    else {
      S26858=1;
      active[55]=1;
      ends[55]=1;
      tdone[55]=1;
    }
  }

  public void thread39040(int [] tdone, int [] ends){
        S26847=1;
    S26791=0;
    S26771=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 409, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
      S26771=1;
      active[54]=1;
      ends[54]=1;
      tdone[54]=1;
    }
    else {
      S26766=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 409, column: 12
        S26766=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 409, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 409, column: 12
          ends[54]=2;
          ;//sysj\conveyor_controller.sysj line: 409, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 410, column: 15
            bottleAtPos2_48.setPresent();//sysj\conveyor_controller.sysj line: 411, column: 13
            currsigs.addElement(bottleAtPos2_48);
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
          else {
            S26791=1;
            active[54]=1;
            ends[54]=1;
            tdone[54]=1;
          }
        }
        else {
          active[54]=1;
          ends[54]=1;
          tdone[54]=1;
        }
      }
      else {
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
      }
    }
  }

  public void thread39039(int [] tdone, int [] ends){
        S26764=1;
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 362, column: 14
    S24915=0;
    active[49]=1;
    ends[49]=1;
    tdone[49]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S32794){
        case 0 : 
          S32794=0;
          break RUN;
        
        case 1 : 
          S32794=2;
          S32794=2;
          bottleAtPos2_48.setClear();//sysj\conveyor_controller.sysj line: 356, column: 9
          S32793=0;
          S24897=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 357, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
            S24897=1;
            active[48]=1;
            ends[48]=1;
            break RUN;
          }
          else {
            S24892=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 357, column: 9
              S24892=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                ends[48]=2;
                ;//sysj\conveyor_controller.sysj line: 357, column: 9
                S32793=1;
                thread39039(tdone,ends);
                thread39040(tdone,ends);
                thread39041(tdone,ends);
                int biggest39045 = 0;
                if(ends[49]>=biggest39045){
                  biggest39045=ends[49];
                }
                if(ends[54]>=biggest39045){
                  biggest39045=ends[54];
                }
                if(ends[55]>=biggest39045){
                  biggest39045=ends[55];
                }
                if(biggest39045 == 1){
                  active[48]=1;
                  ends[48]=1;
                  break RUN;
                }
              }
              else {
                active[48]=1;
                ends[48]=1;
                break RUN;
              }
            }
            else {
              active[48]=1;
              ends[48]=1;
              break RUN;
            }
          }
        
        case 2 : 
          bottleAtPos2_48.setClear();//sysj\conveyor_controller.sysj line: 356, column: 9
          switch(S32793){
            case 0 : 
              switch(S24897){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 357, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                    S24897=1;
                    active[48]=1;
                    ends[48]=1;
                    break RUN;
                  }
                  else {
                    switch(S24892){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 357, column: 9
                          S24892=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                            ends[48]=2;
                            ;//sysj\conveyor_controller.sysj line: 357, column: 9
                            S32793=1;
                            thread39046(tdone,ends);
                            thread39047(tdone,ends);
                            thread39048(tdone,ends);
                            int biggest39052 = 0;
                            if(ends[49]>=biggest39052){
                              biggest39052=ends[49];
                            }
                            if(ends[54]>=biggest39052){
                              biggest39052=ends[54];
                            }
                            if(ends[55]>=biggest39052){
                              biggest39052=ends[55];
                            }
                            if(biggest39052 == 1){
                              active[48]=1;
                              ends[48]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[48]=1;
                            ends[48]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[48]=1;
                          ends[48]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                          ends[48]=2;
                          ;//sysj\conveyor_controller.sysj line: 357, column: 9
                          S32793=1;
                          thread39053(tdone,ends);
                          thread39054(tdone,ends);
                          thread39055(tdone,ends);
                          int biggest39059 = 0;
                          if(ends[49]>=biggest39059){
                            biggest39059=ends[49];
                          }
                          if(ends[54]>=biggest39059){
                            biggest39059=ends[54];
                          }
                          if(ends[55]>=biggest39059){
                            biggest39059=ends[55];
                          }
                          if(biggest39059 == 1){
                            active[48]=1;
                            ends[48]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[48]=1;
                          ends[48]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S24897=1;
                  S24897=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 357, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                    S24897=1;
                    active[48]=1;
                    ends[48]=1;
                    break RUN;
                  }
                  else {
                    S24892=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 357, column: 9
                      S24892=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 357, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 357, column: 9
                        ends[48]=2;
                        ;//sysj\conveyor_controller.sysj line: 357, column: 9
                        S32793=1;
                        thread39060(tdone,ends);
                        thread39061(tdone,ends);
                        thread39062(tdone,ends);
                        int biggest39066 = 0;
                        if(ends[49]>=biggest39066){
                          biggest39066=ends[49];
                        }
                        if(ends[54]>=biggest39066){
                          biggest39066=ends[54];
                        }
                        if(ends[55]>=biggest39066){
                          biggest39066=ends[55];
                        }
                        if(biggest39066 == 1){
                          active[48]=1;
                          ends[48]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[48]=1;
                        ends[48]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[48]=1;
                      ends[48]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread39067(tdone,ends);
              thread39095(tdone,ends);
              thread39096(tdone,ends);
              int biggest39103 = 0;
              if(ends[49]>=biggest39103){
                biggest39103=ends[49];
              }
              if(ends[54]>=biggest39103){
                biggest39103=ends[54];
              }
              if(ends[55]>=biggest39103){
                biggest39103=ends[55];
              }
              if(biggest39103 == 1){
                active[48]=1;
                ends[48]=1;
                break RUN;
              }
              //FINXME code
              if(biggest39103 == 0){
                S32794=0;
                active[48]=0;
                ends[48]=0;
                S32794=0;
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
    bottleAtPos2_48 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[48] != 0){
      int index = 48;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[48]!=0 || suspended[48]!=0 || active[48]!=1);
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
      bottleAtPos2_48.setpreclear();
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
      bottleAtPos2_48.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[48]!=0 || suspended[48]!=0 || active[48]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[48] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
