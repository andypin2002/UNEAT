using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace XMLConverter
{
    public class Converter
    {
        public static string returnXML(string hora, string name)
        {
            // recibe una hora y un nombre y devuelve un xml convertido a string

            XmlDocument doc = new XmlDocument();
            XmlNode docNode = doc.CreateXmlDeclaration("1.0", "UTF-8", null);
            doc.AppendChild(docNode);
            XmlNode responseNode = doc.CreateElement("Response");
            doc.AppendChild(responseNode);
            XmlNode nombreNode = doc.CreateElement("nombreNode");
            nombreNode.InnerText = name;
            responseNode.AppendChild(nombreNode);
            XmlNode horaNode = doc.CreateElement("horaNode");
            horaNode.InnerText = hora;
            responseNode.AppendChild(horaNode);
            return doc.InnerXml;
        }

        public static string responseXML(string message)
        {

            XmlDocument doc = new XmlDocument();
            XmlNode docNode = doc.CreateXmlDeclaration("1.0", "UTF-8", null);
            doc.AppendChild(docNode);
            XmlNode responseNode = doc.CreateElement("Response");
            doc.AppendChild(responseNode);
            XmlNode response = doc.CreateElement("response");
            response.InnerText = message;
            responseNode.AppendChild(response);
            return doc.InnerXml;
        }

    }
}
