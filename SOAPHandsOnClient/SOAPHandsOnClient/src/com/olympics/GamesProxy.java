package com.olympics;

public class GamesProxy implements com.olympics.Games {
  private String _endpoint = null;
  private com.olympics.Games games = null;
  
  public GamesProxy() {
    _initGamesProxy();
  }
  
  public GamesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGamesProxy();
  }
  
  private void _initGamesProxy() {
    try {
      games = (new com.olympics.GamesServiceLocator()).getGames();
      if (games != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)games)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)games)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (games != null)
      ((javax.xml.rpc.Stub)games)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.olympics.Games getGames() {
    if (games == null)
      _initGamesProxy();
    return games;
  }
  
  public java.lang.String getGameList() throws java.rmi.RemoteException{
    if (games == null)
      _initGamesProxy();
    return games.getGameList();
  }
  
  public java.lang.String getPlayerDetails(java.lang.String gameName) throws java.rmi.RemoteException{
    if (games == null)
      _initGamesProxy();
    return games.getPlayerDetails(gameName);
  }
  
  public java.lang.String getGameInfo(java.lang.String gameName) throws java.rmi.RemoteException{
    if (games == null)
      _initGamesProxy();
    return games.getGameInfo(gameName);
  }
  
  
}