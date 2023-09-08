import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ConveyorController extends ClockDomain{
  public ConveyorController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal bottleAtPos1 = new Signal("bottleAtPos1", Signal.INPUT);
  public Signal bottleLeftPos5 = new Signal("bottleLeftPos5", Signal.INPUT);
  public Signal bottleDeployed = new Signal("bottleDeployed", Signal.INPUT);
  public Signal motConveyorOnOff = new Signal("motConveyorOnOff", Signal.OUTPUT);
  public Signal bottleDeployedE = new Signal("bottleDeployedE", Signal.OUTPUT);
  public output_Channel convReady_o = new output_Channel();
  private int S2727 = 1;
  private int S2576 = 1;
  private int S1872 = 1;
  private int S1875 = 1;
  private int S1874 = 1;
  private int S1921 = 1;
  private int S1920 = 1;
  private int S1882 = 1;
  private int S1877 = 1;
  private int S1979 = 1;
  private int S1974 = 1;
  private int S2023 = 1;
  private int S2018 = 1;
  private int S2690 = 1;
  private int S2604 = 1;
  private int S2585 = 1;
  private int S2589 = 1;
  private int S2725 = 1;
  private int S2701 = 1;
  private int S2695 = 1;
  private int S2698 = 1;
  
  private int[] ends = new int[29];
  private int[] tdone = new int[29];
  
  public void thread15796(int [] tdone, int [] ends){
        S2698=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread15795(int [] tdone, int [] ends){
        S2695=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 79, column: 22
    currsigs.addElement(bottleDeployedE);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread15793(int [] tdone, int [] ends){
        switch(S2698){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 83, column: 28
          ends[10]=2;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread15792(int [] tdone, int [] ends){
        switch(S2695){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 79, column: 22
        currsigs.addElement(bottleDeployedE);
        active[9]=1;
        ends[9]=1;
        tdone[9]=1;
        break;
      
    }
  }

  public void thread15791(int [] tdone, int [] ends){
        switch(S2725){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S2701){
          case 0 : 
            thread15792(tdone,ends);
            thread15793(tdone,ends);
            int biggest15794 = 0;
            if(ends[9]>=biggest15794){
              biggest15794=ends[9];
            }
            if(ends[10]>=biggest15794){
              biggest15794=ends[10];
            }
            if(biggest15794 == 1){
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            if(biggest15794 == 2){
              ends[8]=2;
              ;//sysj\conveyor_controller.sysj line: 77, column: 11
              S2701=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            //FINXME code
            if(biggest15794 == 0){
              S2701=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
          case 1 : 
            S2701=1;
            S2701=0;
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 76, column: 19
              thread15795(tdone,ends);
              thread15796(tdone,ends);
              int biggest15797 = 0;
              if(ends[9]>=biggest15797){
                biggest15797=ends[9];
              }
              if(ends[10]>=biggest15797){
                biggest15797=ends[10];
              }
              if(biggest15797 == 1){
                active[8]=1;
                ends[8]=1;
                tdone[8]=1;
              }
            }
            else {
              S2701=1;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15789(int [] tdone, int [] ends){
        switch(S2589){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(bottleAtPos1.getprestatus() || bottleLeftPos5.getprestatus()){//sysj\conveyor_controller.sysj line: 63, column: 27
          System.out.println("*Conveyor - Bottle Reached Pos1*");//sysj\conveyor_controller.sysj line: 64, column: 21
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

  public void thread15788(int [] tdone, int [] ends){
        switch(S2585){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 21
        currsigs.addElement(motConveyorOnOff);
        active[6]=1;
        ends[6]=1;
        tdone[6]=1;
        break;
      
    }
  }

  public void thread15786(int [] tdone, int [] ends){
        S2589=1;
    System.out.println("*Conveyor - Waiting For Bottle at Pos1*");//sysj\conveyor_controller.sysj line: 62, column: 21
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread15785(int [] tdone, int [] ends){
        S2585=1;
    System.out.println("*Conveyor - Conveyer On*");//sysj\conveyor_controller.sysj line: 57, column: 18
    motConveyorOnOff.setPresent();//sysj\conveyor_controller.sysj line: 58, column: 21
    currsigs.addElement(motConveyorOnOff);
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread15784(int [] tdone, int [] ends){
        switch(S2690){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S2604){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 54, column: 19
              S2604=1;
              thread15785(tdone,ends);
              thread15786(tdone,ends);
              int biggest15787 = 0;
              if(ends[6]>=biggest15787){
                biggest15787=ends[6];
              }
              if(ends[7]>=biggest15787){
                biggest15787=ends[7];
              }
              if(biggest15787 == 1){
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            thread15788(tdone,ends);
            thread15789(tdone,ends);
            int biggest15790 = 0;
            if(ends[6]>=biggest15790){
              biggest15790=ends[6];
            }
            if(ends[7]>=biggest15790){
              biggest15790=ends[7];
            }
            if(biggest15790 == 1){
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            if(biggest15790 == 2){
              ends[5]=2;
              ;//sysj\conveyor_controller.sysj line: 55, column: 13
              S2604=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            //FINXME code
            if(biggest15790 == 0){
              S2604=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15782(int [] tdone, int [] ends){
        switch(S1921){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S1920){
          case 0 : 
            S1920=0;
            S1920=1;
            S1882=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 38, column: 18
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
              S1882=1;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              S1877=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 18
                S1877=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
                  ends[4]=2;
                  ;//sysj\conveyor_controller.sysj line: 38, column: 18
                  S1921=0;
                  active[4]=0;
                  ends[4]=0;
                  tdone[4]=1;
                }
                else {
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
            }
            break;
          
          case 1 : 
            switch(S1882){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 38, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
                  S1882=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  switch(S1877){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 18
                        S1877=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
                          ends[4]=2;
                          ;//sysj\conveyor_controller.sysj line: 38, column: 18
                          S1921=0;
                          active[4]=0;
                          ends[4]=0;
                          tdone[4]=1;
                        }
                        else {
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
                        ends[4]=2;
                        ;//sysj\conveyor_controller.sysj line: 38, column: 18
                        S1921=0;
                        active[4]=0;
                        ends[4]=0;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      break;
                    
                  }
                }
                break;
              
              case 1 : 
                S1882=1;
                S1882=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 38, column: 18
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
                  S1882=1;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S1877=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 38, column: 18
                    S1877=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 38, column: 18
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 38, column: 18
                      ends[4]=2;
                      ;//sysj\conveyor_controller.sysj line: 38, column: 18
                      S1921=0;
                      active[4]=0;
                      ends[4]=0;
                      tdone[4]=1;
                    }
                    else {
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
                }
                break;
              
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread15781(int [] tdone, int [] ends){
        switch(S1875){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S1874){
          case 0 : 
            if(bottleAtPos1.getprestatus()){//sysj\conveyor_controller.sysj line: 31, column: 27
              S1874=1;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 1 : 
            S1874=1;
            convReady_o.setPreempted();//sysj\conveyor_controller.sysj line: 33, column: 21
            ends[3]=2;
            tdone[3]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread15779(int [] tdone, int [] ends){
        S1921=1;
    S1920=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread15778(int [] tdone, int [] ends){
        S1875=1;
    S1874=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread15777(int [] tdone, int [] ends){
        switch(S2576){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S1872){
          case 0 : 
            if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 27, column: 19
              S1872=1;
              thread15778(tdone,ends);
              thread15779(tdone,ends);
              int biggest15780 = 0;
              if(ends[3]>=biggest15780){
                biggest15780=ends[3];
              }
              if(ends[4]>=biggest15780){
                biggest15780=ends[4];
              }
              if(biggest15780 == 1){
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
            thread15781(tdone,ends);
            thread15782(tdone,ends);
            int biggest15783 = 0;
            if(ends[3]>=biggest15783){
              biggest15783=ends[3];
            }
            if(ends[4]>=biggest15783){
              biggest15783=ends[4];
            }
            if(biggest15783 == 1){
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            if(biggest15783 == 2){
              ends[2]=2;
              ;//sysj\conveyor_controller.sysj line: 29, column: 13
              S1872=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            //FINXME code
            if(biggest15783 == 0){
              S1872=2;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
          case 2 : 
            S1872=2;
            System.out.println("*Conveyor - Conveyor Ready*");//sysj\conveyor_controller.sysj line: 42, column: 13
            S1872=3;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
          case 3 : 
            S1872=3;
            S1872=4;
            S1979=0;
            if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 45, column: 8
              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
              S1979=1;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              S1974=0;
              if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 45, column: 8
                S1974=1;
                if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
                  ends[2]=2;
                  ;//sysj\conveyor_controller.sysj line: 45, column: 8
                  S1872=5;
                  S2023=0;
                  if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 46, column: 13
                    convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                    S2023=1;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S2018=0;
                    if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                      convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 46, column: 13
                      S2018=1;
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 46, column: 13
                        S1872=6;
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
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            break;
          
          case 4 : 
            switch(S1979){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 45, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
                  S1979=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S1974){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                        convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 45, column: 8
                        S1974=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 45, column: 8
                          S1872=5;
                          S2023=0;
                          if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 46, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                            S2023=1;
                            active[2]=1;
                            ends[2]=1;
                            tdone[2]=1;
                          }
                          else {
                            S2018=0;
                            if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                              convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 46, column: 13
                              S2018=1;
                              if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                                convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                                ends[2]=2;
                                ;//sysj\conveyor_controller.sysj line: 46, column: 13
                                S1872=6;
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
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      break;
                    
                    case 1 : 
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 45, column: 8
                        S1872=5;
                        S2023=0;
                        if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 46, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                          S2023=1;
                          active[2]=1;
                          ends[2]=1;
                          tdone[2]=1;
                        }
                        else {
                          S2018=0;
                          if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                            convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 46, column: 13
                            S2018=1;
                            if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                              convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                              ends[2]=2;
                              ;//sysj\conveyor_controller.sysj line: 46, column: 13
                              S1872=6;
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
                    
                  }
                }
                break;
              
              case 1 : 
                S1979=1;
                S1979=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 45, column: 8
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
                  S1979=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S1974=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                    convReady_o.setVal(Boolean.TRUE);//sysj\conveyor_controller.sysj line: 45, column: 8
                    S1974=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 45, column: 8
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 45, column: 8
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 45, column: 8
                      S1872=5;
                      S2023=0;
                      if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 46, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                        S2023=1;
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S2018=0;
                        if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                          convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 46, column: 13
                          S2018=1;
                          if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                            convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                            ends[2]=2;
                            ;//sysj\conveyor_controller.sysj line: 46, column: 13
                            S1872=6;
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
          
          case 5 : 
            switch(S2023){
              case 0 : 
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 46, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                  S2023=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  switch(S2018){
                    case 0 : 
                      if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                        convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 46, column: 13
                        S2018=1;
                        if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                          convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                          ends[2]=2;
                          ;//sysj\conveyor_controller.sysj line: 46, column: 13
                          S1872=6;
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
                      if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                        convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                        ends[2]=2;
                        ;//sysj\conveyor_controller.sysj line: 46, column: 13
                        S1872=6;
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
                S2023=1;
                S2023=0;
                if(!convReady_o.isPartnerPresent() || convReady_o.isPartnerPreempted()){//sysj\conveyor_controller.sysj line: 46, column: 13
                  convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                  S2023=1;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S2018=0;
                  if(convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                    convReady_o.setVal(Boolean.FALSE);//sysj\conveyor_controller.sysj line: 46, column: 13
                    S2018=1;
                    if(!convReady_o.isACK()){//sysj\conveyor_controller.sysj line: 46, column: 13
                      convReady_o.setREQ(false);//sysj\conveyor_controller.sysj line: 46, column: 13
                      ends[2]=2;
                      ;//sysj\conveyor_controller.sysj line: 46, column: 13
                      S1872=6;
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
          
          case 6 : 
            S1872=6;
            System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 26, column: 10
            S1872=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
            break;
          
        }
        break;
      
    }
  }

  public void thread15774(int [] tdone, int [] ends){
        S2698=1;
    active[10]=1;
    ends[10]=1;
    tdone[10]=1;
  }

  public void thread15773(int [] tdone, int [] ends){
        S2695=1;
    bottleDeployedE.setPresent();//sysj\conveyor_controller.sysj line: 79, column: 22
    currsigs.addElement(bottleDeployedE);
    active[9]=1;
    ends[9]=1;
    tdone[9]=1;
  }

  public void thread15772(int [] tdone, int [] ends){
        S2725=1;
    S2701=0;
    if(bottleDeployed.getprestatus()){//sysj\conveyor_controller.sysj line: 76, column: 19
      thread15773(tdone,ends);
      thread15774(tdone,ends);
      int biggest15775 = 0;
      if(ends[9]>=biggest15775){
        biggest15775=ends[9];
      }
      if(ends[10]>=biggest15775){
        biggest15775=ends[10];
      }
      if(biggest15775 == 1){
        active[8]=1;
        ends[8]=1;
        tdone[8]=1;
      }
    }
    else {
      S2701=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread15771(int [] tdone, int [] ends){
        S2690=1;
    S2604=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread15770(int [] tdone, int [] ends){
        S2576=1;
    System.out.println("*Conveyer - Waiting for bottle to be delopyed and conveyor to be cleared...*");//sysj\conveyor_controller.sysj line: 26, column: 10
    S1872=0;
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
      switch(S2727){
        case 0 : 
          S2727=0;
          break RUN;
        
        case 1 : 
          S2727=2;
          S2727=2;
          thread15770(tdone,ends);
          thread15771(tdone,ends);
          thread15772(tdone,ends);
          int biggest15776 = 0;
          if(ends[2]>=biggest15776){
            biggest15776=ends[2];
          }
          if(ends[5]>=biggest15776){
            biggest15776=ends[5];
          }
          if(ends[8]>=biggest15776){
            biggest15776=ends[8];
          }
          if(biggest15776 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          thread15777(tdone,ends);
          thread15784(tdone,ends);
          thread15791(tdone,ends);
          int biggest15798 = 0;
          if(ends[2]>=biggest15798){
            biggest15798=ends[2];
          }
          if(ends[5]>=biggest15798){
            biggest15798=ends[5];
          }
          if(ends[8]>=biggest15798){
            biggest15798=ends[8];
          }
          if(biggest15798 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest15798 == 0){
            S2727=0;
            active[1]=0;
            ends[1]=0;
            S2727=0;
            break RUN;
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
          convReady_o.gethook();
          bottleAtPos1.gethook();
          bottleLeftPos5.gethook();
          bottleDeployed.gethook();
          df = true;
        }
        runClockDomain();
      }
      bottleAtPos1.setpreclear();
      bottleLeftPos5.setpreclear();
      bottleDeployed.setpreclear();
      motConveyorOnOff.setpreclear();
      bottleDeployedE.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = bottleAtPos1.getStatus() ? bottleAtPos1.setprepresent() : bottleAtPos1.setpreclear();
      bottleAtPos1.setpreval(bottleAtPos1.getValue());
      bottleAtPos1.setClear();
      dummyint = bottleLeftPos5.getStatus() ? bottleLeftPos5.setprepresent() : bottleLeftPos5.setpreclear();
      bottleLeftPos5.setpreval(bottleLeftPos5.getValue());
      bottleLeftPos5.setClear();
      dummyint = bottleDeployed.getStatus() ? bottleDeployed.setprepresent() : bottleDeployed.setpreclear();
      bottleDeployed.setpreval(bottleDeployed.getValue());
      bottleDeployed.setClear();
      motConveyorOnOff.sethook();
      motConveyorOnOff.setClear();
      bottleDeployedE.sethook();
      bottleDeployedE.setClear();
      convReady_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        convReady_o.gethook();
        bottleAtPos1.gethook();
        bottleLeftPos5.gethook();
        bottleDeployed.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
