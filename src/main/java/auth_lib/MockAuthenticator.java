package auth_lib;

import java.util.HashMap;

import auth_lib.AuthParameters.ParamKey;

/**
 * 認証処理モック
 */
public class MockAuthenticator implements Authenticator
{
    /**
     * ユーザーテーブル
     */
    private HashMap< String, String > _userTable = new HashMap<>();

    /**
     * ユーザー登録
     * @param uid ユーザーID
     * @param pwd パスワード
     */
    public void register( String uid, String pwd )
    {
        this._userTable.put( uid , pwd );
    }

    /**
     * 認証処理
     */
    public boolean auth( AuthParameters authp )
    {
        String uid = authp.getParameter( ParamKey.Uid );
        String pwd = authp.getParameter( ParamKey.Pwd );

        // 認証
        return this.auth( uid, pwd );
    }

    /**
     * 認証処理
     */
    public boolean auth( String uid, String pwd )
    {
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
