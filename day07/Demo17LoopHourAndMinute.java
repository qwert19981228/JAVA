public class Demo17LoopHourAndMinute{
    public static void main(String[] args) {
        for (int hour = 0;hour < 24;hour++){// 外层控制小时
            for (int minute = 0;minute < 60;minute++){//控制分钟
                for (int second = 0;second < 60;second++){//控制秒数
                    System.out.println(hour+"时"+minute+"分"+second+"秒");
                }
            }
        }
    }
}