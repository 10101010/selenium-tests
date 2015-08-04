package com.wikia.webdriver.testcases.adstests;

import com.wikia.webdriver.common.core.geoedge.GeoEdgeBrowserMobProxy;
import com.wikia.webdriver.common.dataprovider.ads.AdsDataProvider;
import com.wikia.webdriver.common.templates.TemplateNoFirstLoad;
import com.wikia.webdriver.pageobjectsfactory.pageobject.adsbase.AdsEvolveObject;

import org.testng.annotations.Test;

/**
 * @author Dmytro Rets
 * @ownership AdEngineering
 */
public class TestEvolveAds extends TemplateNoFirstLoad {

  @GeoEdgeBrowserMobProxy(country = "CA")
  @Test(
      dataProviderClass = AdsDataProvider.class,
      groups = {"TestEvolveAds"},
      dataProvider = "evolveTestPage"
  )
  public void testEvolveCall_CA(String wikiName, String article) {
    String testedPage = urlBuilder.getUrlForPath(wikiName, article);
    AdsEvolveObject wikiPage = new AdsEvolveObject(driver, testedPage);
    wikiPage.verifyEvolveCall();
  }

  @GeoEdgeBrowserMobProxy(country = "AU")
  @Test(
      dataProviderClass = AdsDataProvider.class,
      groups = {"TestEvolveAds"},
      dataProvider = "evolveTestPage"
  )
  public void testEvolveCall_AU(String wikiName, String article) {
    String testedPage = urlBuilder.getUrlForPath(wikiName, article);
    AdsEvolveObject wikiPage = new AdsEvolveObject(driver, testedPage);
    wikiPage.verifyEvolveCall();
  }

  @GeoEdgeBrowserMobProxy(country = "NZ")
  @Test(
      dataProviderClass = AdsDataProvider.class,
      groups = {"TestEvolveAds"},
      dataProvider = "evolveTestPage"
  )
  public void testEvolveCall_NZ(String wikiName, String article) {
    String testedPage = urlBuilder.getUrlForPath(wikiName, article);
    AdsEvolveObject wikiPage = new AdsEvolveObject(driver, testedPage);
    wikiPage.verifyEvolveCall();
  }

  @GeoEdgeBrowserMobProxy(country = "CA")
  @Test(
      dataProviderClass = AdsDataProvider.class,
      groups = {"TestEvolveAds"},
      dataProvider = "evolveHopTestPage",
      // wf ADR-254
      enabled = false
  )
  public void testEvolveHop_CA(
      String wikiName,
      String article,
      String slotName,
      String nextProviderSrc
  ) {
    String testedPage = urlBuilder.getUrlForPath(wikiName, article);
    AdsEvolveObject wikiPage = new AdsEvolveObject(driver, testedPage);
    wikiPage.verifyEvolveInSlot(slotName);
    wikiPage.verifyEvolveHoppedInSlot(slotName, nextProviderSrc);
  }
}
