using Calculadora;
using System;
using System.Runtime.Remoting;
using System.Runtime.Remoting.Channels;
using System.Runtime.Remoting.Channels.Tcp;
class Program
{
    static void Main(string[] args)
    {
        TicketServer();
    }
    static void TicketServer()
    {
        var calculadora = new Calculadora.CalcLogic();
        Console.WriteLine("Calculator Server started...");
        TcpChannel tcpChannel = new TcpChannel(9998);
        ChannelServices.RegisterChannel(tcpChannel, false);
        Type commonInterfaceType = typeof(CalcLogic);
        RemotingConfiguration.RegisterWellKnownServiceType(commonInterfaceType,
        "RemoteCalcLogic", WellKnownObjectMode.SingleCall);
        System.Console.WriteLine("Press ENTER to quit");
        System.Console.ReadLine();
    }
}
