package auth_lib;

/**
 * 認証処理
 */
public class AuthenticatorImpl implements Authenticator
{
    /**
     * 認証用登録
     * @param uid ユーザーID
     * @param pwd パスワード
     */
    public void register( String uid, String pwd )
    {

    }

    /**
     * 認証処理
     */
    public boolean auth( String uid, String pwd )
    {
        return true;
    }
    
}
