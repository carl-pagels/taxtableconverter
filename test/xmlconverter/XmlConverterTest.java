package xmlconverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class XmlConverterTest {


    private final String PATH = "/Users/carl.pagels/repos/taxtableconverter/src/xmlconverter/data";

    @Test
    public void testFileGeneration_Hej() throws IOException, ParserConfigurationException, TransformerException {
        final Document document = XmlDocumentBuilder.generateDocument(PATH, "hej.csv");
        final String xmlFile = XmlGenerator.getXmlFile(document);
        Assertions.assertEquals(xmlFile, EXPECTED_XML_HEJ);
    }

    @Test
    public void testFileGeneration_Cities() throws IOException, ParserConfigurationException, TransformerException {
        final Document document = XmlDocumentBuilder.generateDocument(PATH, "cities.csv");
        final String xmlFile = XmlGenerator.getXmlFile(document);
        Assertions.assertEquals(xmlFile, EXPECTED_XML_CITIES);
    }

    private static final String EXPECTED_XML_HEJ = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><Xmlconverter><row><Timestamp/><Namegroupmember1>Raja Haider</Namegroupmember1><Namegroupmember2>Susanne</Namegroupmember2><Emailaddress1>email@email.com1</Emailaddress1><Emailaddressmember2>email@email.com21</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Hassan</Namegroupmember1><Namegroupmember2>hsusein</Namegroupmember2><Emailaddress1>email@email.com2</Emailaddress1><Emailaddressmember2>email@email.com32</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Osama</Namegroupmember1><Namegroupmember2>Morgan</Namegroupmember2><Emailaddress1>email@email.com3</Emailaddress1><Emailaddressmember2>email@email.com43</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Malek</Namegroupmember1><Namegroupmember2>Martin</Namegroupmember2><Emailaddress1>email@email.com4</Emailaddress1><Emailaddressmember2>email@email.com55</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Yousef</Namegroupmember1><Namegroupmember2>Julius</Namegroupmember2><Emailaddress1>email@email.com5</Emailaddress1><Emailaddressmember2>email@email.com64</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Anton</Namegroupmember1><Namegroupmember2>Ermin</Namegroupmember2><Emailaddress1>email@email.com6</Emailaddress1><Emailaddressmember2>email@email.com75</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>rosita</Namegroupmember1><Namegroupmember2>Marcus</Namegroupmember2><Emailaddress1>email@email.com7</Emailaddress1><Emailaddressmember2>email@email.com87</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Patrik</Namegroupmember1><Namegroupmember2>Anton</Namegroupmember2><Emailaddress1>email@email.com8</Emailaddress1><Emailaddressmember2>email@email.com90</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Robin</Namegroupmember1><Namegroupmember2>David</Namegroupmember2><Emailaddress1>email@email.com9</Emailaddress1><Emailaddressmember2>email@email.com100</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Michael</Namegroupmember1><Namegroupmember2>Changzhou</Namegroupmember2><Emailaddress1>email@email.com10</Emailaddress1><Emailaddressmember2>email@email.com114</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Samir</Namegroupmember1><Namegroupmember2>Andreas</Namegroupmember2><Emailaddress1>email@email.com11</Emailaddress1><Emailaddressmember2>email@email.com125</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>David</Namegroupmember1><Namegroupmember2>Nikola</Namegroupmember2><Emailaddress1>email@email.com12</Emailaddress1><Emailaddressmember2>email@email.com136</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Mohammad</Namegroupmember1><Namegroupmember2>Christoffer</Namegroupmember2><Emailaddress1>email@email.com13</Emailaddress1><Emailaddressmember2>email@email.com147</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Jonatan</Namegroupmember1><Namegroupmember2>Mahmoud</Namegroupmember2><Emailaddress1>email@email.com14</Emailaddress1><Emailaddressmember2>email@email.com15</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Alexander</Namegroupmember1><Namegroupmember2>Nusar</Namegroupmember2><Emailaddress1>email@email.com15</Emailaddress1><Emailaddressmember2>email@email.com166</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Mara</Namegroupmember1><Namegroupmember2>Pavle</Namegroupmember2><Emailaddress1>email@email.com16</Emailaddress1><Emailaddressmember2>email@email.com177</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Christer</Namegroupmember1><Namegroupmember2>Tobias </Namegroupmember2><Emailaddress1>email@email.com17</Emailaddress1><Emailaddressmember2>email@email.com188</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones/></row><row><Timestamp/><Namegroupmember1>Filip</Namegroupmember1><Namegroupmember2>Selab</Namegroupmember2><Emailaddress1>email@email.com5</Emailaddress1><Emailaddressmember2>email@email.com68</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater>Yes I do</DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater><Youwillworkwith...>Android App</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1>Joacim</Namegroupmember1><Namegroupmember2>Ida</Namegroupmember2><Emailaddress1>email@email.com6</Emailaddress1><Emailaddressmember2>email@email.com74</Emailaddressmember2><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith...>Arduino</Youwillworkwith...><ones>1</ones></row><row><Timestamp/><Namegroupmember1/><Namegroupmember2/><Emailaddress1/><Emailaddressmember2/><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith.../><ones>1</ones></row><row><Timestamp/><Namegroupmember1/><Namegroupmember2/><Emailaddress1/><Emailaddressmember2/><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith.../><ones>1</ones></row><row><Timestamp/><Namegroupmember1/><Namegroupmember2/><Emailaddress1/><Emailaddressmember2/><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith.../><ones>1</ones></row><row><Timestamp/><Namegroupmember1/><Namegroupmember2/><Emailaddress1/><Emailaddressmember2/><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith.../><ones>1</ones></row><row><Timestamp/><Namegroupmember1/><Namegroupmember2/><Emailaddress1/><Emailaddressmember2/><DoyouhaveanAndroiddevice_x0028_phoneortablet_x0029_withOSversion2.3.1orlater/><Youwillworkwith.../><ones>1</ones></row></Xmlconverter>";
    private static final String EXPECTED_XML_CITIES = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><Xmlconverter><row><LatD/><LatM>    5</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     80</LonD><LonM>   39</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Youngstown\"</City><State> OH</State></row><row><LatD/><LatM>   52</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>   23</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Yankton\"</City><State> SD</State></row><row><LatD/><LatM>   35</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>    120</LonD><LonM>   30</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Yakima\"</City><State> WA</State></row><row><LatD/><LatM>   16</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     71</LonD><LonM>   48</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Worcester\"</City><State> MA</State></row><row><LatD/><LatM>   37</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     89</LonD><LonM>   46</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Wisconsin Dells\"</City><State> WI</State></row><row><LatD/><LatM>    5</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     80</LonD><LonM>   15</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Winston-Salem\"</City><State> NC</State></row><row><LatD/><LatM>   52</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>    9</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Winnipeg\"</City><State> MB</State></row><row><LatD/><LatM>   11</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     78</LonD><LonM>    9</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Winchester\"</City><State> VA</State></row><row><LatD/><LatM>   14</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     77</LonD><LonM>   55</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Wilmington\"</City><State> NC</State></row><row><LatD/><LatM>   45</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   33</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Wilmington\"</City><State> DE</State></row><row><LatD/><LatM>    9</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>    103</LonD><LonM>   37</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Williston\"</City><State> ND</State></row><row><LatD/><LatM>   15</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     77</LonD><LonM>    0</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Williamsport\"</City><State> PA</State></row><row><LatD/><LatM>   40</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     82</LonD><LonM>   16</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Williamson\"</City><State> WV</State></row><row><LatD/><LatM>   54</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     98</LonD><LonM>   29</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Wichita Falls\"</City><State> TX</State></row><row><LatD/><LatM>   41</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>   20</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Wichita\"</City><State> KS</State></row><row><LatD/><LatM>    4</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     80</LonD><LonM>   43</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Wheeling\"</City><State> WV</State></row><row><LatD/><LatM>   43</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     80</LonD><LonM>    3</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"West Palm Beach\"</City><State> FL</State></row><row><LatD/><LatM>   25</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    120</LonD><LonM>   19</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Wenatchee\"</City><State> WA</State></row><row><LatD/><LatM>   25</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    122</LonD><LonM>   23</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Weed\"</City><State> CA</State></row><row><LatD/><LatM>   13</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     82</LonD><LonM>   20</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Waycross\"</City><State> GA</State></row><row><LatD/><LatM>   57</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     89</LonD><LonM>   38</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Wausau\"</City><State> WI</State></row><row><LatD/><LatM>   21</LatM><LatS>   36</LatS><NS> \"N\"</NS><LonD>     87</LonD><LonM>   49</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Waukegan\"</City><State> IL</State></row><row><LatD/><LatM>   54</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>    6</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Watertown\"</City><State> SD</State></row><row><LatD/><LatM>   58</LatM><LatS>   47</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   55</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Watertown\"</City><State> NY</State></row><row><LatD/><LatM>   30</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     92</LonD><LonM>   20</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Waterloo\"</City><State> IA</State></row><row><LatD/><LatM>   32</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     73</LonD><LonM>    3</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Waterbury\"</City><State> CT</State></row><row><LatD/><LatM>   53</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     77</LonD><LonM>    1</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Washington\"</City><State> DC</State></row><row><LatD/><LatM>   50</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     79</LonD><LonM>    8</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Warren\"</City><State> PA</State></row><row><LatD/><LatM>    4</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    118</LonD><LonM>   19</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Walla Walla\"</City><State> WA</State></row><row><LatD/><LatM>   32</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>    8</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Waco\"</City><State> TX</State></row><row><LatD/><LatM>   40</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     87</LonD><LonM>   31</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Vincennes\"</City><State> IN</State></row><row><LatD/><LatM>   48</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>    0</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Victoria\"</City><State> TX</State></row><row><LatD/><LatM>   20</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     90</LonD><LonM>   52</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Vicksburg\"</City><State> MS</State></row><row><LatD/><LatM>   16</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>    123</LonD><LonM>    7</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Vancouver\"</City><State> BC</State></row><row><LatD/><LatM>   55</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     98</LonD><LonM>    0</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Valley City\"</City><State> ND</State></row><row><LatD/><LatM>   49</LatM><LatS>   47</LatS><NS> \"N\"</NS><LonD>     83</LonD><LonM>   16</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Valdosta\"</City><State> GA</State></row><row><LatD/><LatM>    6</LatM><LatS>   36</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   13</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Utica\"</City><State> NY</State></row><row><LatD/><LatM>   54</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     79</LonD><LonM>   43</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Uniontown\"</City><State> PA</State></row><row><LatD/><LatM>   20</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     95</LonD><LonM>   18</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Tyler\"</City><State> TX</State></row><row><LatD/><LatM>   33</LatM><LatS>   36</LatS><NS> \"N\"</NS><LonD>    114</LonD><LonM>   28</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Twin Falls\"</City><State> ID</State></row><row><LatD/><LatM>   12</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     87</LonD><LonM>   34</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Tuscaloosa\"</City><State> AL</State></row><row><LatD/><LatM>   15</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     88</LonD><LonM>   42</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"Tupelo\"</City><State> MS</State></row><row><LatD/><LatM>    9</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     95</LonD><LonM>   54</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Tulsa\"</City><State> OK</State></row><row><LatD/><LatM>   13</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>    110</LonD><LonM>   58</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Tucson\"</City><State> AZ</State></row><row><LatD/><LatM>   10</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    104</LonD><LonM>   30</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Trinidad\"</City><State> CO</State></row><row><LatD/><LatM>   13</LatM><LatS>   47</LatS><NS> \"N\"</NS><LonD>     74</LonD><LonM>   46</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Trenton\"</City><State> NJ</State></row><row><LatD/><LatM>   45</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     85</LonD><LonM>   37</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Traverse City\"</City><State> MI</State></row><row><LatD/><LatM>   39</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     79</LonD><LonM>   22</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Toronto\"</City><State> ON</State></row><row><LatD/><LatM>    2</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     95</LonD><LonM>   40</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Topeka\"</City><State> KS</State></row><row><LatD/><LatM>   39</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     83</LonD><LonM>   32</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Toledo\"</City><State> OH</State></row><row><LatD/><LatM>   25</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     94</LonD><LonM>    3</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Texarkana\"</City><State> TX</State></row><row><LatD/><LatM>   28</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     87</LonD><LonM>   24</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Terre Haute\"</City><State> IN</State></row><row><LatD/><LatM>   57</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     82</LonD><LonM>   26</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Tampa\"</City><State> FL</State></row><row><LatD/><LatM>   27</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     84</LonD><LonM>   16</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Tallahassee\"</City><State> FL</State></row><row><LatD/><LatM>   14</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>    122</LonD><LonM>   25</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Tacoma\"</City><State> WA</State></row><row><LatD/><LatM>    2</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     76</LonD><LonM>    9</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Syracuse\"</City><State> NY</State></row><row><LatD/><LatM>   35</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     82</LonD><LonM>   20</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Swainsboro\"</City><State> GA</State></row><row><LatD/><LatM>   55</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     80</LonD><LonM>   20</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Sumter\"</City><State> SC</State></row><row><LatD/><LatM>   59</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   11</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Stroudsburg\"</City><State> PA</State></row><row><LatD/><LatM>   57</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>    121</LonD><LonM>   17</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Stockton\"</City><State> CA</State></row><row><LatD/><LatM>   31</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     89</LonD><LonM>   34</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Stevens Point\"</City><State> WI</State></row><row><LatD/><LatM>   21</LatM><LatS>   36</LatS><NS> \"N\"</NS><LonD>     80</LonD><LonM>   37</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Steubenville\"</City><State> OH</State></row><row><LatD/><LatM>   37</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    103</LonD><LonM>   13</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Sterling\"</City><State> CO</State></row><row><LatD/><LatM>    9</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     79</LonD><LonM>    4</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Staunton\"</City><State> VA</State></row><row><LatD/><LatM>   55</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     83</LonD><LonM>   48</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"Springfield\"</City><State> OH</State></row><row><LatD/><LatM>   13</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     93</LonD><LonM>   17</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Springfield\"</City><State> MO</State></row><row><LatD/><LatM>    5</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     72</LonD><LonM>   35</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Springfield\"</City><State> MA</State></row><row><LatD/><LatM>   47</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     89</LonD><LonM>   39</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Springfield\"</City><State> IL</State></row><row><LatD/><LatM>   40</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    117</LonD><LonM>   24</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Spokane\"</City><State> WA</State></row><row><LatD/><LatM>   40</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     86</LonD><LonM>   15</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"South Bend\"</City><State> IN</State></row><row><LatD/><LatM>   32</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     96</LonD><LonM>   43</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Sioux Falls\"</City><State> SD</State></row><row><LatD/><LatM>   29</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     96</LonD><LonM>   23</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Sioux City\"</City><State> IA</State></row><row><LatD/><LatM>   30</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     93</LonD><LonM>   45</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Shreveport\"</City><State> LA</State></row><row><LatD/><LatM>   38</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     96</LonD><LonM>   36</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Sherman\"</City><State> TX</State></row><row><LatD/><LatM>   47</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>    106</LonD><LonM>   57</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"Sheridan\"</City><State> WY</State></row><row><LatD/><LatM>   13</LatM><LatS>   47</LatS><NS> \"N\"</NS><LonD>     96</LonD><LonM>   40</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Seminole\"</City><State> OK</State></row><row><LatD/><LatM>   25</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     87</LonD><LonM>    1</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Selma\"</City><State> AL</State></row><row><LatD/><LatM>   42</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     93</LonD><LonM>   13</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Sedalia\"</City><State> MO</State></row><row><LatD/><LatM>   35</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>    122</LonD><LonM>   19</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Seattle\"</City><State> WA</State></row><row><LatD/><LatM>   24</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   40</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Scranton\"</City><State> PA</State></row><row><LatD/><LatM>   52</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    103</LonD><LonM>   39</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Scottsbluff\"</City><State> NB</State></row><row><LatD/><LatM>   49</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     73</LonD><LonM>   56</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Schenectady\"</City><State> NY</State></row><row><LatD/><LatM>    4</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     81</LonD><LonM>    5</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Savannah\"</City><State> GA</State></row><row><LatD/><LatM>   29</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     84</LonD><LonM>   20</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Sault Sainte Marie\"</City><State> MI</State></row><row><LatD/><LatM>   20</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     82</LonD><LonM>   31</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Sarasota\"</City><State> FL</State></row><row><LatD/><LatM>   26</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>    122</LonD><LonM>   43</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Santa Rosa\"</City><State> CA</State></row><row><LatD/><LatM>   40</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>    105</LonD><LonM>   56</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Santa Fe\"</City><State> NM</State></row><row><LatD/><LatM>   25</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    119</LonD><LonM>   41</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Santa Barbara\"</City><State> CA</State></row><row><LatD/><LatM>   45</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>    117</LonD><LonM>   52</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Santa Ana\"</City><State> CA</State></row><row><LatD/><LatM>   20</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>    121</LonD><LonM>   52</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"San Jose\"</City><State> CA</State></row><row><LatD/><LatM>   46</LatM><LatS>   47</LatS><NS> \"N\"</NS><LonD>    122</LonD><LonM>   25</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"San Francisco\"</City><State> CA</State></row><row><LatD/><LatM>   27</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     82</LonD><LonM>   42</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"Sandusky\"</City><State> OH</State></row><row><LatD/><LatM>   42</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>    117</LonD><LonM>    9</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"San Diego\"</City><State> CA</State></row><row><LatD/><LatM>    6</LatM><LatS>   36</LatS><NS> \"N\"</NS><LonD>    117</LonD><LonM>   18</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"San Bernardino\"</City><State> CA</State></row><row><LatD/><LatM>   25</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     98</LonD><LonM>   30</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"San Antonio\"</City><State> TX</State></row><row><LatD/><LatM>   27</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>    100</LonD><LonM>   26</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"San Angelo\"</City><State> TX</State></row><row><LatD/><LatM>   45</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>    111</LonD><LonM>   52</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Salt Lake City\"</City><State> UT</State></row><row><LatD/><LatM>   22</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   35</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Salisbury\"</City><State> MD</State></row><row><LatD/><LatM>   40</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    121</LonD><LonM>   39</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Salinas\"</City><State> CA</State></row><row><LatD/><LatM>   50</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     97</LonD><LonM>   36</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Salina\"</City><State> KS</State></row><row><LatD/><LatM>   31</LatM><LatS>   47</LatS><NS> \"N\"</NS><LonD>    106</LonD><LonM>    0</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Salida\"</City><State> CO</State></row><row><LatD/><LatM>   56</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>    123</LonD><LonM>    1</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Salem\"</City><State> OR</State></row><row><LatD/><LatM>   57</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>     93</LonD><LonM>    5</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Saint Paul\"</City><State> MN</State></row><row><LatD/><LatM>   37</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     90</LonD><LonM>   11</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Saint Louis\"</City><State> MO</State></row><row><LatD/><LatM>   46</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     94</LonD><LonM>   50</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Saint Joseph\"</City><State> MO</State></row><row><LatD/><LatM>    5</LatM><LatS>   59</LatS><NS> \"N\"</NS><LonD>     86</LonD><LonM>   28</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Saint Joseph\"</City><State> MI</State></row><row><LatD/><LatM>   25</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     72</LonD><LonM>    1</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Saint Johnsbury\"</City><State> VT</State></row><row><LatD/><LatM>   34</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>     94</LonD><LonM>   10</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Saint Cloud\"</City><State> MN</State></row><row><LatD/><LatM>   53</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     81</LonD><LonM>   19</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Saint Augustine\"</City><State> FL</State></row><row><LatD/><LatM>   25</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     83</LonD><LonM>   56</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Saginaw\"</City><State> MI</State></row><row><LatD/><LatM>   35</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>    121</LonD><LonM>   29</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Sacramento\"</City><State> CA</State></row><row><LatD/><LatM>   36</LatM><LatS>   36</LatS><NS> \"N\"</NS><LonD>     72</LonD><LonM>   58</LonM><LonS>   12</LonS><EW> \"W\"</EW><City> \"Rutland\"</City><State> VT</State></row><row><LatD/><LatM>   24</LatM><LatS>    0</LatS><NS> \"N\"</NS><LonD>    104</LonD><LonM>   31</LonM><LonS>   47</LonS><EW> \"W\"</EW><City> \"Roswell\"</City><State> NM</State></row><row><LatD/><LatM>   56</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     77</LonD><LonM>   48</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Rocky Mount\"</City><State> NC</State></row><row><LatD/><LatM>   35</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>    109</LonD><LonM>   13</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Rock Springs\"</City><State> WY</State></row><row><LatD/><LatM>   16</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     89</LonD><LonM>    5</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Rockford\"</City><State> IL</State></row><row><LatD/><LatM>    9</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     77</LonD><LonM>   36</LonM><LonS>   36</LonS><EW> \"W\"</EW><City> \"Rochester\"</City><State> NY</State></row><row><LatD/><LatM>    1</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     92</LonD><LonM>   27</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"Rochester\"</City><State> MN</State></row><row><LatD/><LatM>   16</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>     79</LonD><LonM>   56</LonM><LonS>   24</LonS><EW> \"W\"</EW><City> \"Roanoke\"</City><State> VA</State></row><row><LatD/><LatM>   32</LatM><LatS>   24</LatS><NS> \"N\"</NS><LonD>     77</LonD><LonM>   26</LonM><LonS>   59</LonS><EW> \"W\"</EW><City> \"Richmond\"</City><State> VA</State></row><row><LatD/><LatM>   49</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     84</LonD><LonM>   53</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Richmond\"</City><State> IN</State></row><row><LatD/><LatM>   46</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>    112</LonD><LonM>    5</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Richfield\"</City><State> UT</State></row><row><LatD/><LatM>   38</LatM><LatS>   23</LatS><NS> \"N\"</NS><LonD>     89</LonD><LonM>   25</LonM><LonS>   11</LonS><EW> \"W\"</EW><City> \"Rhinelander\"</City><State> WI</State></row><row><LatD/><LatM>   31</LatM><LatS>   12</LatS><NS> \"N\"</NS><LonD>    119</LonD><LonM>   48</LonM><LonS>   35</LonS><EW> \"W\"</EW><City> \"Reno\"</City><State> NV</State></row><row><LatD/><LatM>   25</LatM><LatS>   11</LatS><NS> \"N\"</NS><LonD>    104</LonD><LonM>   39</LonM><LonS>    0</LonS><EW> \"W\"</EW><City> \"Regina\"</City><State> SA</State></row><row><LatD/><LatM>   10</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>    122</LonD><LonM>   14</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Red Bluff\"</City><State> CA</State></row><row><LatD/><LatM>   19</LatM><LatS>   48</LatS><NS> \"N\"</NS><LonD>     75</LonD><LonM>   55</LonM><LonS>   48</LonS><EW> \"W\"</EW><City> \"Reading\"</City><State> PA</State></row><row><LatD/><LatM>    9</LatM><LatS>   35</LatS><NS> \"N\"</NS><LonD>     81</LonD><LonM>   14</LonM><LonS>   23</LonS><EW> \"W\"</EW><City> \"Ravenna\"</City><State> OH </State></row><row><LatD/><LatM/><LatS/><NS/><LonD/><LonM/><LonS/><EW/><City/><State/></row></Xmlconverter>";
}