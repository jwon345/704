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
  private Signal filler1_51;
  private Signal filler2_51;
  private Signal filler3_51;
  private Signal filler4_51;
  private Signal filler1_amount_51;
  private Signal filler2_amount_51;
  private Signal filler3_amount_51;
  private Signal filler4_amount_51;
  private Signal current_fill_51;
  private Signal total_fill_51;
  private Signal bottleAtPos2_51;
  private int current_thread_52;//sysj\conveyor_controller.sysj line: 378, column: 16
  private int total_thread_52;//sysj\conveyor_controller.sysj line: 379, column: 16
  private long __start_thread_52;//sysj\conveyor_controller.sysj line: 377, column: 9
  private int S148319 = 1;
  private int S148318 = 1;
  private int S38262 = 1;
  private int S38257 = 1;
  private int S65669 = 1;
  private int S38281 = 1;
  private int S38288 = 1;
  private int S38283 = 1;
  private int S38438 = 1;
  private int S38389 = 1;
  private int S38394 = 1;
  private int S38403 = 1;
  private int S38408 = 1;
  private int S38786 = 1;
  private int S38737 = 1;
  private int S38742 = 1;
  private int S38751 = 1;
  private int S38756 = 1;
  private int S39250 = 1;
  private int S39201 = 1;
  private int S39206 = 1;
  private int S39215 = 1;
  private int S39220 = 1;
  private int S39830 = 1;
  private int S39781 = 1;
  private int S39786 = 1;
  private int S39795 = 1;
  private int S39800 = 1;
  private int S40476 = 1;
  private int S40471 = 1;
  private int S40791 = 1;
  private int S65752 = 1;
  private int S65696 = 1;
  private int S65676 = 1;
  private int S65671 = 1;
  private int S65787 = 1;
  private int S65763 = 1;
  private int S65757 = 1;
  private int S65760 = 1;
  
  private int[] ends = new int[100];
  private int[] tdone = new int[100];
  
  public void thread212945(int [] tdone, int [] ends){
        S65760=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212944(int [] tdone, int [] ends){
        S65757=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 551, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212942(int [] tdone, int [] ends){
        switch(S65760){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 555, column: 35
          ends[72]=2;
          tdone[72]=1;
        }
        else {
          active[72]=1;
          ends[72]=1;
          tdone[72]=1;
        }
        break;
      
    }
  }

  public void thread212941(int [] tdone, int [] ends){
        switch(S65757){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 551, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread212940(int [] tdone, int [] ends){
        switch(S65787){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        switch(S65763){
          case 0 : 
            thread212941(tdone,ends);
            thread212942(tdone,ends);
            int biggest212943 = 0;
            if(ends[71]>=biggest212943){
              biggest212943=ends[71];
            }
            if(ends[72]>=biggest212943){
              biggest212943=ends[72];
            }
            if(biggest212943 == 1){
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            if(biggest212943 == 2){
              ends[70]=2;
              ;//sysj\conveyor_controller.sysj line: 549, column: 18
              S65763=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            //FINXME code
            if(biggest212943 == 0){
              S65763=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
          case 1 : 
            S65763=1;
            S65763=0;
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 548, column: 26
              thread212944(tdone,ends);
              thread212945(tdone,ends);
              int biggest212946 = 0;
              if(ends[71]>=biggest212946){
                biggest212946=ends[71];
              }
              if(ends[72]>=biggest212946){
                biggest212946=ends[72];
              }
              if(biggest212946 == 1){
                active[70]=1;
                ends[70]=1;
                tdone[70]=1;
              }
            }
            else {
              S65763=1;
              active[70]=1;
              ends[70]=1;
              tdone[70]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212939(int [] tdone, int [] ends){
        switch(S65752){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        switch(S65696){
          case 0 : 
            switch(S65676){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
                  S65676=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  switch(S65671){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
                        S65671=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
                          ends[69]=2;
                          ;//sysj\conveyor_controller.sysj line: 537, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
                            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
                            currsigs.addElement(bottleAtPos2_51);
                            S65696=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                          else {
                            S65696=1;
                            active[69]=1;
                            ends[69]=1;
                            tdone[69]=1;
                          }
                        }
                        else {
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
                        ends[69]=2;
                        ;//sysj\conveyor_controller.sysj line: 537, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
                          bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
                          currsigs.addElement(bottleAtPos2_51);
                          S65696=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                        else {
                          S65696=1;
                          active[69]=1;
                          ends[69]=1;
                          tdone[69]=1;
                        }
                      }
                      else {
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S65676=1;
                S65676=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
                  S65676=1;
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
                else {
                  S65671=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
                    S65671=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
                      ends[69]=2;
                      ;//sysj\conveyor_controller.sysj line: 537, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
                        bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
                        currsigs.addElement(bottleAtPos2_51);
                        S65696=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                      else {
                        S65696=1;
                        active[69]=1;
                        ends[69]=1;
                        tdone[69]=1;
                      }
                    }
                    else {
                      active[69]=1;
                      ends[69]=1;
                      tdone[69]=1;
                    }
                  }
                  else {
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S65696=1;
            S65696=0;
            S65676=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
              S65676=1;
              active[69]=1;
              ends[69]=1;
              tdone[69]=1;
            }
            else {
              S65671=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
                S65671=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
                  ends[69]=2;
                  ;//sysj\conveyor_controller.sysj line: 537, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
                    bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
                    currsigs.addElement(bottleAtPos2_51);
                    S65696=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                  else {
                    S65696=1;
                    active[69]=1;
                    ends[69]=1;
                    tdone[69]=1;
                  }
                }
                else {
                  active[69]=1;
                  ends[69]=1;
                  tdone[69]=1;
                }
              }
              else {
                active[69]=1;
                ends[69]=1;
                tdone[69]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212937(int [] tdone, int [] ends){
        switch(S39800){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread212936(int [] tdone, int [] ends){
        switch(S39795){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread212934(int [] tdone, int [] ends){
        S39800=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread212933(int [] tdone, int [] ends){
        S39795=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 500, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread212931(int [] tdone, int [] ends){
        switch(S39786){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread212930(int [] tdone, int [] ends){
        switch(S39781){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread212928(int [] tdone, int [] ends){
        S39800=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 505, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread212927(int [] tdone, int [] ends){
        S39795=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 500, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 501, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread212925(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212924(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212922(int [] tdone, int [] ends){
        switch(S39220){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 476, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread212921(int [] tdone, int [] ends){
        switch(S39215){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread212919(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212918(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212916(int [] tdone, int [] ends){
        S39220=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 476, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread212915(int [] tdone, int [] ends){
        S39215=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 471, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread212913(int [] tdone, int [] ends){
        switch(S39206){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread212912(int [] tdone, int [] ends){
        switch(S39201){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread212910(int [] tdone, int [] ends){
        S39220=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 476, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread212909(int [] tdone, int [] ends){
        S39215=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 471, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 472, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread212907(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212906(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212904(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212903(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212901(int [] tdone, int [] ends){
        switch(S38756){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 446, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread212900(int [] tdone, int [] ends){
        switch(S38751){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread212898(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212897(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212895(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212894(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212892(int [] tdone, int [] ends){
        S38756=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 446, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread212891(int [] tdone, int [] ends){
        S38751=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 441, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread212889(int [] tdone, int [] ends){
        switch(S38742){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread212888(int [] tdone, int [] ends){
        switch(S38737){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread212886(int [] tdone, int [] ends){
        S38756=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 446, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread212885(int [] tdone, int [] ends){
        S38751=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 441, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread212883(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212882(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212880(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212879(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212877(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212876(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212874(int [] tdone, int [] ends){
        switch(S38408){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[56]=1;
        ends[56]=1;
        tdone[56]=1;
        break;
      
    }
  }

  public void thread212873(int [] tdone, int [] ends){
        switch(S38403){
      case 0 : 
        active[55]=0;
        ends[55]=0;
        tdone[55]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 32
        currsigs.addElement(valveInletOnOff);
        active[55]=1;
        ends[55]=1;
        tdone[55]=1;
        break;
      
    }
  }

  public void thread212871(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212870(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212868(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212867(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212865(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212864(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212862(int [] tdone, int [] ends){
        S38408=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread212861(int [] tdone, int [] ends){
        S38403=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 411, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread212859(int [] tdone, int [] ends){
        switch(S38394){
      case 0 : 
        active[54]=0;
        ends[54]=0;
        tdone[54]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[54]=1;
        ends[54]=1;
        tdone[54]=1;
        break;
      
    }
  }

  public void thread212858(int [] tdone, int [] ends){
        switch(S38389){
      case 0 : 
        active[53]=0;
        ends[53]=0;
        tdone[53]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[53]=1;
        ends[53]=1;
        tdone[53]=1;
        break;
      
    }
  }

  public void thread212856(int [] tdone, int [] ends){
        S38408=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 416, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread212855(int [] tdone, int [] ends){
        S38403=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 411, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 412, column: 32
    currsigs.addElement(valveInletOnOff);
    active[55]=1;
    ends[55]=1;
    tdone[55]=1;
  }

  public void thread212853(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212852(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212850(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212849(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212847(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212846(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212844(int [] tdone, int [] ends){
        S38394=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212843(int [] tdone, int [] ends){
        S38389=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212841(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212840(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212838(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212837(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212835(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212834(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212832(int [] tdone, int [] ends){
        S38394=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212831(int [] tdone, int [] ends){
        S38389=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212829(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212828(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212826(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212825(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212823(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212822(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212820(int [] tdone, int [] ends){
        S38394=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212819(int [] tdone, int [] ends){
        S38389=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212817(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212816(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212814(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212813(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212811(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212810(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212808(int [] tdone, int [] ends){
        S38394=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212807(int [] tdone, int [] ends){
        S38389=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212805(int [] tdone, int [] ends){
        S39786=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread212804(int [] tdone, int [] ends){
        S39781=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread212802(int [] tdone, int [] ends){
        S39206=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 466, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread212801(int [] tdone, int [] ends){
        S39201=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 461, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 462, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread212799(int [] tdone, int [] ends){
        S38742=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 436, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread212798(int [] tdone, int [] ends){
        S38737=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 431, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread212796(int [] tdone, int [] ends){
        S38394=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 406, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[54]=1;
    ends[54]=1;
    tdone[54]=1;
  }

  public void thread212795(int [] tdone, int [] ends){
        S38389=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 401, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 402, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[53]=1;
    ends[53]=1;
    tdone[53]=1;
  }

  public void thread212794(int [] tdone, int [] ends){
        switch(S65669){
      case 0 : 
        active[52]=0;
        ends[52]=0;
        tdone[52]=1;
        break;
      
      case 1 : 
        switch(S38281){
          case 0 : 
            if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 390, column: 26
              S38281=1;
              S38288=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                S38288=1;
                active[52]=1;
                ends[52]=1;
                tdone[52]=1;
              }
              else {
                S38283=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 391, column: 20
                  S38283=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 391, column: 20
                    S38281=2;
                    __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 377, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                      S38281=3;
                      if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                        S38438=0;
                        thread212795(tdone,ends);
                        thread212796(tdone,ends);
                        int biggest212797 = 0;
                        if(ends[53]>=biggest212797){
                          biggest212797=ends[53];
                        }
                        if(ends[54]>=biggest212797){
                          biggest212797=ends[54];
                        }
                        if(biggest212797 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S38281=4;
                        if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                          S38786=0;
                          thread212798(tdone,ends);
                          thread212799(tdone,ends);
                          int biggest212800 = 0;
                          if(ends[57]>=biggest212800){
                            biggest212800=ends[57];
                          }
                          if(ends[58]>=biggest212800){
                            biggest212800=ends[58];
                          }
                          if(biggest212800 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S38281=5;
                          if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                            S39250=0;
                            thread212801(tdone,ends);
                            thread212802(tdone,ends);
                            int biggest212803 = 0;
                            if(ends[61]>=biggest212803){
                              biggest212803=ends[61];
                            }
                            if(ends[62]>=biggest212803){
                              biggest212803=ends[62];
                            }
                            if(biggest212803 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S38281=6;
                            if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                              S39830=0;
                              thread212804(tdone,ends);
                              thread212805(tdone,ends);
                              int biggest212806 = 0;
                              if(ends[65]>=biggest212806){
                                biggest212806=ends[65];
                              }
                              if(ends[66]>=biggest212806){
                                biggest212806=ends[66];
                              }
                              if(biggest212806 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38281=7;
                              S40476=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                S40476=1;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                S40471=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                                  S40471=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                    ends[52]=2;
                                    ;//sysj\conveyor_controller.sysj line: 516, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                                    S38281=8;
                                    S40791=0;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 1 : 
            switch(S38288){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                  S38288=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S38283){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 391, column: 20
                        S38283=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 391, column: 20
                          S38281=2;
                          __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 377, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                            S38281=3;
                            if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                              S38438=0;
                              thread212807(tdone,ends);
                              thread212808(tdone,ends);
                              int biggest212809 = 0;
                              if(ends[53]>=biggest212809){
                                biggest212809=ends[53];
                              }
                              if(ends[54]>=biggest212809){
                                biggest212809=ends[54];
                              }
                              if(biggest212809 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38281=4;
                              if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                                S38786=0;
                                thread212810(tdone,ends);
                                thread212811(tdone,ends);
                                int biggest212812 = 0;
                                if(ends[57]>=biggest212812){
                                  biggest212812=ends[57];
                                }
                                if(ends[58]>=biggest212812){
                                  biggest212812=ends[58];
                                }
                                if(biggest212812 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S38281=5;
                                if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                                  S39250=0;
                                  thread212813(tdone,ends);
                                  thread212814(tdone,ends);
                                  int biggest212815 = 0;
                                  if(ends[61]>=biggest212815){
                                    biggest212815=ends[61];
                                  }
                                  if(ends[62]>=biggest212815){
                                    biggest212815=ends[62];
                                  }
                                  if(biggest212815 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  S38281=6;
                                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                    S39830=0;
                                    thread212816(tdone,ends);
                                    thread212817(tdone,ends);
                                    int biggest212818 = 0;
                                    if(ends[65]>=biggest212818){
                                      biggest212818=ends[65];
                                    }
                                    if(ends[66]>=biggest212818){
                                      biggest212818=ends[66];
                                    }
                                    if(biggest212818 == 1){
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    S38281=7;
                                    S40476=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                      S40476=1;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      S40471=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                                        S40471=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                          ends[52]=2;
                                          ;//sysj\conveyor_controller.sysj line: 516, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                                          S38281=8;
                                          S40791=0;
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                        else {
                                          active[52]=1;
                                          ends[52]=1;
                                          tdone[52]=1;
                                        }
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 391, column: 20
                        S38281=2;
                        __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 377, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                          S38281=3;
                          if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                            S38438=0;
                            thread212819(tdone,ends);
                            thread212820(tdone,ends);
                            int biggest212821 = 0;
                            if(ends[53]>=biggest212821){
                              biggest212821=ends[53];
                            }
                            if(ends[54]>=biggest212821){
                              biggest212821=ends[54];
                            }
                            if(biggest212821 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S38281=4;
                            if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                              S38786=0;
                              thread212822(tdone,ends);
                              thread212823(tdone,ends);
                              int biggest212824 = 0;
                              if(ends[57]>=biggest212824){
                                biggest212824=ends[57];
                              }
                              if(ends[58]>=biggest212824){
                                biggest212824=ends[58];
                              }
                              if(biggest212824 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38281=5;
                              if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                                S39250=0;
                                thread212825(tdone,ends);
                                thread212826(tdone,ends);
                                int biggest212827 = 0;
                                if(ends[61]>=biggest212827){
                                  biggest212827=ends[61];
                                }
                                if(ends[62]>=biggest212827){
                                  biggest212827=ends[62];
                                }
                                if(biggest212827 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S38281=6;
                                if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                  S39830=0;
                                  thread212828(tdone,ends);
                                  thread212829(tdone,ends);
                                  int biggest212830 = 0;
                                  if(ends[65]>=biggest212830){
                                    biggest212830=ends[65];
                                  }
                                  if(ends[66]>=biggest212830){
                                    biggest212830=ends[66];
                                  }
                                  if(biggest212830 == 1){
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                                else {
                                  S38281=7;
                                  S40476=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                    S40476=1;
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                  else {
                                    S40471=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                                      S40471=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                        ends[52]=2;
                                        ;//sysj\conveyor_controller.sysj line: 516, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                                        S38281=8;
                                        S40791=0;
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                      else {
                                        active[52]=1;
                                        ends[52]=1;
                                        tdone[52]=1;
                                      }
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S38288=1;
                S38288=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 391, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                  S38288=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S38283=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 391, column: 20
                    S38283=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 391, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 391, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 391, column: 20
                      S38281=2;
                      __start_thread_52 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 377, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 377, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
                        S38281=3;
                        if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                          S38438=0;
                          thread212831(tdone,ends);
                          thread212832(tdone,ends);
                          int biggest212833 = 0;
                          if(ends[53]>=biggest212833){
                            biggest212833=ends[53];
                          }
                          if(ends[54]>=biggest212833){
                            biggest212833=ends[54];
                          }
                          if(biggest212833 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S38281=4;
                          if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                            S38786=0;
                            thread212834(tdone,ends);
                            thread212835(tdone,ends);
                            int biggest212836 = 0;
                            if(ends[57]>=biggest212836){
                              biggest212836=ends[57];
                            }
                            if(ends[58]>=biggest212836){
                              biggest212836=ends[58];
                            }
                            if(biggest212836 == 1){
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            S38281=5;
                            if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                              S39250=0;
                              thread212837(tdone,ends);
                              thread212838(tdone,ends);
                              int biggest212839 = 0;
                              if(ends[61]>=biggest212839){
                                biggest212839=ends[61];
                              }
                              if(ends[62]>=biggest212839){
                                biggest212839=ends[62];
                              }
                              if(biggest212839 == 1){
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              S38281=6;
                              if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                S39830=0;
                                thread212840(tdone,ends);
                                thread212841(tdone,ends);
                                int biggest212842 = 0;
                                if(ends[65]>=biggest212842){
                                  biggest212842=ends[65];
                                }
                                if(ends[66]>=biggest212842){
                                  biggest212842=ends[66];
                                }
                                if(biggest212842 == 1){
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                              }
                              else {
                                S38281=7;
                                S40476=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                  S40476=1;
                                  active[52]=1;
                                  ends[52]=1;
                                  tdone[52]=1;
                                }
                                else {
                                  S40471=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                                    S40471=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                      ends[52]=2;
                                      ;//sysj\conveyor_controller.sysj line: 516, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                                      S38281=8;
                                      S40791=0;
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                    else {
                                      active[52]=1;
                                      ends[52]=1;
                                      tdone[52]=1;
                                    }
                                  }
                                  else {
                                    active[52]=1;
                                    ends[52]=1;
                                    tdone[52]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_52 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 377, column: 9
              ends[52]=2;
              ;//sysj\conveyor_controller.sysj line: 377, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 394, column: 20
              S38281=3;
              if(((filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 397, column: 24
                S38438=0;
                thread212843(tdone,ends);
                thread212844(tdone,ends);
                int biggest212845 = 0;
                if(ends[53]>=biggest212845){
                  biggest212845=ends[53];
                }
                if(ends[54]>=biggest212845){
                  biggest212845=ends[54];
                }
                if(biggest212845 == 1){
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
              }
              else {
                S38281=4;
                if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                  S38786=0;
                  thread212846(tdone,ends);
                  thread212847(tdone,ends);
                  int biggest212848 = 0;
                  if(ends[57]>=biggest212848){
                    biggest212848=ends[57];
                  }
                  if(ends[58]>=biggest212848){
                    biggest212848=ends[58];
                  }
                  if(biggest212848 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  S38281=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                    S39250=0;
                    thread212849(tdone,ends);
                    thread212850(tdone,ends);
                    int biggest212851 = 0;
                    if(ends[61]>=biggest212851){
                      biggest212851=ends[61];
                    }
                    if(ends[62]>=biggest212851){
                      biggest212851=ends[62];
                    }
                    if(biggest212851 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38281=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                      S39830=0;
                      thread212852(tdone,ends);
                      thread212853(tdone,ends);
                      int biggest212854 = 0;
                      if(ends[65]>=biggest212854){
                        biggest212854=ends[65];
                      }
                      if(ends[66]>=biggest212854){
                        biggest212854=ends[66];
                      }
                      if(biggest212854 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38281=7;
                      S40476=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                        S40476=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S40471=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                          S40471=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 516, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                            S38281=8;
                            S40791=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[52]=1;
              ends[52]=1;
              tdone[52]=1;
            }
            break;
          
          case 3 : 
            switch(S38438){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 399, column: 30
                  S38438=1;
                  thread212855(tdone,ends);
                  thread212856(tdone,ends);
                  int biggest212857 = 0;
                  if(ends[55]>=biggest212857){
                    biggest212857=ends[55];
                  }
                  if(ends[56]>=biggest212857){
                    biggest212857=ends[56];
                  }
                  if(biggest212857 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread212858(tdone,ends);
                  thread212859(tdone,ends);
                  int biggest212860 = 0;
                  if(ends[53]>=biggest212860){
                    biggest212860=ends[53];
                  }
                  if(ends[54]>=biggest212860){
                    biggest212860=ends[54];
                  }
                  if(biggest212860 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212860 == 0){
                    S38438=1;
                    thread212861(tdone,ends);
                    thread212862(tdone,ends);
                    int biggest212863 = 0;
                    if(ends[55]>=biggest212863){
                      biggest212863=ends[55];
                    }
                    if(ends[56]>=biggest212863){
                      biggest212863=ends[56];
                    }
                    if(biggest212863 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 409, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 420, column: 24
                  current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 421, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 422, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 423, column: 24
                  S38281=4;
                  if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                    S38786=0;
                    thread212864(tdone,ends);
                    thread212865(tdone,ends);
                    int biggest212866 = 0;
                    if(ends[57]>=biggest212866){
                      biggest212866=ends[57];
                    }
                    if(ends[58]>=biggest212866){
                      biggest212866=ends[58];
                    }
                    if(biggest212866 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38281=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                      S39250=0;
                      thread212867(tdone,ends);
                      thread212868(tdone,ends);
                      int biggest212869 = 0;
                      if(ends[61]>=biggest212869){
                        biggest212869=ends[61];
                      }
                      if(ends[62]>=biggest212869){
                        biggest212869=ends[62];
                      }
                      if(biggest212869 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38281=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                        S39830=0;
                        thread212870(tdone,ends);
                        thread212871(tdone,ends);
                        int biggest212872 = 0;
                        if(ends[65]>=biggest212872){
                          biggest212872=ends[65];
                        }
                        if(ends[66]>=biggest212872){
                          biggest212872=ends[66];
                        }
                        if(biggest212872 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S38281=7;
                        S40476=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                          S40476=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S40471=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                            S40471=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 516, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                              S38281=8;
                              S40791=0;
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                      }
                    }
                  }
                }
                else {
                  thread212873(tdone,ends);
                  thread212874(tdone,ends);
                  int biggest212875 = 0;
                  if(ends[55]>=biggest212875){
                    biggest212875=ends[55];
                  }
                  if(ends[56]>=biggest212875){
                    biggest212875=ends[56];
                  }
                  if(biggest212875 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212875 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 420, column: 24
                    current_thread_52 += (filler1_amount_51.getpreval() == null ? 0 : ((Integer)filler1_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 421, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 422, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 423, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 423, column: 24
                    S38281=4;
                    if(((filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 427, column: 24
                      S38786=0;
                      thread212876(tdone,ends);
                      thread212877(tdone,ends);
                      int biggest212878 = 0;
                      if(ends[57]>=biggest212878){
                        biggest212878=ends[57];
                      }
                      if(ends[58]>=biggest212878){
                        biggest212878=ends[58];
                      }
                      if(biggest212878 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38281=5;
                      if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                        S39250=0;
                        thread212879(tdone,ends);
                        thread212880(tdone,ends);
                        int biggest212881 = 0;
                        if(ends[61]>=biggest212881){
                          biggest212881=ends[61];
                        }
                        if(ends[62]>=biggest212881){
                          biggest212881=ends[62];
                        }
                        if(biggest212881 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S38281=6;
                        if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                          S39830=0;
                          thread212882(tdone,ends);
                          thread212883(tdone,ends);
                          int biggest212884 = 0;
                          if(ends[65]>=biggest212884){
                            biggest212884=ends[65];
                          }
                          if(ends[66]>=biggest212884){
                            biggest212884=ends[66];
                          }
                          if(biggest212884 == 1){
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          S38281=7;
                          S40476=0;
                          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                            S40476=1;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            S40471=0;
                            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                              S40471=1;
                              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                                ends[52]=2;
                                ;//sysj\conveyor_controller.sysj line: 516, column: 20
                                System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                                S38281=8;
                                S40791=0;
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                              else {
                                active[52]=1;
                                ends[52]=1;
                                tdone[52]=1;
                              }
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S38786){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 429, column: 30
                  S38786=1;
                  thread212885(tdone,ends);
                  thread212886(tdone,ends);
                  int biggest212887 = 0;
                  if(ends[59]>=biggest212887){
                    biggest212887=ends[59];
                  }
                  if(ends[60]>=biggest212887){
                    biggest212887=ends[60];
                  }
                  if(biggest212887 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread212888(tdone,ends);
                  thread212889(tdone,ends);
                  int biggest212890 = 0;
                  if(ends[57]>=biggest212890){
                    biggest212890=ends[57];
                  }
                  if(ends[58]>=biggest212890){
                    biggest212890=ends[58];
                  }
                  if(biggest212890 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212890 == 0){
                    S38786=1;
                    thread212891(tdone,ends);
                    thread212892(tdone,ends);
                    int biggest212893 = 0;
                    if(ends[59]>=biggest212893){
                      biggest212893=ends[59];
                    }
                    if(ends[60]>=biggest212893){
                      biggest212893=ends[60];
                    }
                    if(biggest212893 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 439, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 450, column: 24
                  current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 451, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 452, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 453, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 453, column: 24
                  S38281=5;
                  if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                    S39250=0;
                    thread212894(tdone,ends);
                    thread212895(tdone,ends);
                    int biggest212896 = 0;
                    if(ends[61]>=biggest212896){
                      biggest212896=ends[61];
                    }
                    if(ends[62]>=biggest212896){
                      biggest212896=ends[62];
                    }
                    if(biggest212896 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38281=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                      S39830=0;
                      thread212897(tdone,ends);
                      thread212898(tdone,ends);
                      int biggest212899 = 0;
                      if(ends[65]>=biggest212899){
                        biggest212899=ends[65];
                      }
                      if(ends[66]>=biggest212899){
                        biggest212899=ends[66];
                      }
                      if(biggest212899 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38281=7;
                      S40476=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                        S40476=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S40471=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                          S40471=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 516, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                            S38281=8;
                            S40791=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                else {
                  thread212900(tdone,ends);
                  thread212901(tdone,ends);
                  int biggest212902 = 0;
                  if(ends[59]>=biggest212902){
                    biggest212902=ends[59];
                  }
                  if(ends[60]>=biggest212902){
                    biggest212902=ends[60];
                  }
                  if(biggest212902 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212902 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 450, column: 24
                    current_thread_52 += (filler2_amount_51.getpreval() == null ? 0 : ((Integer)filler2_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 451, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 452, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 453, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 453, column: 24
                    S38281=5;
                    if(((filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 457, column: 24
                      S39250=0;
                      thread212903(tdone,ends);
                      thread212904(tdone,ends);
                      int biggest212905 = 0;
                      if(ends[61]>=biggest212905){
                        biggest212905=ends[61];
                      }
                      if(ends[62]>=biggest212905){
                        biggest212905=ends[62];
                      }
                      if(biggest212905 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38281=6;
                      if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                        S39830=0;
                        thread212906(tdone,ends);
                        thread212907(tdone,ends);
                        int biggest212908 = 0;
                        if(ends[65]>=biggest212908){
                          biggest212908=ends[65];
                        }
                        if(ends[66]>=biggest212908){
                          biggest212908=ends[66];
                        }
                        if(biggest212908 == 1){
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        S38281=7;
                        S40476=0;
                        if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                          S40476=1;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          S40471=0;
                          if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                            fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                            S40471=1;
                            if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                              fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                              ends[52]=2;
                              ;//sysj\conveyor_controller.sysj line: 516, column: 20
                              System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                              S38281=8;
                              S40791=0;
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                            else {
                              active[52]=1;
                              ends[52]=1;
                              tdone[52]=1;
                            }
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S39250){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 459, column: 30
                  S39250=1;
                  thread212909(tdone,ends);
                  thread212910(tdone,ends);
                  int biggest212911 = 0;
                  if(ends[63]>=biggest212911){
                    biggest212911=ends[63];
                  }
                  if(ends[64]>=biggest212911){
                    biggest212911=ends[64];
                  }
                  if(biggest212911 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread212912(tdone,ends);
                  thread212913(tdone,ends);
                  int biggest212914 = 0;
                  if(ends[61]>=biggest212914){
                    biggest212914=ends[61];
                  }
                  if(ends[62]>=biggest212914){
                    biggest212914=ends[62];
                  }
                  if(biggest212914 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212914 == 0){
                    S39250=1;
                    thread212915(tdone,ends);
                    thread212916(tdone,ends);
                    int biggest212917 = 0;
                    if(ends[63]>=biggest212917){
                      biggest212917=ends[63];
                    }
                    if(ends[64]>=biggest212917){
                      biggest212917=ends[64];
                    }
                    if(biggest212917 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 469, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 480, column: 24
                  current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 481, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 482, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 483, column: 24
                  S38281=6;
                  if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                    S39830=0;
                    thread212918(tdone,ends);
                    thread212919(tdone,ends);
                    int biggest212920 = 0;
                    if(ends[65]>=biggest212920){
                      biggest212920=ends[65];
                    }
                    if(ends[66]>=biggest212920){
                      biggest212920=ends[66];
                    }
                    if(biggest212920 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    S38281=7;
                    S40476=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                      S40476=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S40471=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                        S40471=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 516, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                          S38281=8;
                          S40791=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                else {
                  thread212921(tdone,ends);
                  thread212922(tdone,ends);
                  int biggest212923 = 0;
                  if(ends[63]>=biggest212923){
                    biggest212923=ends[63];
                  }
                  if(ends[64]>=biggest212923){
                    biggest212923=ends[64];
                  }
                  if(biggest212923 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212923 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 480, column: 24
                    current_thread_52 += (filler3_amount_51.getpreval() == null ? 0 : ((Integer)filler3_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 481, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 482, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 483, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 483, column: 24
                    S38281=6;
                    if(((filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) > 0) && (current_thread_52 + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()) <= total_thread_52)){//sysj\conveyor_controller.sysj line: 486, column: 24
                      S39830=0;
                      thread212924(tdone,ends);
                      thread212925(tdone,ends);
                      int biggest212926 = 0;
                      if(ends[65]>=biggest212926){
                        biggest212926=ends[65];
                      }
                      if(ends[66]>=biggest212926){
                        biggest212926=ends[66];
                      }
                      if(biggest212926 == 1){
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      S38281=7;
                      S40476=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                        S40476=1;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        S40471=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                          S40471=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                            ends[52]=2;
                            ;//sysj\conveyor_controller.sysj line: 516, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                            S38281=8;
                            S40791=0;
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                          else {
                            active[52]=1;
                            ends[52]=1;
                            tdone[52]=1;
                          }
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S39830){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 488, column: 30
                  S39830=1;
                  thread212927(tdone,ends);
                  thread212928(tdone,ends);
                  int biggest212929 = 0;
                  if(ends[67]>=biggest212929){
                    biggest212929=ends[67];
                  }
                  if(ends[68]>=biggest212929){
                    biggest212929=ends[68];
                  }
                  if(biggest212929 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  thread212930(tdone,ends);
                  thread212931(tdone,ends);
                  int biggest212932 = 0;
                  if(ends[65]>=biggest212932){
                    biggest212932=ends[65];
                  }
                  if(ends[66]>=biggest212932){
                    biggest212932=ends[66];
                  }
                  if(biggest212932 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212932 == 0){
                    S39830=1;
                    thread212933(tdone,ends);
                    thread212934(tdone,ends);
                    int biggest212935 = 0;
                    if(ends[67]>=biggest212935){
                      biggest212935=ends[67];
                    }
                    if(ends[68]>=biggest212935){
                      biggest212935=ends[68];
                    }
                    if(biggest212935 == 1){
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 498, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 509, column: 24
                  current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 510, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 511, column: 24
                  current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 512, column: 24
                  currsigs.addElement(current_fill_51);
                  current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 512, column: 24
                  S38281=7;
                  S40476=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                    S40476=1;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    S40471=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                      S40471=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 516, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                        S38281=8;
                        S40791=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                }
                else {
                  thread212936(tdone,ends);
                  thread212937(tdone,ends);
                  int biggest212938 = 0;
                  if(ends[67]>=biggest212938){
                    biggest212938=ends[67];
                  }
                  if(ends[68]>=biggest212938){
                    biggest212938=ends[68];
                  }
                  if(biggest212938 == 1){
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  //FINXME code
                  if(biggest212938 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 509, column: 24
                    current_thread_52 += (filler4_amount_51.getpreval() == null ? 0 : ((Integer)filler4_amount_51.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 510, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_52);//sysj\conveyor_controller.sysj line: 511, column: 24
                    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 512, column: 24
                    currsigs.addElement(current_fill_51);
                    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 512, column: 24
                    S38281=7;
                    S40476=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                      S40476=1;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      S40471=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                        S40471=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 516, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                          S38281=8;
                          S40791=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S40476){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                  S40476=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  switch(S40471){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                        S40471=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                          ends[52]=2;
                          ;//sysj\conveyor_controller.sysj line: 516, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                          S38281=8;
                          S40791=0;
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                        else {
                          active[52]=1;
                          ends[52]=1;
                          tdone[52]=1;
                        }
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                        ends[52]=2;
                        ;//sysj\conveyor_controller.sysj line: 516, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                        S38281=8;
                        S40791=0;
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      else {
                        active[52]=1;
                        ends[52]=1;
                        tdone[52]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S40476=1;
                S40476=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 516, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                  S40476=1;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  S40471=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 516, column: 20
                    S40471=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 516, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 516, column: 20
                      ends[52]=2;
                      ;//sysj\conveyor_controller.sysj line: 516, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 517, column: 20
                      S38281=8;
                      S40791=0;
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                    else {
                      active[52]=1;
                      ends[52]=1;
                      tdone[52]=1;
                    }
                  }
                  else {
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S40791){
              case 0 : 
                if(!bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 520, column: 30
                  S40791=1;
                  if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 522, column: 36
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                  else {
                    ends[52]=2;
                    ;//sysj\conveyor_controller.sysj line: 519, column: 20
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
                    S38281=0;
                    active[52]=1;
                    ends[52]=1;
                    tdone[52]=1;
                  }
                }
                else {
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 522, column: 36
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                else {
                  ends[52]=2;
                  ;//sysj\conveyor_controller.sysj line: 519, column: 20
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
                  S38281=0;
                  active[52]=1;
                  ends[52]=1;
                  tdone[52]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread212791(int [] tdone, int [] ends){
        S65760=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212790(int [] tdone, int [] ends){
        S65757=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 551, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212789(int [] tdone, int [] ends){
        S65787=1;
    S65763=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 548, column: 26
      thread212790(tdone,ends);
      thread212791(tdone,ends);
      int biggest212792 = 0;
      if(ends[71]>=biggest212792){
        biggest212792=ends[71];
      }
      if(ends[72]>=biggest212792){
        biggest212792=ends[72];
      }
      if(biggest212792 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65763=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212788(int [] tdone, int [] ends){
        S65752=1;
    S65696=0;
    S65676=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
      S65676=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65671=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
        S65671=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 537, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212787(int [] tdone, int [] ends){
        S65669=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 378, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 379, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 380, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 380, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 381, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 381, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 16
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(125);//sysj\conveyor_controller.sysj line: 383, column: 16
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 16
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 384, column: 16
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 385, column: 16
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 386, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S38281=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread212784(int [] tdone, int [] ends){
        S65760=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212783(int [] tdone, int [] ends){
        S65757=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 551, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212782(int [] tdone, int [] ends){
        S65787=1;
    S65763=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 548, column: 26
      thread212783(tdone,ends);
      thread212784(tdone,ends);
      int biggest212785 = 0;
      if(ends[71]>=biggest212785){
        biggest212785=ends[71];
      }
      if(ends[72]>=biggest212785){
        biggest212785=ends[72];
      }
      if(biggest212785 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65763=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212781(int [] tdone, int [] ends){
        S65752=1;
    S65696=0;
    S65676=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
      S65676=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65671=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
        S65671=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 537, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212780(int [] tdone, int [] ends){
        S65669=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 378, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 379, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 380, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 380, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 381, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 381, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 16
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(125);//sysj\conveyor_controller.sysj line: 383, column: 16
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 16
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 384, column: 16
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 385, column: 16
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 386, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S38281=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread212777(int [] tdone, int [] ends){
        S65760=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212776(int [] tdone, int [] ends){
        S65757=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 551, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212775(int [] tdone, int [] ends){
        S65787=1;
    S65763=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 548, column: 26
      thread212776(tdone,ends);
      thread212777(tdone,ends);
      int biggest212778 = 0;
      if(ends[71]>=biggest212778){
        biggest212778=ends[71];
      }
      if(ends[72]>=biggest212778){
        biggest212778=ends[72];
      }
      if(biggest212778 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65763=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212774(int [] tdone, int [] ends){
        S65752=1;
    S65696=0;
    S65676=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
      S65676=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65671=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
        S65671=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 537, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212773(int [] tdone, int [] ends){
        S65669=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 378, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 379, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 380, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 380, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 381, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 381, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 16
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(125);//sysj\conveyor_controller.sysj line: 383, column: 16
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 16
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 384, column: 16
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 385, column: 16
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 386, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S38281=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void thread212770(int [] tdone, int [] ends){
        S65760=1;
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread212769(int [] tdone, int [] ends){
        S65757=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 551, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread212768(int [] tdone, int [] ends){
        S65787=1;
    S65763=0;
    if(bottleAtPos2_51.getprestatus()){//sysj\conveyor_controller.sysj line: 548, column: 26
      thread212769(tdone,ends);
      thread212770(tdone,ends);
      int biggest212771 = 0;
      if(ends[71]>=biggest212771){
        biggest212771=ends[71];
      }
      if(ends[72]>=biggest212771){
        biggest212771=ends[72];
      }
      if(biggest212771 == 1){
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
      }
    }
    else {
      S65763=1;
      active[70]=1;
      ends[70]=1;
      tdone[70]=1;
    }
  }

  public void thread212767(int [] tdone, int [] ends){
        S65752=1;
    S65696=0;
    S65676=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 537, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
      S65676=1;
      active[69]=1;
      ends[69]=1;
      tdone[69]=1;
    }
    else {
      S65671=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 537, column: 12
        S65671=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 537, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 537, column: 12
          ends[69]=2;
          ;//sysj\conveyor_controller.sysj line: 537, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 538, column: 15
            bottleAtPos2_51.setPresent();//sysj\conveyor_controller.sysj line: 539, column: 13
            currsigs.addElement(bottleAtPos2_51);
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
          else {
            S65696=1;
            active[69]=1;
            ends[69]=1;
            tdone[69]=1;
          }
        }
        else {
          active[69]=1;
          ends[69]=1;
          tdone[69]=1;
        }
      }
      else {
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
      }
    }
  }

  public void thread212766(int [] tdone, int [] ends){
        S65669=1;
    current_thread_52 = 0;//sysj\conveyor_controller.sysj line: 378, column: 16
    total_thread_52 = 100;//sysj\conveyor_controller.sysj line: 379, column: 16
    total_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 380, column: 16
    currsigs.addElement(total_fill_51);
    total_fill_51.setValue(total_thread_52);//sysj\conveyor_controller.sysj line: 380, column: 16
    current_fill_51.setPresent();//sysj\conveyor_controller.sysj line: 381, column: 16
    currsigs.addElement(current_fill_51);
    current_fill_51.setValue(current_thread_52);//sysj\conveyor_controller.sysj line: 381, column: 16
    filler1_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 383, column: 16
    currsigs.addElement(filler1_amount_51);
    filler1_amount_51.setValue(125);//sysj\conveyor_controller.sysj line: 383, column: 16
    filler2_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 384, column: 16
    currsigs.addElement(filler2_amount_51);
    filler2_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 384, column: 16
    filler3_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 385, column: 16
    currsigs.addElement(filler3_amount_51);
    filler3_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 385, column: 16
    filler4_amount_51.setPresent();//sysj\conveyor_controller.sysj line: 386, column: 16
    currsigs.addElement(filler4_amount_51);
    filler4_amount_51.setValue(25);//sysj\conveyor_controller.sysj line: 386, column: 16
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 389, column: 20
    S38281=0;
    active[52]=1;
    ends[52]=1;
    tdone[52]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S148319){
        case 0 : 
          S148319=0;
          break RUN;
        
        case 1 : 
          S148319=2;
          S148319=2;
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 371, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 371, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          S148318=0;
          S38262=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 375, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
            S38262=1;
            active[51]=1;
            ends[51]=1;
            break RUN;
          }
          else {
            S38257=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 375, column: 9
              S38257=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
                ends[51]=2;
                ;//sysj\conveyor_controller.sysj line: 375, column: 9
                S148318=1;
                thread212766(tdone,ends);
                thread212767(tdone,ends);
                thread212768(tdone,ends);
                int biggest212772 = 0;
                if(ends[52]>=biggest212772){
                  biggest212772=ends[52];
                }
                if(ends[69]>=biggest212772){
                  biggest212772=ends[69];
                }
                if(ends[70]>=biggest212772){
                  biggest212772=ends[70];
                }
                if(biggest212772 == 1){
                  active[51]=1;
                  ends[51]=1;
                  break RUN;
                }
              }
              else {
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
            }
            else {
              active[51]=1;
              ends[51]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler2_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler3_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler4_51.setClear();//sysj\conveyor_controller.sysj line: 368, column: 9
          filler1_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler2_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler3_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          filler4_amount_51.setClear();//sysj\conveyor_controller.sysj line: 370, column: 9
          current_fill_51.setClear();//sysj\conveyor_controller.sysj line: 371, column: 9
          total_fill_51.setClear();//sysj\conveyor_controller.sysj line: 371, column: 9
          bottleAtPos2_51.setClear();//sysj\conveyor_controller.sysj line: 373, column: 9
          switch(S148318){
            case 0 : 
              switch(S38262){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 375, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
                    S38262=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    switch(S38257){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 375, column: 9
                          S38257=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
                            ends[51]=2;
                            ;//sysj\conveyor_controller.sysj line: 375, column: 9
                            S148318=1;
                            thread212773(tdone,ends);
                            thread212774(tdone,ends);
                            thread212775(tdone,ends);
                            int biggest212779 = 0;
                            if(ends[52]>=biggest212779){
                              biggest212779=ends[52];
                            }
                            if(ends[69]>=biggest212779){
                              biggest212779=ends[69];
                            }
                            if(ends[70]>=biggest212779){
                              biggest212779=ends[70];
                            }
                            if(biggest212779 == 1){
                              active[51]=1;
                              ends[51]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
                          ends[51]=2;
                          ;//sysj\conveyor_controller.sysj line: 375, column: 9
                          S148318=1;
                          thread212780(tdone,ends);
                          thread212781(tdone,ends);
                          thread212782(tdone,ends);
                          int biggest212786 = 0;
                          if(ends[52]>=biggest212786){
                            biggest212786=ends[52];
                          }
                          if(ends[69]>=biggest212786){
                            biggest212786=ends[69];
                          }
                          if(ends[70]>=biggest212786){
                            biggest212786=ends[70];
                          }
                          if(biggest212786 == 1){
                            active[51]=1;
                            ends[51]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S38262=1;
                  S38262=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 375, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
                    S38262=1;
                    active[51]=1;
                    ends[51]=1;
                    break RUN;
                  }
                  else {
                    S38257=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 375, column: 9
                      S38257=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 375, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 375, column: 9
                        ends[51]=2;
                        ;//sysj\conveyor_controller.sysj line: 375, column: 9
                        S148318=1;
                        thread212787(tdone,ends);
                        thread212788(tdone,ends);
                        thread212789(tdone,ends);
                        int biggest212793 = 0;
                        if(ends[52]>=biggest212793){
                          biggest212793=ends[52];
                        }
                        if(ends[69]>=biggest212793){
                          biggest212793=ends[69];
                        }
                        if(ends[70]>=biggest212793){
                          biggest212793=ends[70];
                        }
                        if(biggest212793 == 1){
                          active[51]=1;
                          ends[51]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[51]=1;
                        ends[51]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[51]=1;
                      ends[51]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread212794(tdone,ends);
              thread212939(tdone,ends);
              thread212940(tdone,ends);
              int biggest212947 = 0;
              if(ends[52]>=biggest212947){
                biggest212947=ends[52];
              }
              if(ends[69]>=biggest212947){
                biggest212947=ends[69];
              }
              if(ends[70]>=biggest212947){
                biggest212947=ends[70];
              }
              if(biggest212947 == 1){
                active[51]=1;
                ends[51]=1;
                break RUN;
              }
              //FINXME code
              if(biggest212947 == 0){
                S148319=0;
                active[51]=0;
                ends[51]=0;
                S148319=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_51 = new Signal();
    filler2_51 = new Signal();
    filler3_51 = new Signal();
    filler4_51 = new Signal();
    filler1_amount_51 = new Signal();
    filler2_amount_51 = new Signal();
    filler3_amount_51 = new Signal();
    filler4_amount_51 = new Signal();
    current_fill_51 = new Signal();
    total_fill_51 = new Signal();
    bottleAtPos2_51 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[51] != 0){
      int index = 51;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
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
      filler1_51.setpreclear();
      filler2_51.setpreclear();
      filler3_51.setpreclear();
      filler4_51.setpreclear();
      filler1_amount_51.setpreclear();
      filler2_amount_51.setpreclear();
      filler3_amount_51.setpreclear();
      filler4_amount_51.setpreclear();
      current_fill_51.setpreclear();
      total_fill_51.setpreclear();
      bottleAtPos2_51.setpreclear();
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
      filler1_51.setClear();
      filler2_51.setClear();
      filler3_51.setClear();
      filler4_51.setClear();
      filler1_amount_51.setClear();
      filler2_amount_51.setClear();
      filler3_amount_51.setClear();
      filler4_amount_51.setClear();
      current_fill_51.setClear();
      total_fill_51.setClear();
      bottleAtPos2_51.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[51]!=0 || suspended[51]!=0 || active[51]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
      }
      runFinisher();
      if(active[51] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
