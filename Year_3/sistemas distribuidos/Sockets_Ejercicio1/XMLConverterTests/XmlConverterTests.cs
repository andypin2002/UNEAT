using Xunit;
using XMLConverter;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace XMLConverter.Tests
{
    public class XmlConverterTest
    {
        string basePath = AppDomain.CurrentDomain.BaseDirectory;
        [Fact]
        public void TestXmlReadRequest()
        {
            TextReader tr = new StreamReader("C:/Users/andyp/Desktop/sistemas distribuidos/Sockets_Ejercicio1/XMLConverterTests" + "/" + "RequestFile.xml");
            string myText = tr.ReadToEnd();
            Assert.Contains("ConvertRequest", myText);
        }
        [Fact]
        public void TestProcesarXmlConvertRequest()
        {
            TextReader tr = new StreamReader(basePath + "/" + "RequestFile.xml");
            string myText = tr.ReadToEnd();
            decimal resultado;
            string operacion = "";
            operacion = XmlConverter.ProcesarXmlConvertRequest(myText, out resultado);
            Assert.Equal(10, resultado);
            Assert.Equal("EUR-USD", operacion);
        }
        [Fact]
        public void TestXmlReadResponse()
        {
            TextReader tr = new StreamReader(basePath + "/" + "ResponseFile.xml");
            string myText = tr.ReadToEnd();
            Assert.Contains("ConvertResponse", myText);
        }
        [Fact]
        public void TestXmlErrorMessage()
        {
            var xmlText = XmlConverter.GenerarPaqueteXmlConvertResponseError("ERROR: Divisa no reconocida MXN");
            Assert.Equal("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ConvertResponse>ERROR: Divisa no reconocida MXN</ConvertResponse>", xmlText);
       }
    }

}