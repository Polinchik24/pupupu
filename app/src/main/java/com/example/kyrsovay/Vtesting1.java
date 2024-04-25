package com.example.kyrsovay;

import static com.example.kyrsovay.R.id.textView_v1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Insets;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;

public class Vtesting1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.textView_v1),(v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars();
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button button = findViewById(R.id.button3var);
        EditText input = findViewById(R.id.editTextText_v1);
        TextView wrong_answer = findViewById(textView_v1);
        button.setOnClickListener(v -> {
            if (input.getText().toString() == "kjndjkjdsnffj"){
                wrong_answer.setVisibility(View.GONE);
            }
            else {
                wrong_answer.setVisibility(View.VISIBLE);
            }
        } );
        public class StartGameDialogFragment extends DialogFragment {
            @Override
            public Dialog onCreateDialog(Bundle savedInstanceState) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage(R.string.dialog_start_game)
                        .setPositiveButton(R.string.start, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // START THE GAME!
                            }
                        })
                        .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // User cancels the dialog.
                            }
                        });
                // Create the AlertDialog object and return it.
                return builder.create();
            }
        }
// ...

        new StartGameDialogFragment().show(supportFragmentManager, "GAME_DIALOG");

//        Button button = findViewById(R.id.button3);
//        button.setOnClickListener(v -> {
//            Intent intent = new Intent(Vtesting1.this,Vtesting1.class);
//            startActivity(intent);
//        });
    }
}