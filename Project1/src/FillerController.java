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
  public Signal fileReadSignal = new Signal("fileReadSignal", Signal.INPUT);
  public Signal ordered = new Signal("ordered", Signal.INPUT);
  public Signal orderFill_1 = new Signal("orderFill_1", Signal.INPUT);
  public Signal orderFill_2 = new Signal("orderFill_2", Signal.INPUT);
  public Signal orderFill_3 = new Signal("orderFill_3", Signal.INPUT);
  public Signal orderFill_4 = new Signal("orderFill_4", Signal.INPUT);
  public Signal valveInjectorOnOff = new Signal("valveInjectorOnOff", Signal.OUTPUT);
  public Signal valveInletOnOff = new Signal("valveInletOnOff", Signal.OUTPUT);
  public Signal dosUnitValveRetract = new Signal("dosUnitValveRetract", Signal.OUTPUT);
  public Signal dosUnitValveExtend = new Signal("dosUnitValveExtend", Signal.OUTPUT);
  public Signal bottleAtPos2E = new Signal("bottleAtPos2E", Signal.OUTPUT);
  public Signal order_finished = new Signal("order_finished", Signal.OUTPUT);
  public input_Channel simFiller_in = new input_Channel();
  public output_Channel fillerReady_o = new output_Channel();
  private Signal filler1_55;
  private Signal filler2_55;
  private Signal filler3_55;
  private Signal filler4_55;
  private Signal done_55;
  private Signal filler1_amount_55;
  private Signal filler2_amount_55;
  private Signal filler3_amount_55;
  private Signal filler4_amount_55;
  private Signal current_fill_55;
  private Signal total_fill_55;
  private Signal bottleAtPos2_55;
  private int current_thread_56;//sysj\conveyor_controller.sysj line: 429, column: 16
  private int total_thread_56;//sysj\conveyor_controller.sysj line: 430, column: 16
  private long __start_thread_56;//sysj\conveyor_controller.sysj line: 428, column: 9
  private int S132971 = 1;
  private int S132970 = 1;
  private int S42754 = 1;
  private int S42749 = 1;
  private int S65201 = 1;
  private int S42771 = 1;
  private int S42780 = 1;
  private int S42775 = 1;
  private int S42930 = 1;
  private int S42881 = 1;
  private int S42886 = 1;
  private int S42895 = 1;
  private int S42900 = 1;
  private int S43278 = 1;
  private int S43229 = 1;
  private int S43234 = 1;
  private int S43243 = 1;
  private int S43248 = 1;
  private int S43684 = 1;
  private int S43635 = 1;
  private int S43640 = 1;
  private int S43649 = 1;
  private int S43654 = 1;
  private int S44148 = 1;
  private int S44099 = 1;
  private int S44104 = 1;
  private int S44113 = 1;
  private int S44118 = 1;
  private int S44620 = 1;
  private int S44615 = 1;
  private int S44847 = 1;
  private int S65284 = 1;
  private int S65228 = 1;
  private int S65208 = 1;
  private int S65203 = 1;
  private int S65319 = 1;
  private int S65295 = 1;
  private int S65289 = 1;
  private int S65292 = 1;
  
  private int[] ends = new int[104];
  private int[] tdone = new int[104];
  
  public void thread192267(int [] tdone, int [] ends){
        S65292=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192266(int [] tdone, int [] ends){
        S65289=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread192264(int [] tdone, int [] ends){
        switch(S65292){
      case 0 : 
        active[76]=0;
        ends[76]=0;
        tdone[76]=1;
        break;
      
      case 1 : 
        if(done_55.getprestatus()){//sysj\conveyor_controller.sysj line: 625, column: 35
          ends[76]=2;
          tdone[76]=1;
        }
        else {
          active[76]=1;
          ends[76]=1;
          tdone[76]=1;
        }
        break;
      
    }
  }

  public void thread192263(int [] tdone, int [] ends){
        switch(S65289){
      case 0 : 
        active[75]=0;
        ends[75]=0;
        tdone[75]=1;
        break;
      
      case 1 : 
        bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 29
        currsigs.addElement(bottleAtPos2E);
        active[75]=1;
        ends[75]=1;
        tdone[75]=1;
        break;
      
    }
  }

  public void thread192262(int [] tdone, int [] ends){
        switch(S65319){
      case 0 : 
        active[74]=0;
        ends[74]=0;
        tdone[74]=1;
        break;
      
      case 1 : 
        switch(S65295){
          case 0 : 
            thread192263(tdone,ends);
            thread192264(tdone,ends);
            int biggest192265 = 0;
            if(ends[75]>=biggest192265){
              biggest192265=ends[75];
            }
            if(ends[76]>=biggest192265){
              biggest192265=ends[76];
            }
            if(biggest192265 == 1){
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            if(biggest192265 == 2){
              ends[74]=2;
              ;//sysj\conveyor_controller.sysj line: 619, column: 18
              S65295=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            //FINXME code
            if(biggest192265 == 0){
              S65295=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
          case 1 : 
            S65295=1;
            S65295=0;
            if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 26
              thread192266(tdone,ends);
              thread192267(tdone,ends);
              int biggest192268 = 0;
              if(ends[75]>=biggest192268){
                biggest192268=ends[75];
              }
              if(ends[76]>=biggest192268){
                biggest192268=ends[76];
              }
              if(biggest192268 == 1){
                active[74]=1;
                ends[74]=1;
                tdone[74]=1;
              }
            }
            else {
              S65295=1;
              active[74]=1;
              ends[74]=1;
              tdone[74]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192261(int [] tdone, int [] ends){
        switch(S65284){
      case 0 : 
        active[73]=0;
        ends[73]=0;
        tdone[73]=1;
        break;
      
      case 1 : 
        switch(S65228){
          case 0 : 
            switch(S65208){
              case 0 : 
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
                  S65208=1;
                  active[73]=1;
                  ends[73]=1;
                  tdone[73]=1;
                }
                else {
                  switch(S65203){
                    case 0 : 
                      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
                        S65203=1;
                        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
                          ends[73]=2;
                          ;//sysj\conveyor_controller.sysj line: 603, column: 12
                          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
                            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
                            currsigs.addElement(bottleAtPos2_55);
                            S65228=1;
                            active[73]=1;
                            ends[73]=1;
                            tdone[73]=1;
                          }
                          else {
                            done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
                            currsigs.addElement(done_55);
                            S65228=1;
                            active[73]=1;
                            ends[73]=1;
                            tdone[73]=1;
                          }
                        }
                        else {
                          active[73]=1;
                          ends[73]=1;
                          tdone[73]=1;
                        }
                      }
                      else {
                        active[73]=1;
                        ends[73]=1;
                        tdone[73]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                        simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
                        ends[73]=2;
                        ;//sysj\conveyor_controller.sysj line: 603, column: 12
                        if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
                          bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
                          currsigs.addElement(bottleAtPos2_55);
                          S65228=1;
                          active[73]=1;
                          ends[73]=1;
                          tdone[73]=1;
                        }
                        else {
                          done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
                          currsigs.addElement(done_55);
                          S65228=1;
                          active[73]=1;
                          ends[73]=1;
                          tdone[73]=1;
                        }
                      }
                      else {
                        active[73]=1;
                        ends[73]=1;
                        tdone[73]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S65208=1;
                S65208=0;
                if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
                  S65208=1;
                  active[73]=1;
                  ends[73]=1;
                  tdone[73]=1;
                }
                else {
                  S65203=0;
                  if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                    simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
                    S65203=1;
                    if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
                      ends[73]=2;
                      ;//sysj\conveyor_controller.sysj line: 603, column: 12
                      if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
                        bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
                        currsigs.addElement(bottleAtPos2_55);
                        S65228=1;
                        active[73]=1;
                        ends[73]=1;
                        tdone[73]=1;
                      }
                      else {
                        done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
                        currsigs.addElement(done_55);
                        S65228=1;
                        active[73]=1;
                        ends[73]=1;
                        tdone[73]=1;
                      }
                    }
                    else {
                      active[73]=1;
                      ends[73]=1;
                      tdone[73]=1;
                    }
                  }
                  else {
                    active[73]=1;
                    ends[73]=1;
                    tdone[73]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 1 : 
            S65228=1;
            S65228=0;
            S65208=0;
            if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
              simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
              S65208=1;
              active[73]=1;
              ends[73]=1;
              tdone[73]=1;
            }
            else {
              S65203=0;
              if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
                S65203=1;
                if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
                  simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
                  ends[73]=2;
                  ;//sysj\conveyor_controller.sysj line: 603, column: 12
                  if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
                    bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
                    currsigs.addElement(bottleAtPos2_55);
                    S65228=1;
                    active[73]=1;
                    ends[73]=1;
                    tdone[73]=1;
                  }
                  else {
                    done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
                    currsigs.addElement(done_55);
                    S65228=1;
                    active[73]=1;
                    ends[73]=1;
                    tdone[73]=1;
                  }
                }
                else {
                  active[73]=1;
                  ends[73]=1;
                  tdone[73]=1;
                }
              }
              else {
                active[73]=1;
                ends[73]=1;
                tdone[73]=1;
              }
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192259(int [] tdone, int [] ends){
        switch(S44118){
      case 0 : 
        active[72]=0;
        ends[72]=0;
        tdone[72]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[72]=1;
        ends[72]=1;
        tdone[72]=1;
        break;
      
    }
  }

  public void thread192258(int [] tdone, int [] ends){
        switch(S44113){
      case 0 : 
        active[71]=0;
        ends[71]=0;
        tdone[71]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 563, column: 32
        currsigs.addElement(valveInletOnOff);
        active[71]=1;
        ends[71]=1;
        tdone[71]=1;
        break;
      
    }
  }

  public void thread192256(int [] tdone, int [] ends){
        S44118=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192255(int [] tdone, int [] ends){
        S44113=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 562, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 563, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192253(int [] tdone, int [] ends){
        switch(S44104){
      case 0 : 
        active[70]=0;
        ends[70]=0;
        tdone[70]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[70]=1;
        ends[70]=1;
        tdone[70]=1;
        break;
      
    }
  }

  public void thread192252(int [] tdone, int [] ends){
        switch(S44099){
      case 0 : 
        active[69]=0;
        ends[69]=0;
        tdone[69]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[69]=1;
        ends[69]=1;
        tdone[69]=1;
        break;
      
    }
  }

  public void thread192250(int [] tdone, int [] ends){
        S44118=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 567, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[72]=1;
    ends[72]=1;
    tdone[72]=1;
  }

  public void thread192249(int [] tdone, int [] ends){
        S44113=1;
    System.out.println("*Filler #4 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 562, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 563, column: 32
    currsigs.addElement(valveInletOnOff);
    active[71]=1;
    ends[71]=1;
    tdone[71]=1;
  }

  public void thread192247(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192246(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192244(int [] tdone, int [] ends){
        switch(S43654){
      case 0 : 
        active[68]=0;
        ends[68]=0;
        tdone[68]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 537, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[68]=1;
        ends[68]=1;
        tdone[68]=1;
        break;
      
    }
  }

  public void thread192243(int [] tdone, int [] ends){
        switch(S43649){
      case 0 : 
        active[67]=0;
        ends[67]=0;
        tdone[67]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 533, column: 32
        currsigs.addElement(valveInletOnOff);
        active[67]=1;
        ends[67]=1;
        tdone[67]=1;
        break;
      
    }
  }

  public void thread192241(int [] tdone, int [] ends){
        S43654=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 537, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192240(int [] tdone, int [] ends){
        S43649=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 532, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 533, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192238(int [] tdone, int [] ends){
        switch(S43640){
      case 0 : 
        active[66]=0;
        ends[66]=0;
        tdone[66]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[66]=1;
        ends[66]=1;
        tdone[66]=1;
        break;
      
    }
  }

  public void thread192237(int [] tdone, int [] ends){
        switch(S43635){
      case 0 : 
        active[65]=0;
        ends[65]=0;
        tdone[65]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[65]=1;
        ends[65]=1;
        tdone[65]=1;
        break;
      
    }
  }

  public void thread192235(int [] tdone, int [] ends){
        S43654=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 537, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[68]=1;
    ends[68]=1;
    tdone[68]=1;
  }

  public void thread192234(int [] tdone, int [] ends){
        S43649=1;
    System.out.println("*Filler #3 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 532, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 533, column: 32
    currsigs.addElement(valveInletOnOff);
    active[67]=1;
    ends[67]=1;
    tdone[67]=1;
  }

  public void thread192232(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192231(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192229(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192228(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192226(int [] tdone, int [] ends){
        switch(S43248){
      case 0 : 
        active[64]=0;
        ends[64]=0;
        tdone[64]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[64]=1;
        ends[64]=1;
        tdone[64]=1;
        break;
      
    }
  }

  public void thread192225(int [] tdone, int [] ends){
        switch(S43243){
      case 0 : 
        active[63]=0;
        ends[63]=0;
        tdone[63]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
        currsigs.addElement(valveInletOnOff);
        active[63]=1;
        ends[63]=1;
        tdone[63]=1;
        break;
      
    }
  }

  public void thread192223(int [] tdone, int [] ends){
        S43248=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192222(int [] tdone, int [] ends){
        S43243=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 502, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192220(int [] tdone, int [] ends){
        switch(S43234){
      case 0 : 
        active[62]=0;
        ends[62]=0;
        tdone[62]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[62]=1;
        ends[62]=1;
        tdone[62]=1;
        break;
      
    }
  }

  public void thread192219(int [] tdone, int [] ends){
        switch(S43229){
      case 0 : 
        active[61]=0;
        ends[61]=0;
        tdone[61]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[61]=1;
        ends[61]=1;
        tdone[61]=1;
        break;
      
    }
  }

  public void thread192217(int [] tdone, int [] ends){
        S43248=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 507, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[64]=1;
    ends[64]=1;
    tdone[64]=1;
  }

  public void thread192216(int [] tdone, int [] ends){
        S43243=1;
    System.out.println("*Filler #2 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 502, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 503, column: 32
    currsigs.addElement(valveInletOnOff);
    active[63]=1;
    ends[63]=1;
    tdone[63]=1;
  }

  public void thread192214(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192213(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192211(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192210(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192208(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192207(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192205(int [] tdone, int [] ends){
        switch(S42900){
      case 0 : 
        active[60]=0;
        ends[60]=0;
        tdone[60]=1;
        break;
      
      case 1 : 
        dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 475, column: 32
        currsigs.addElement(dosUnitValveExtend);
        active[60]=1;
        ends[60]=1;
        tdone[60]=1;
        break;
      
    }
  }

  public void thread192204(int [] tdone, int [] ends){
        switch(S42895){
      case 0 : 
        active[59]=0;
        ends[59]=0;
        tdone[59]=1;
        break;
      
      case 1 : 
        valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 32
        currsigs.addElement(valveInletOnOff);
        active[59]=1;
        ends[59]=1;
        tdone[59]=1;
        break;
      
    }
  }

  public void thread192202(int [] tdone, int [] ends){
        S42900=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 475, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192201(int [] tdone, int [] ends){
        S42895=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 470, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192199(int [] tdone, int [] ends){
        switch(S42886){
      case 0 : 
        active[58]=0;
        ends[58]=0;
        tdone[58]=1;
        break;
      
      case 1 : 
        dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 465, column: 32
        currsigs.addElement(dosUnitValveRetract);
        active[58]=1;
        ends[58]=1;
        tdone[58]=1;
        break;
      
    }
  }

  public void thread192198(int [] tdone, int [] ends){
        switch(S42881){
      case 0 : 
        active[57]=0;
        ends[57]=0;
        tdone[57]=1;
        break;
      
      case 1 : 
        valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 32
        currsigs.addElement(valveInjectorOnOff);
        active[57]=1;
        ends[57]=1;
        tdone[57]=1;
        break;
      
    }
  }

  public void thread192196(int [] tdone, int [] ends){
        S42900=1;
    dosUnitValveExtend.setPresent();//sysj\conveyor_controller.sysj line: 475, column: 32
    currsigs.addElement(dosUnitValveExtend);
    active[60]=1;
    ends[60]=1;
    tdone[60]=1;
  }

  public void thread192195(int [] tdone, int [] ends){
        S42895=1;
    System.out.println("*Filler #1 - Valve Inlet On*");//sysj\conveyor_controller.sysj line: 470, column: 32
    valveInletOnOff.setPresent();//sysj\conveyor_controller.sysj line: 471, column: 32
    currsigs.addElement(valveInletOnOff);
    active[59]=1;
    ends[59]=1;
    tdone[59]=1;
  }

  public void thread192193(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192192(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192190(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192189(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192187(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192186(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192184(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 465, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192183(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 460, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192181(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192180(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192178(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192177(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192175(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192174(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192172(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 465, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192171(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 460, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192169(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192168(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192166(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192165(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192163(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192162(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192160(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 465, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192159(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 460, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192157(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192156(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192154(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192153(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192151(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192150(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192148(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 465, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192147(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 460, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192145(int [] tdone, int [] ends){
        S44104=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 557, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[70]=1;
    ends[70]=1;
    tdone[70]=1;
  }

  public void thread192144(int [] tdone, int [] ends){
        S44099=1;
    System.out.println("*Filler #4 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 552, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 553, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[69]=1;
    ends[69]=1;
    tdone[69]=1;
  }

  public void thread192142(int [] tdone, int [] ends){
        S43640=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 527, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[66]=1;
    ends[66]=1;
    tdone[66]=1;
  }

  public void thread192141(int [] tdone, int [] ends){
        S43635=1;
    System.out.println("*Filler #3 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 522, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 523, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[65]=1;
    ends[65]=1;
    tdone[65]=1;
  }

  public void thread192139(int [] tdone, int [] ends){
        S43234=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 495, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[62]=1;
    ends[62]=1;
    tdone[62]=1;
  }

  public void thread192138(int [] tdone, int [] ends){
        S43229=1;
    System.out.println("*Filler #2 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 490, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 491, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[61]=1;
    ends[61]=1;
    tdone[61]=1;
  }

  public void thread192136(int [] tdone, int [] ends){
        S42886=1;
    dosUnitValveRetract.setPresent();//sysj\conveyor_controller.sysj line: 465, column: 32
    currsigs.addElement(dosUnitValveRetract);
    active[58]=1;
    ends[58]=1;
    tdone[58]=1;
  }

  public void thread192135(int [] tdone, int [] ends){
        S42881=1;
    System.out.println("*Filler #1 - Valve Injector On*");//sysj\conveyor_controller.sysj line: 460, column: 32
    valveInjectorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 461, column: 32
    currsigs.addElement(valveInjectorOnOff);
    active[57]=1;
    ends[57]=1;
    tdone[57]=1;
  }

  public void thread192134(int [] tdone, int [] ends){
        switch(S65201){
      case 0 : 
        active[56]=0;
        ends[56]=0;
        tdone[56]=1;
        break;
      
      case 1 : 
        switch(S42771){
          case 0 : 
            if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 449, column: 26
              S42771=1;
              S42780=0;
              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 450, column: 20
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                S42780=1;
                active[56]=1;
                ends[56]=1;
                tdone[56]=1;
              }
              else {
                S42775=0;
                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                  fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 450, column: 20
                  S42775=1;
                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                    ends[56]=2;
                    ;//sysj\conveyor_controller.sysj line: 450, column: 20
                    S42771=2;
                    __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 428, column: 9
                    if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 428, column: 9
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 428, column: 9
                      System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 453, column: 20
                      S42771=3;
                      if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 456, column: 24
                        S42930=0;
                        thread192135(tdone,ends);
                        thread192136(tdone,ends);
                        int biggest192137 = 0;
                        if(ends[57]>=biggest192137){
                          biggest192137=ends[57];
                        }
                        if(ends[58]>=biggest192137){
                          biggest192137=ends[58];
                        }
                        if(biggest192137 == 1){
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        S42771=4;
                        if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 486, column: 24
                          S43278=0;
                          thread192138(tdone,ends);
                          thread192139(tdone,ends);
                          int biggest192140 = 0;
                          if(ends[61]>=biggest192140){
                            biggest192140=ends[61];
                          }
                          if(ends[62]>=biggest192140){
                            biggest192140=ends[62];
                          }
                          if(biggest192140 == 1){
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          S42771=5;
                          if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                            S43684=0;
                            thread192141(tdone,ends);
                            thread192142(tdone,ends);
                            int biggest192143 = 0;
                            if(ends[65]>=biggest192143){
                              biggest192143=ends[65];
                            }
                            if(ends[66]>=biggest192143){
                              biggest192143=ends[66];
                            }
                            if(biggest192143 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42771=6;
                            if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                              S44148=0;
                              thread192144(tdone,ends);
                              thread192145(tdone,ends);
                              int biggest192146 = 0;
                              if(ends[69]>=biggest192146){
                                biggest192146=ends[69];
                              }
                              if(ends[70]>=biggest192146){
                                biggest192146=ends[70];
                              }
                              if(biggest192146 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                              current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                              currsigs.addElement(current_fill_55);
                              current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                              S42771=7;
                              S44620=0;
                              if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                S44620=1;
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                              else {
                                S44615=0;
                                if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                  fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                                  S44615=1;
                                  if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                    ends[56]=2;
                                    ;//sysj\conveyor_controller.sysj line: 582, column: 20
                                    System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                                    S42771=8;
                                    S44847=0;
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                  else {
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
              }
            }
            else {
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            break;
          
          case 1 : 
            switch(S42780){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 450, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                  S42780=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  switch(S42775){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                        fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 450, column: 20
                        S42775=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 450, column: 20
                          S42771=2;
                          __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 428, column: 9
                          if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 428, column: 9
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 428, column: 9
                            System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 453, column: 20
                            S42771=3;
                            if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 456, column: 24
                              S42930=0;
                              thread192147(tdone,ends);
                              thread192148(tdone,ends);
                              int biggest192149 = 0;
                              if(ends[57]>=biggest192149){
                                biggest192149=ends[57];
                              }
                              if(ends[58]>=biggest192149){
                                biggest192149=ends[58];
                              }
                              if(biggest192149 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42771=4;
                              if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 486, column: 24
                                S43278=0;
                                thread192150(tdone,ends);
                                thread192151(tdone,ends);
                                int biggest192152 = 0;
                                if(ends[61]>=biggest192152){
                                  biggest192152=ends[61];
                                }
                                if(ends[62]>=biggest192152){
                                  biggest192152=ends[62];
                                }
                                if(biggest192152 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                S42771=5;
                                if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                                  S43684=0;
                                  thread192153(tdone,ends);
                                  thread192154(tdone,ends);
                                  int biggest192155 = 0;
                                  if(ends[65]>=biggest192155){
                                    biggest192155=ends[65];
                                  }
                                  if(ends[66]>=biggest192155){
                                    biggest192155=ends[66];
                                  }
                                  if(biggest192155 == 1){
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  S42771=6;
                                  if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                                    S44148=0;
                                    thread192156(tdone,ends);
                                    thread192157(tdone,ends);
                                    int biggest192158 = 0;
                                    if(ends[69]>=biggest192158){
                                      biggest192158=ends[69];
                                    }
                                    if(ends[70]>=biggest192158){
                                      biggest192158=ends[70];
                                    }
                                    if(biggest192158 == 1){
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                  }
                                  else {
                                    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                                    currsigs.addElement(current_fill_55);
                                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                                    S42771=7;
                                    S44620=0;
                                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                      S44620=1;
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                    else {
                                      S44615=0;
                                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                                        S44615=1;
                                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                          ends[56]=2;
                                          ;//sysj\conveyor_controller.sysj line: 582, column: 20
                                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                                          S42771=8;
                                          S44847=0;
                                          active[56]=1;
                                          ends[56]=1;
                                          tdone[56]=1;
                                        }
                                        else {
                                          active[56]=1;
                                          ends[56]=1;
                                          tdone[56]=1;
                                        }
                                      }
                                      else {
                                        active[56]=1;
                                        ends[56]=1;
                                        tdone[56]=1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 450, column: 20
                        S42771=2;
                        __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 428, column: 9
                        if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 428, column: 9
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 428, column: 9
                          System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 453, column: 20
                          S42771=3;
                          if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 456, column: 24
                            S42930=0;
                            thread192159(tdone,ends);
                            thread192160(tdone,ends);
                            int biggest192161 = 0;
                            if(ends[57]>=biggest192161){
                              biggest192161=ends[57];
                            }
                            if(ends[58]>=biggest192161){
                              biggest192161=ends[58];
                            }
                            if(biggest192161 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42771=4;
                            if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 486, column: 24
                              S43278=0;
                              thread192162(tdone,ends);
                              thread192163(tdone,ends);
                              int biggest192164 = 0;
                              if(ends[61]>=biggest192164){
                                biggest192164=ends[61];
                              }
                              if(ends[62]>=biggest192164){
                                biggest192164=ends[62];
                              }
                              if(biggest192164 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42771=5;
                              if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                                S43684=0;
                                thread192165(tdone,ends);
                                thread192166(tdone,ends);
                                int biggest192167 = 0;
                                if(ends[65]>=biggest192167){
                                  biggest192167=ends[65];
                                }
                                if(ends[66]>=biggest192167){
                                  biggest192167=ends[66];
                                }
                                if(biggest192167 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                S42771=6;
                                if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                                  S44148=0;
                                  thread192168(tdone,ends);
                                  thread192169(tdone,ends);
                                  int biggest192170 = 0;
                                  if(ends[69]>=biggest192170){
                                    biggest192170=ends[69];
                                  }
                                  if(ends[70]>=biggest192170){
                                    biggest192170=ends[70];
                                  }
                                  if(biggest192170 == 1){
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                                else {
                                  current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                                  currsigs.addElement(current_fill_55);
                                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                                  S42771=7;
                                  S44620=0;
                                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                    S44620=1;
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                  else {
                                    S44615=0;
                                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                                      S44615=1;
                                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                        ends[56]=2;
                                        ;//sysj\conveyor_controller.sysj line: 582, column: 20
                                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                                        S42771=8;
                                        S44847=0;
                                        active[56]=1;
                                        ends[56]=1;
                                        tdone[56]=1;
                                      }
                                      else {
                                        active[56]=1;
                                        ends[56]=1;
                                        tdone[56]=1;
                                      }
                                    }
                                    else {
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S42780=1;
                S42780=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 450, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                  S42780=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S42775=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                    fillerReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 450, column: 20
                    S42775=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 450, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 450, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 450, column: 20
                      S42771=2;
                      __start_thread_56 = com.systemj.Timer.getMs();//sysj\conveyor_controller.sysj line: 428, column: 9
                      if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 428, column: 9
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 428, column: 9
                        System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 453, column: 20
                        S42771=3;
                        if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 456, column: 24
                          S42930=0;
                          thread192171(tdone,ends);
                          thread192172(tdone,ends);
                          int biggest192173 = 0;
                          if(ends[57]>=biggest192173){
                            biggest192173=ends[57];
                          }
                          if(ends[58]>=biggest192173){
                            biggest192173=ends[58];
                          }
                          if(biggest192173 == 1){
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          S42771=4;
                          if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 486, column: 24
                            S43278=0;
                            thread192174(tdone,ends);
                            thread192175(tdone,ends);
                            int biggest192176 = 0;
                            if(ends[61]>=biggest192176){
                              biggest192176=ends[61];
                            }
                            if(ends[62]>=biggest192176){
                              biggest192176=ends[62];
                            }
                            if(biggest192176 == 1){
                              active[56]=1;
                              ends[56]=1;
                              tdone[56]=1;
                            }
                          }
                          else {
                            S42771=5;
                            if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                              S43684=0;
                              thread192177(tdone,ends);
                              thread192178(tdone,ends);
                              int biggest192179 = 0;
                              if(ends[65]>=biggest192179){
                                biggest192179=ends[65];
                              }
                              if(ends[66]>=biggest192179){
                                biggest192179=ends[66];
                              }
                              if(biggest192179 == 1){
                                active[56]=1;
                                ends[56]=1;
                                tdone[56]=1;
                              }
                            }
                            else {
                              S42771=6;
                              if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                                S44148=0;
                                thread192180(tdone,ends);
                                thread192181(tdone,ends);
                                int biggest192182 = 0;
                                if(ends[69]>=biggest192182){
                                  biggest192182=ends[69];
                                }
                                if(ends[70]>=biggest192182){
                                  biggest192182=ends[70];
                                }
                                if(biggest192182 == 1){
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                              }
                              else {
                                current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                                current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                                currsigs.addElement(current_fill_55);
                                current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                                S42771=7;
                                S44620=0;
                                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                  S44620=1;
                                  active[56]=1;
                                  ends[56]=1;
                                  tdone[56]=1;
                                }
                                else {
                                  S44615=0;
                                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                                    S44615=1;
                                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                                      ends[56]=2;
                                      ;//sysj\conveyor_controller.sysj line: 582, column: 20
                                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                                      S42771=8;
                                      S44847=0;
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                    else {
                                      active[56]=1;
                                      ends[56]=1;
                                      tdone[56]=1;
                                    }
                                  }
                                  else {
                                    active[56]=1;
                                    ends[56]=1;
                                    tdone[56]=1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 2 : 
            if(com.systemj.Timer.getMs() - __start_thread_56 >= (2) * 1000){//sysj\conveyor_controller.sysj line: 428, column: 9
              ends[56]=2;
              ;//sysj\conveyor_controller.sysj line: 428, column: 9
              System.out.println("*Filler - Bottle Arrived at Pos 2*");//sysj\conveyor_controller.sysj line: 453, column: 20
              S42771=3;
              if(((filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 456, column: 24
                S42930=0;
                thread192183(tdone,ends);
                thread192184(tdone,ends);
                int biggest192185 = 0;
                if(ends[57]>=biggest192185){
                  biggest192185=ends[57];
                }
                if(ends[58]>=biggest192185){
                  biggest192185=ends[58];
                }
                if(biggest192185 == 1){
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
              }
              else {
                S42771=4;
                if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 486, column: 24
                  S43278=0;
                  thread192186(tdone,ends);
                  thread192187(tdone,ends);
                  int biggest192188 = 0;
                  if(ends[61]>=biggest192188){
                    biggest192188=ends[61];
                  }
                  if(ends[62]>=biggest192188){
                    biggest192188=ends[62];
                  }
                  if(biggest192188 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42771=5;
                  if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                    S43684=0;
                    thread192189(tdone,ends);
                    thread192190(tdone,ends);
                    int biggest192191 = 0;
                    if(ends[65]>=biggest192191){
                      biggest192191=ends[65];
                    }
                    if(ends[66]>=biggest192191){
                      biggest192191=ends[66];
                    }
                    if(biggest192191 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    S42771=6;
                    if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                      S44148=0;
                      thread192192(tdone,ends);
                      thread192193(tdone,ends);
                      int biggest192194 = 0;
                      if(ends[69]>=biggest192194){
                        biggest192194=ends[69];
                      }
                      if(ends[70]>=biggest192194){
                        biggest192194=ends[70];
                      }
                      if(biggest192194 == 1){
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                      current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                      currsigs.addElement(current_fill_55);
                      current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                      S42771=7;
                      S44620=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                        S44620=1;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        S44615=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                          S44615=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 582, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                            S42771=8;
                            S44847=0;
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                    }
                  }
                }
              }
            }
            else {
              active[56]=1;
              ends[56]=1;
              tdone[56]=1;
            }
            break;
          
          case 3 : 
            switch(S42930){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 458, column: 30
                  S42930=1;
                  thread192195(tdone,ends);
                  thread192196(tdone,ends);
                  int biggest192197 = 0;
                  if(ends[59]>=biggest192197){
                    biggest192197=ends[59];
                  }
                  if(ends[60]>=biggest192197){
                    biggest192197=ends[60];
                  }
                  if(biggest192197 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192198(tdone,ends);
                  thread192199(tdone,ends);
                  int biggest192200 = 0;
                  if(ends[57]>=biggest192200){
                    biggest192200=ends[57];
                  }
                  if(ends[58]>=biggest192200){
                    biggest192200=ends[58];
                  }
                  if(biggest192200 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192200 == 0){
                    S42930=1;
                    thread192201(tdone,ends);
                    thread192202(tdone,ends);
                    int biggest192203 = 0;
                    if(ends[59]>=biggest192203){
                      biggest192203=ends[59];
                    }
                    if(ends[60]>=biggest192203){
                      biggest192203=ends[60];
                    }
                    if(biggest192203 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 468, column: 30
                  System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 479, column: 24
                  current_thread_56 += (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 480, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 481, column: 24
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 24
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 482, column: 24
                  S42930=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192204(tdone,ends);
                  thread192205(tdone,ends);
                  int biggest192206 = 0;
                  if(ends[59]>=biggest192206){
                    biggest192206=ends[59];
                  }
                  if(ends[60]>=biggest192206){
                    biggest192206=ends[60];
                  }
                  if(biggest192206 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192206 == 0){
                    System.out.println("*Filler #1 - Filled Amount: " + (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 479, column: 24
                    current_thread_56 += (filler1_amount_55.getpreval() == null ? 0 : ((Integer)filler1_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 480, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 481, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 482, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 482, column: 24
                    S42930=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S42930=2;
                S42771=4;
                if(((filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 486, column: 24
                  S43278=0;
                  thread192207(tdone,ends);
                  thread192208(tdone,ends);
                  int biggest192209 = 0;
                  if(ends[61]>=biggest192209){
                    biggest192209=ends[61];
                  }
                  if(ends[62]>=biggest192209){
                    biggest192209=ends[62];
                  }
                  if(biggest192209 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42771=5;
                  if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                    S43684=0;
                    thread192210(tdone,ends);
                    thread192211(tdone,ends);
                    int biggest192212 = 0;
                    if(ends[65]>=biggest192212){
                      biggest192212=ends[65];
                    }
                    if(ends[66]>=biggest192212){
                      biggest192212=ends[66];
                    }
                    if(biggest192212 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    S42771=6;
                    if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                      S44148=0;
                      thread192213(tdone,ends);
                      thread192214(tdone,ends);
                      int biggest192215 = 0;
                      if(ends[69]>=biggest192215){
                        biggest192215=ends[69];
                      }
                      if(ends[70]>=biggest192215){
                        biggest192215=ends[70];
                      }
                      if(biggest192215 == 1){
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                      current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                      currsigs.addElement(current_fill_55);
                      current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                      S42771=7;
                      S44620=0;
                      if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                        S44620=1;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        S44615=0;
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                          S44615=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                            ends[56]=2;
                            ;//sysj\conveyor_controller.sysj line: 582, column: 20
                            System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                            S42771=8;
                            S44847=0;
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                          else {
                            active[56]=1;
                            ends[56]=1;
                            tdone[56]=1;
                          }
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 4 : 
            switch(S43278){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 488, column: 30
                  S43278=1;
                  thread192216(tdone,ends);
                  thread192217(tdone,ends);
                  int biggest192218 = 0;
                  if(ends[63]>=biggest192218){
                    biggest192218=ends[63];
                  }
                  if(ends[64]>=biggest192218){
                    biggest192218=ends[64];
                  }
                  if(biggest192218 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192219(tdone,ends);
                  thread192220(tdone,ends);
                  int biggest192221 = 0;
                  if(ends[61]>=biggest192221){
                    biggest192221=ends[61];
                  }
                  if(ends[62]>=biggest192221){
                    biggest192221=ends[62];
                  }
                  if(biggest192221 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192221 == 0){
                    S43278=1;
                    thread192222(tdone,ends);
                    thread192223(tdone,ends);
                    int biggest192224 = 0;
                    if(ends[63]>=biggest192224){
                      biggest192224=ends[63];
                    }
                    if(ends[64]>=biggest192224){
                      biggest192224=ends[64];
                    }
                    if(biggest192224 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 500, column: 30
                  System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 511, column: 24
                  current_thread_56 += (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 512, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 513, column: 24
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 24
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 514, column: 24
                  S43278=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192225(tdone,ends);
                  thread192226(tdone,ends);
                  int biggest192227 = 0;
                  if(ends[63]>=biggest192227){
                    biggest192227=ends[63];
                  }
                  if(ends[64]>=biggest192227){
                    biggest192227=ends[64];
                  }
                  if(biggest192227 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192227 == 0){
                    System.out.println("*Filler #2 - Filled Amount: " + (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 511, column: 24
                    current_thread_56 += (filler2_amount_55.getpreval() == null ? 0 : ((Integer)filler2_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 512, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 513, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 514, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 514, column: 24
                    S43278=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S43278=2;
                S42771=5;
                if(((filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 518, column: 24
                  S43684=0;
                  thread192228(tdone,ends);
                  thread192229(tdone,ends);
                  int biggest192230 = 0;
                  if(ends[65]>=biggest192230){
                    biggest192230=ends[65];
                  }
                  if(ends[66]>=biggest192230){
                    biggest192230=ends[66];
                  }
                  if(biggest192230 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  S42771=6;
                  if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                    S44148=0;
                    thread192231(tdone,ends);
                    thread192232(tdone,ends);
                    int biggest192233 = 0;
                    if(ends[69]>=biggest192233){
                      biggest192233=ends[69];
                    }
                    if(ends[70]>=biggest192233){
                      biggest192233=ends[70];
                    }
                    if(biggest192233 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                    S42771=7;
                    S44620=0;
                    if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                      S44620=1;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      S44615=0;
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                        S44615=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 582, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                          S42771=8;
                          S44847=0;
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 5 : 
            switch(S43684){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 520, column: 30
                  S43684=1;
                  thread192234(tdone,ends);
                  thread192235(tdone,ends);
                  int biggest192236 = 0;
                  if(ends[67]>=biggest192236){
                    biggest192236=ends[67];
                  }
                  if(ends[68]>=biggest192236){
                    biggest192236=ends[68];
                  }
                  if(biggest192236 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192237(tdone,ends);
                  thread192238(tdone,ends);
                  int biggest192239 = 0;
                  if(ends[65]>=biggest192239){
                    biggest192239=ends[65];
                  }
                  if(ends[66]>=biggest192239){
                    biggest192239=ends[66];
                  }
                  if(biggest192239 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192239 == 0){
                    S43684=1;
                    thread192240(tdone,ends);
                    thread192241(tdone,ends);
                    int biggest192242 = 0;
                    if(ends[67]>=biggest192242){
                      biggest192242=ends[67];
                    }
                    if(ends[68]>=biggest192242){
                      biggest192242=ends[68];
                    }
                    if(biggest192242 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 530, column: 30
                  System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 541, column: 24
                  current_thread_56 += (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 542, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 543, column: 24
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 24
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 544, column: 24
                  S43684=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192243(tdone,ends);
                  thread192244(tdone,ends);
                  int biggest192245 = 0;
                  if(ends[67]>=biggest192245){
                    biggest192245=ends[67];
                  }
                  if(ends[68]>=biggest192245){
                    biggest192245=ends[68];
                  }
                  if(biggest192245 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192245 == 0){
                    System.out.println("*Filler #3 - Filled Amount: " + (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 541, column: 24
                    current_thread_56 += (filler3_amount_55.getpreval() == null ? 0 : ((Integer)filler3_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 542, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 543, column: 24
                    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 544, column: 24
                    currsigs.addElement(current_fill_55);
                    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 544, column: 24
                    S43684=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S43684=2;
                S42771=6;
                if(((filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) > 0) && (current_thread_56 + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()) <= total_thread_56)){//sysj\conveyor_controller.sysj line: 548, column: 24
                  S44148=0;
                  thread192246(tdone,ends);
                  thread192247(tdone,ends);
                  int biggest192248 = 0;
                  if(ends[69]>=biggest192248){
                    biggest192248=ends[69];
                  }
                  if(ends[70]>=biggest192248){
                    biggest192248=ends[70];
                  }
                  if(biggest192248 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                  current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                  currsigs.addElement(current_fill_55);
                  current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                  S42771=7;
                  S44620=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                    S44620=1;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  else {
                    S44615=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                      S44615=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 582, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                        S42771=8;
                        S44847=0;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
            }
            break;
          
          case 6 : 
            switch(S44148){
              case 0 : 
                if(dosUnitFilled.getprestatus()){//sysj\conveyor_controller.sysj line: 550, column: 30
                  S44148=1;
                  thread192249(tdone,ends);
                  thread192250(tdone,ends);
                  int biggest192251 = 0;
                  if(ends[71]>=biggest192251){
                    biggest192251=ends[71];
                  }
                  if(ends[72]>=biggest192251){
                    biggest192251=ends[72];
                  }
                  if(biggest192251 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  thread192252(tdone,ends);
                  thread192253(tdone,ends);
                  int biggest192254 = 0;
                  if(ends[69]>=biggest192254){
                    biggest192254=ends[69];
                  }
                  if(ends[70]>=biggest192254){
                    biggest192254=ends[70];
                  }
                  if(biggest192254 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192254 == 0){
                    S44148=1;
                    thread192255(tdone,ends);
                    thread192256(tdone,ends);
                    int biggest192257 = 0;
                    if(ends[71]>=biggest192257){
                      biggest192257=ends[71];
                    }
                    if(ends[72]>=biggest192257){
                      biggest192257=ends[72];
                    }
                    if(biggest192257 == 1){
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                }
                break;
              
              case 1 : 
                if(dosUnitEvac.getprestatus()){//sysj\conveyor_controller.sysj line: 560, column: 30
                  System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 571, column: 24
                  current_thread_56 += (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 572, column: 24
                  System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 573, column: 24
                  S44148=2;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  thread192258(tdone,ends);
                  thread192259(tdone,ends);
                  int biggest192260 = 0;
                  if(ends[71]>=biggest192260){
                    biggest192260=ends[71];
                  }
                  if(ends[72]>=biggest192260){
                    biggest192260=ends[72];
                  }
                  if(biggest192260 == 1){
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  //FINXME code
                  if(biggest192260 == 0){
                    System.out.println("*Filler #4 - Filled Amount: " + (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue()));//sysj\conveyor_controller.sysj line: 571, column: 24
                    current_thread_56 += (filler4_amount_55.getpreval() == null ? 0 : ((Integer)filler4_amount_55.getpreval()).intValue());//sysj\conveyor_controller.sysj line: 572, column: 24
                    System.out.println("*Current Filled Amount: " + current_thread_56);//sysj\conveyor_controller.sysj line: 573, column: 24
                    S44148=2;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
              case 2 : 
                S44148=2;
                current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 579, column: 20
                current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 580, column: 20
                currsigs.addElement(current_fill_55);
                current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 580, column: 20
                S42771=7;
                S44620=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                  S44620=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S44615=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                    S44615=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 582, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                      S42771=8;
                      S44847=0;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 7 : 
            switch(S44620){
              case 0 : 
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                  S44620=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  switch(S44615){
                    case 0 : 
                      if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                        fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                        S44615=1;
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                          ends[56]=2;
                          ;//sysj\conveyor_controller.sysj line: 582, column: 20
                          System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                          S42771=8;
                          S44847=0;
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                        else {
                          active[56]=1;
                          ends[56]=1;
                          tdone[56]=1;
                        }
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                        ends[56]=2;
                        ;//sysj\conveyor_controller.sysj line: 582, column: 20
                        System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                        S42771=8;
                        S44847=0;
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      else {
                        active[56]=1;
                        ends[56]=1;
                        tdone[56]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S44620=1;
                S44620=0;
                if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 582, column: 20
                  fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                  S44620=1;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  S44615=0;
                  if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                    fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 582, column: 20
                    S44615=1;
                    if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 582, column: 20
                      fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 582, column: 20
                      ends[56]=2;
                      ;//sysj\conveyor_controller.sysj line: 582, column: 20
                      System.out.println("*Filler operation done");//sysj\conveyor_controller.sysj line: 583, column: 20
                      S42771=8;
                      S44847=0;
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                    else {
                      active[56]=1;
                      ends[56]=1;
                      tdone[56]=1;
                    }
                  }
                  else {
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                break;
              
            }
            break;
          
          case 8 : 
            switch(S44847){
              case 0 : 
                if(!bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 586, column: 30
                  S44847=1;
                  if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 588, column: 36
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                  else {
                    ends[56]=2;
                    ;//sysj\conveyor_controller.sysj line: 585, column: 20
                    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 17
                    currsigs.addElement(filler1_amount_55);
                    filler1_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 437, column: 17
                    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 8
                    currsigs.addElement(filler2_amount_55);
                    filler2_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 438, column: 8
                    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 8
                    currsigs.addElement(filler3_amount_55);
                    filler3_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 439, column: 8
                    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 8
                    currsigs.addElement(filler4_amount_55);
                    filler4_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 440, column: 8
                    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 8
                    currsigs.addElement(filler1_amount_55);
                    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 442, column: 8
                    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 443, column: 8
                    currsigs.addElement(filler2_amount_55);
                    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 443, column: 8
                    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 8
                    currsigs.addElement(filler3_amount_55);
                    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 444, column: 8
                    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 8
                    currsigs.addElement(filler4_amount_55);
                    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 445, column: 8
                    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 448, column: 20
                    S42771=0;
                    active[56]=1;
                    ends[56]=1;
                    tdone[56]=1;
                  }
                }
                else {
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                break;
              
              case 1 : 
                if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 588, column: 36
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                else {
                  ends[56]=2;
                  ;//sysj\conveyor_controller.sysj line: 585, column: 20
                  filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 17
                  currsigs.addElement(filler1_amount_55);
                  filler1_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 437, column: 17
                  filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 8
                  currsigs.addElement(filler2_amount_55);
                  filler2_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 438, column: 8
                  filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 8
                  currsigs.addElement(filler3_amount_55);
                  filler3_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 439, column: 8
                  filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 8
                  currsigs.addElement(filler4_amount_55);
                  filler4_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 440, column: 8
                  filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 8
                  currsigs.addElement(filler1_amount_55);
                  filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 442, column: 8
                  filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 443, column: 8
                  currsigs.addElement(filler2_amount_55);
                  filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 443, column: 8
                  filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 8
                  currsigs.addElement(filler3_amount_55);
                  filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 444, column: 8
                  filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 8
                  currsigs.addElement(filler4_amount_55);
                  filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 445, column: 8
                  System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 448, column: 20
                  S42771=0;
                  active[56]=1;
                  ends[56]=1;
                  tdone[56]=1;
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread192131(int [] tdone, int [] ends){
        S65292=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192130(int [] tdone, int [] ends){
        S65289=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread192129(int [] tdone, int [] ends){
        S65319=1;
    S65295=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 26
      thread192130(tdone,ends);
      thread192131(tdone,ends);
      int biggest192132 = 0;
      if(ends[75]>=biggest192132){
        biggest192132=ends[75];
      }
      if(ends[76]>=biggest192132){
        biggest192132=ends[76];
      }
      if(biggest192132 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S65295=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread192128(int [] tdone, int [] ends){
        S65284=1;
    S65228=0;
    S65208=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
      S65208=1;
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
    else {
      S65203=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
        S65203=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
          ends[73]=2;
          ;//sysj\conveyor_controller.sysj line: 603, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
            currsigs.addElement(done_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
      }
      else {
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
      }
    }
  }

  public void thread192127(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 430, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 432, column: 16
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 17
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 437, column: 17
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 438, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 439, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 440, column: 8
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 8
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 442, column: 8
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 443, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 443, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 444, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 445, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 448, column: 20
    S42771=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192124(int [] tdone, int [] ends){
        S65292=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192123(int [] tdone, int [] ends){
        S65289=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread192122(int [] tdone, int [] ends){
        S65319=1;
    S65295=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 26
      thread192123(tdone,ends);
      thread192124(tdone,ends);
      int biggest192125 = 0;
      if(ends[75]>=biggest192125){
        biggest192125=ends[75];
      }
      if(ends[76]>=biggest192125){
        biggest192125=ends[76];
      }
      if(biggest192125 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S65295=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread192121(int [] tdone, int [] ends){
        S65284=1;
    S65228=0;
    S65208=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
      S65208=1;
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
    else {
      S65203=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
        S65203=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
          ends[73]=2;
          ;//sysj\conveyor_controller.sysj line: 603, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
            currsigs.addElement(done_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
      }
      else {
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
      }
    }
  }

  public void thread192120(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 430, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 432, column: 16
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 17
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 437, column: 17
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 438, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 439, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 440, column: 8
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 8
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 442, column: 8
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 443, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 443, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 444, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 445, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 448, column: 20
    S42771=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192117(int [] tdone, int [] ends){
        S65292=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192116(int [] tdone, int [] ends){
        S65289=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread192115(int [] tdone, int [] ends){
        S65319=1;
    S65295=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 26
      thread192116(tdone,ends);
      thread192117(tdone,ends);
      int biggest192118 = 0;
      if(ends[75]>=biggest192118){
        biggest192118=ends[75];
      }
      if(ends[76]>=biggest192118){
        biggest192118=ends[76];
      }
      if(biggest192118 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S65295=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread192114(int [] tdone, int [] ends){
        S65284=1;
    S65228=0;
    S65208=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
      S65208=1;
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
    else {
      S65203=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
        S65203=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
          ends[73]=2;
          ;//sysj\conveyor_controller.sysj line: 603, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
            currsigs.addElement(done_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
      }
      else {
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
      }
    }
  }

  public void thread192113(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 430, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 432, column: 16
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 17
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 437, column: 17
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 438, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 439, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 440, column: 8
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 8
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 442, column: 8
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 443, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 443, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 444, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 445, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 448, column: 20
    S42771=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void thread192110(int [] tdone, int [] ends){
        S65292=1;
    active[76]=1;
    ends[76]=1;
    tdone[76]=1;
  }

  public void thread192109(int [] tdone, int [] ends){
        S65289=1;
    bottleAtPos2E.setPresent();//sysj\conveyor_controller.sysj line: 621, column: 29
    currsigs.addElement(bottleAtPos2E);
    active[75]=1;
    ends[75]=1;
    tdone[75]=1;
  }

  public void thread192108(int [] tdone, int [] ends){
        S65319=1;
    S65295=0;
    if(bottleAtPos2_55.getprestatus()){//sysj\conveyor_controller.sysj line: 618, column: 26
      thread192109(tdone,ends);
      thread192110(tdone,ends);
      int biggest192111 = 0;
      if(ends[75]>=biggest192111){
        biggest192111=ends[75];
      }
      if(ends[76]>=biggest192111){
        biggest192111=ends[76];
      }
      if(biggest192111 == 1){
        active[74]=1;
        ends[74]=1;
        tdone[74]=1;
      }
    }
    else {
      S65295=1;
      active[74]=1;
      ends[74]=1;
      tdone[74]=1;
    }
  }

  public void thread192107(int [] tdone, int [] ends){
        S65284=1;
    S65228=0;
    S65208=0;
    if(!simFiller_in.isPartnerPresent() || simFiller_in.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 603, column: 12
      simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
      S65208=1;
      active[73]=1;
      ends[73]=1;
      tdone[73]=1;
    }
    else {
      S65203=0;
      if(!simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
        simFiller_in.setACK(true);//sysj\conveyor_controller.sysj line: 603, column: 12
        S65203=1;
        if(simFiller_in.isREQ()){//sysj\conveyor_controller.sysj line: 603, column: 12
          simFiller_in.setACK(false);//sysj\conveyor_controller.sysj line: 603, column: 12
          ends[73]=2;
          ;//sysj\conveyor_controller.sysj line: 603, column: 12
          if((Boolean)(simFiller_in.getVal() == null ? null : ((Boolean)simFiller_in.getVal()))){//sysj\conveyor_controller.sysj line: 604, column: 15
            bottleAtPos2_55.setPresent();//sysj\conveyor_controller.sysj line: 605, column: 13
            currsigs.addElement(bottleAtPos2_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
          else {
            done_55.setPresent();//sysj\conveyor_controller.sysj line: 608, column: 13
            currsigs.addElement(done_55);
            S65228=1;
            active[73]=1;
            ends[73]=1;
            tdone[73]=1;
          }
        }
        else {
          active[73]=1;
          ends[73]=1;
          tdone[73]=1;
        }
      }
      else {
        active[73]=1;
        ends[73]=1;
        tdone[73]=1;
      }
    }
  }

  public void thread192106(int [] tdone, int [] ends){
        S65201=1;
    current_thread_56 = 0;//sysj\conveyor_controller.sysj line: 429, column: 16
    total_thread_56 = 100;//sysj\conveyor_controller.sysj line: 430, column: 16
    total_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 431, column: 16
    currsigs.addElement(total_fill_55);
    total_fill_55.setValue(total_thread_56);//sysj\conveyor_controller.sysj line: 431, column: 16
    current_fill_55.setPresent();//sysj\conveyor_controller.sysj line: 432, column: 16
    currsigs.addElement(current_fill_55);
    current_fill_55.setValue(current_thread_56);//sysj\conveyor_controller.sysj line: 432, column: 16
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 437, column: 17
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 437, column: 17
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 438, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 438, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 439, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 439, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 440, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(25);//sysj\conveyor_controller.sysj line: 440, column: 8
    filler1_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 442, column: 8
    currsigs.addElement(filler1_amount_55);
    filler1_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 0));//sysj\conveyor_controller.sysj line: 442, column: 8
    filler2_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 443, column: 8
    currsigs.addElement(filler2_amount_55);
    filler2_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 1));//sysj\conveyor_controller.sysj line: 443, column: 8
    filler3_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 444, column: 8
    currsigs.addElement(filler3_amount_55);
    filler3_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 2));//sysj\conveyor_controller.sysj line: 444, column: 8
    filler4_amount_55.setPresent();//sysj\conveyor_controller.sysj line: 445, column: 8
    currsigs.addElement(filler4_amount_55);
    filler4_amount_55.setValue(helperClass.parseString((fileReadSignal.getpreval() == null ? null : ((String)fileReadSignal.getpreval())), 3));//sysj\conveyor_controller.sysj line: 445, column: 8
    System.out.println("*Filler - Waiting For BottleAtPos2*");//sysj\conveyor_controller.sysj line: 448, column: 20
    S42771=0;
    active[56]=1;
    ends[56]=1;
    tdone[56]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S132971){
        case 0 : 
          S132971=0;
          break RUN;
        
        case 1 : 
          S132971=2;
          S132971=2;
          filler1_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler2_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler3_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler4_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          done_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler1_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          filler2_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          filler3_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          filler4_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          current_fill_55.setClear();//sysj\conveyor_controller.sysj line: 422, column: 9
          total_fill_55.setClear();//sysj\conveyor_controller.sysj line: 422, column: 9
          bottleAtPos2_55.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          S132970=0;
          S42754=0;
          if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 426, column: 9
            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
            S42754=1;
            active[55]=1;
            ends[55]=1;
            break RUN;
          }
          else {
            S42749=0;
            if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
              fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 426, column: 9
              S42749=1;
              if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
                fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
                ends[55]=2;
                ;//sysj\conveyor_controller.sysj line: 426, column: 9
                S132970=1;
                thread192106(tdone,ends);
                thread192107(tdone,ends);
                thread192108(tdone,ends);
                int biggest192112 = 0;
                if(ends[56]>=biggest192112){
                  biggest192112=ends[56];
                }
                if(ends[73]>=biggest192112){
                  biggest192112=ends[73];
                }
                if(ends[74]>=biggest192112){
                  biggest192112=ends[74];
                }
                if(biggest192112 == 1){
                  active[55]=1;
                  ends[55]=1;
                  break RUN;
                }
              }
              else {
                active[55]=1;
                ends[55]=1;
                break RUN;
              }
            }
            else {
              active[55]=1;
              ends[55]=1;
              break RUN;
            }
          }
        
        case 2 : 
          filler1_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler2_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler3_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler4_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          done_55.setClear();//sysj\conveyor_controller.sysj line: 419, column: 9
          filler1_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          filler2_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          filler3_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          filler4_amount_55.setClear();//sysj\conveyor_controller.sysj line: 421, column: 9
          current_fill_55.setClear();//sysj\conveyor_controller.sysj line: 422, column: 9
          total_fill_55.setClear();//sysj\conveyor_controller.sysj line: 422, column: 9
          bottleAtPos2_55.setClear();//sysj\conveyor_controller.sysj line: 424, column: 9
          switch(S132970){
            case 0 : 
              switch(S42754){
                case 0 : 
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 426, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
                    S42754=1;
                    active[55]=1;
                    ends[55]=1;
                    break RUN;
                  }
                  else {
                    switch(S42749){
                      case 0 : 
                        if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
                          fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 426, column: 9
                          S42749=1;
                          if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
                            fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
                            ends[55]=2;
                            ;//sysj\conveyor_controller.sysj line: 426, column: 9
                            S132970=1;
                            thread192113(tdone,ends);
                            thread192114(tdone,ends);
                            thread192115(tdone,ends);
                            int biggest192119 = 0;
                            if(ends[56]>=biggest192119){
                              biggest192119=ends[56];
                            }
                            if(ends[73]>=biggest192119){
                              biggest192119=ends[73];
                            }
                            if(ends[74]>=biggest192119){
                              biggest192119=ends[74];
                            }
                            if(biggest192119 == 1){
                              active[55]=1;
                              ends[55]=1;
                              break RUN;
                            }
                          }
                          else {
                            active[55]=1;
                            ends[55]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[55]=1;
                          ends[55]=1;
                          break RUN;
                        }
                      
                      case 1 : 
                        if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
                          fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
                          ends[55]=2;
                          ;//sysj\conveyor_controller.sysj line: 426, column: 9
                          S132970=1;
                          thread192120(tdone,ends);
                          thread192121(tdone,ends);
                          thread192122(tdone,ends);
                          int biggest192126 = 0;
                          if(ends[56]>=biggest192126){
                            biggest192126=ends[56];
                          }
                          if(ends[73]>=biggest192126){
                            biggest192126=ends[73];
                          }
                          if(ends[74]>=biggest192126){
                            biggest192126=ends[74];
                          }
                          if(biggest192126 == 1){
                            active[55]=1;
                            ends[55]=1;
                            break RUN;
                          }
                        }
                        else {
                          active[55]=1;
                          ends[55]=1;
                          break RUN;
                        }
                      
                    }
                  }
                  break;
                
                case 1 : 
                  S42754=1;
                  S42754=0;
                  if(!fillerReady_o.isPartnerPresent() || fillerReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 426, column: 9
                    fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
                    S42754=1;
                    active[55]=1;
                    ends[55]=1;
                    break RUN;
                  }
                  else {
                    S42749=0;
                    if(fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
                      fillerReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 426, column: 9
                      S42749=1;
                      if(!fillerReady_o.isACK()){//sysj\conveyor_controller.sysj line: 426, column: 9
                        fillerReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 426, column: 9
                        ends[55]=2;
                        ;//sysj\conveyor_controller.sysj line: 426, column: 9
                        S132970=1;
                        thread192127(tdone,ends);
                        thread192128(tdone,ends);
                        thread192129(tdone,ends);
                        int biggest192133 = 0;
                        if(ends[56]>=biggest192133){
                          biggest192133=ends[56];
                        }
                        if(ends[73]>=biggest192133){
                          biggest192133=ends[73];
                        }
                        if(ends[74]>=biggest192133){
                          biggest192133=ends[74];
                        }
                        if(biggest192133 == 1){
                          active[55]=1;
                          ends[55]=1;
                          break RUN;
                        }
                      }
                      else {
                        active[55]=1;
                        ends[55]=1;
                        break RUN;
                      }
                    }
                    else {
                      active[55]=1;
                      ends[55]=1;
                      break RUN;
                    }
                  }
                
              }
              break;
            
            case 1 : 
              thread192134(tdone,ends);
              thread192261(tdone,ends);
              thread192262(tdone,ends);
              int biggest192269 = 0;
              if(ends[56]>=biggest192269){
                biggest192269=ends[56];
              }
              if(ends[73]>=biggest192269){
                biggest192269=ends[73];
              }
              if(ends[74]>=biggest192269){
                biggest192269=ends[74];
              }
              if(biggest192269 == 1){
                active[55]=1;
                ends[55]=1;
                break RUN;
              }
              //FINXME code
              if(biggest192269 == 0){
                S132971=0;
                active[55]=0;
                ends[55]=0;
                S132971=0;
                break RUN;
              }
            
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    filler1_55 = new Signal();
    filler2_55 = new Signal();
    filler3_55 = new Signal();
    filler4_55 = new Signal();
    done_55 = new Signal();
    filler1_amount_55 = new Signal();
    filler2_amount_55 = new Signal();
    filler3_amount_55 = new Signal();
    filler4_amount_55 = new Signal();
    current_fill_55 = new Signal();
    total_fill_55 = new Signal();
    bottleAtPos2_55 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[55] != 0){
      int index = 55;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[55]!=0 || suspended[55]!=0 || active[55]!=1);
      else{
        if(!df){
          simFiller_in.gethook();
          fillerReady_o.gethook();
          dosUnitEvac.gethook();
          dosUnitFilled.gethook();
          fileReadSignal.gethook();
          ordered.gethook();
          orderFill_1.gethook();
          orderFill_2.gethook();
          orderFill_3.gethook();
          orderFill_4.gethook();
          df = true;
        }
        runClockDomain();
      }
      dosUnitEvac.setpreclear();
      dosUnitFilled.setpreclear();
      fileReadSignal.setpreclear();
      ordered.setpreclear();
      orderFill_1.setpreclear();
      orderFill_2.setpreclear();
      orderFill_3.setpreclear();
      orderFill_4.setpreclear();
      valveInjectorOnOff.setpreclear();
      valveInletOnOff.setpreclear();
      dosUnitValveRetract.setpreclear();
      dosUnitValveExtend.setpreclear();
      bottleAtPos2E.setpreclear();
      order_finished.setpreclear();
      filler1_55.setpreclear();
      filler2_55.setpreclear();
      filler3_55.setpreclear();
      filler4_55.setpreclear();
      done_55.setpreclear();
      filler1_amount_55.setpreclear();
      filler2_amount_55.setpreclear();
      filler3_amount_55.setpreclear();
      filler4_amount_55.setpreclear();
      current_fill_55.setpreclear();
      total_fill_55.setpreclear();
      bottleAtPos2_55.setpreclear();
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
      dummyint = fileReadSignal.getStatus() ? fileReadSignal.setprepresent() : fileReadSignal.setpreclear();
      fileReadSignal.setpreval(fileReadSignal.getValue());
      fileReadSignal.setClear();
      dummyint = ordered.getStatus() ? ordered.setprepresent() : ordered.setpreclear();
      ordered.setpreval(ordered.getValue());
      ordered.setClear();
      dummyint = orderFill_1.getStatus() ? orderFill_1.setprepresent() : orderFill_1.setpreclear();
      orderFill_1.setpreval(orderFill_1.getValue());
      orderFill_1.setClear();
      dummyint = orderFill_2.getStatus() ? orderFill_2.setprepresent() : orderFill_2.setpreclear();
      orderFill_2.setpreval(orderFill_2.getValue());
      orderFill_2.setClear();
      dummyint = orderFill_3.getStatus() ? orderFill_3.setprepresent() : orderFill_3.setpreclear();
      orderFill_3.setpreval(orderFill_3.getValue());
      orderFill_3.setClear();
      dummyint = orderFill_4.getStatus() ? orderFill_4.setprepresent() : orderFill_4.setpreclear();
      orderFill_4.setpreval(orderFill_4.getValue());
      orderFill_4.setClear();
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
      order_finished.sethook();
      order_finished.setClear();
      filler1_55.setClear();
      filler2_55.setClear();
      filler3_55.setClear();
      filler4_55.setClear();
      done_55.setClear();
      filler1_amount_55.setClear();
      filler2_amount_55.setClear();
      filler3_amount_55.setClear();
      filler4_amount_55.setClear();
      current_fill_55.setClear();
      total_fill_55.setClear();
      bottleAtPos2_55.setClear();
      simFiller_in.sethook();
      fillerReady_o.sethook();
      if(paused[55]!=0 || suspended[55]!=0 || active[55]!=1);
      else{
        simFiller_in.gethook();
        fillerReady_o.gethook();
        dosUnitEvac.gethook();
        dosUnitFilled.gethook();
        fileReadSignal.gethook();
        ordered.gethook();
        orderFill_1.gethook();
        orderFill_2.gethook();
        orderFill_3.gethook();
        orderFill_4.gethook();
      }
      runFinisher();
      if(active[55] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
