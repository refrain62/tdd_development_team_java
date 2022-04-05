package auth_lib;

import java.util.HashMap;

/**
 * 認証処理
 */
public class AuthenticatorImpl implements Authenticator
{
    private HashMap< String, String > _userTable = new HashMap<>();

    /**
     * 認証用登録
     * @param uid ユーザーID
     * @param pwd パスワード
     */
    public void register( String uid, String pwd )
    {
        this._userTable.put( uid, pwd );
    }

    /**
     * 認証処理
     */
    public boolean auth( String uid, String pwd )
    {
        if( null != pwd )
        {
            if(     this._userTable.containsKey( uid ) == true
                &&  pwd.equals( this._userTable.get( uid ) ) == true
                )
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 認証処理 - 認証パラメータ版
     */
    public boolean auth( AuthParameters authp )
    {
        String uid = authp.getParameter( AuthParameters.ParamKey.Uid );
        String pwd = authp.getParameter( AuthParameters.ParamKey.Pwd );
        
        if( null != pwd )
        {
            if(     this._userTable.containsKey( uid ) == true
                &&  pwd == this._userTable.get( uid ) == true
            )
            {
                return true;
            }
        }

        return false;
    }
}
