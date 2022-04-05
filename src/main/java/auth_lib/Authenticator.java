package auth_lib;

/**
 * 認証ライブラリ IF
 */
public interface Authenticator
{
    /**
     * 認証処理
     * @param authp 認証用パラメータ
     * @return 認証結果
     */
    boolean auth( AuthParameters authp );

    /**
     * 認証処理
     * @param uid ユーザーID
     * @param pwd パスワード
     * @return 認証結果
     */
    boolean auth( String uid, String pwd );
}
