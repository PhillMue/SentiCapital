package tubeview.com.senticapital;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.view.CardViewNative;

/**
 * Created by mue on 3/16/16.
 */
public class ACT extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.shop_items);
        Card card = new Card(getBaseContext());
        CardHeader header = new CardHeader(getBaseContext());
        header.setTitle("Hello");
        card.addCardHeader(header);
        CardViewNative c = new CardViewNative(getBaseContext());
        c.setCard(card);
    }
}
