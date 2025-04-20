package com.example.willwood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView lvAlbum;
    private ArrayList<AlbumClass> daftarAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAlbum = findViewById(R.id.lv_album);
        daftarAlbum = new ArrayList<>();

        AlbumClass album1 = new AlbumClass("The Normal Album", R.drawable.img);
        album1.tambahLagu(new LaguClass( "Suburbia Overture / Greetings from Mary Bell Township! / (Vampire) Culture / Love Me, Normally"));
        album1.tambahLagu(new LaguClass("2econd-2ight-2eer (that was fun, goodbye.)"));
        album1.tambahLagu(new LaguClass("Laplace’s Angel (Hurt People? Hurt People!)"));
        album1.tambahLagu(new LaguClass("I/Me/Myself"));
        album1.tambahLagu(new LaguClass("…well, better than the alternativ"));
        album1.tambahLagu(new LaguClass("Outliars and Hyppocrates: a fun fact about apples"));
        album1.tambahLagu(new LaguClass("BlackBoxWarrior – OKULTRA"));
        album1.tambahLagu(new LaguClass("Marsha, Thankk You for the Dialectics, but I Need You to Leave."));
        album1.tambahLagu(new LaguClass("Love, Me Normally"));
        album1.tambahLagu(new LaguClass("Memento Mori: the most important thing in the world"));

        AlbumClass album2 = new AlbumClass("In case I make It", R.drawable.img_1);
        album2.tambahLagu(new LaguClass("Tomcat Disposables"));
        album2.tambahLagu(new LaguClass("Becoming the Lastnames"));
        album2.tambahLagu(new LaguClass("Cicada Days"));
        album2.tambahLagu(new LaguClass("Euthanasia"));
        album2.tambahLagu(new LaguClass("Falling Up"));
        album2.tambahLagu(new LaguClass("That's Enough, Let's Get You Home."));
        album2.tambahLagu(new LaguClass("Um, It's Kind of a Lot"));
        album2.tambahLagu(new LaguClass("Half-Decade Hangover"));
        album2.tambahLagu(new LaguClass("Vampire Reference in a Minor Key"));
        album2.tambahLagu(new LaguClass("You Liked This (Okay, Computer!)"));
        album2.tambahLagu(new LaguClass("The Main Character"));
        album2.tambahLagu(new LaguClass("Against the Kitchen Floor"));
        album2.tambahLagu(new LaguClass("Sex, Drugs, Rock 'n' Roll"));
        album2.tambahLagu(new LaguClass("Big Fat Bitchie's Blueberry Pie, Christmas Tree, and Recreational Jell-o Emporium a.k.a. Mr. Boy is on the Roof Again (Feat. Pasta by Sneakers McSqueakers) [From the Motion Picture B.F.B.'s B-Sides: Bagel Batches, Marshmallows, and Barsh-mallows]"));
        album2.tambahLagu(new LaguClass("Willard!"));
        album2.tambahLagu(new LaguClass("White Noise"));

        AlbumClass album3 = new AlbumClass("Everything is a Lot", R.drawable.img_2);
        album3.tambahLagu(new LaguClass("6up 5oh Cop-Out (Pro / Con)"));
        album3.tambahLagu(new LaguClass("Skeleton Appreciation Day in Vestal, NY (Bones)"));
        album3.tambahLagu(new LaguClass("Front Street"));
        album3.tambahLagu(new LaguClass("¡Aikido! (Neurotic/Erotic)"));
        album3.tambahLagu(new LaguClass("White Knuckle Jerk (Where Do You Get Off?)"));
        album3.tambahLagu(new LaguClass("(Cover This Song) A Little Bit Mine"));
        album3.tambahLagu(new LaguClass("Thermodynamic Lawyer, Esq, G.F.D."));
        album3.tambahLagu(new LaguClass("RED MOON"));
        album3.tambahLagu(new LaguClass("Lysergide Daydream"));
        album3.tambahLagu(new LaguClass("The First Step"));
        album3.tambahLagu(new LaguClass("Jimmy Mushrooms' Last Drink: Bedtime in Wayne, NJ"));
        album3.tambahLagu(new LaguClass("Chemical Overreaction / Compound Fracture"));
        album3.tambahLagu(new LaguClass("Everything is a Lot"));

        AlbumClass album4 = new AlbumClass("SELF-iSH", R.drawable.img_3);
        album4.tambahLagu(new LaguClass("Self-"));
        album4.tambahLagu(new LaguClass("2012"));
        album4.tambahLagu(new LaguClass("Cotard's Solution (Anatta, Dukkha, Anicca)"));
        album4.tambahLagu(new LaguClass("Mr. Capgras Encounters a Secondhand Vanity: Tulpamancer's Prosopagnosia / Pareidolia (As Direct Result of Trauma to Fusiform Gyrus)"));
        album4.tambahLagu(new LaguClass("The Song with Five Names a.k.a. Soapbox Tao a.k.a. Checkmate Atheists! a.k.a. Neospace Government (a.k.a. You Can Never Know)"));
        album4.tambahLagu(new LaguClass("Hand Me My Shovel, I'm Going In!"));
        album4.tambahLagu(new LaguClass("Dr. Sunshine Is Dead"));
        album4.tambahLagu(new LaguClass("-Ish"));

        daftarAlbum.add(album1);
        daftarAlbum.add(album2);
        daftarAlbum.add(album3);
        daftarAlbum.add(album4);

        AlbumAdapter adapter = new AlbumAdapter(this, daftarAlbum);
        lvAlbum.setAdapter(adapter);
        lvAlbum.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        AlbumClass album = daftarAlbum.get(position);
        Intent intent = new Intent(this, ListLaguActivity.class);
        intent.putExtra("album", album);
        intent.putExtra("nama album", album.getNamaAlbum());
        startActivity(intent);
    }
}