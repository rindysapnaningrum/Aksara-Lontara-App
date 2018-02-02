package com.example.gcs.lontaraapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DaftarHuruf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_huruf);


        ImageButton btnka = (ImageButton) findViewById(R.id.kaa);
        btnka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ka, null);

                ImageButton ka = (ImageButton) view.findViewById(R.id.ka);
                ka.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                final MediaPlayer soundka = MediaPlayer.create(DaftarHuruf.this, R.raw.ka);
                soundka.start();
                soundka.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                    }
                });

                ImageButton ki = (ImageButton) view.findViewById(R.id.ki);
                ki.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundki = MediaPlayer.create(DaftarHuruf.this, R.raw.ki);
                        soundki.start();
                        soundki.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ku = (ImageButton) view.findViewById(R.id.ku);
                ku.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundku = MediaPlayer.create(DaftarHuruf.this, R.raw.ku);
                        soundku.start();
                        soundku.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ke = (ImageButton) view.findViewById(R.id.ke);
                ke.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundke = MediaPlayer.create(DaftarHuruf.this, R.raw.ke);
                        soundke.start();
                        soundke.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ko = (ImageButton) view.findViewById(R.id.ko);
                ko.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundko = MediaPlayer.create(DaftarHuruf.this, R.raw.ko);
                        soundko.start();
                        soundko.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnga = (ImageButton) findViewById(R.id.gaa);
        btnga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ga, null);

                ImageButton ga = (ImageButton) view.findViewById(R.id.ga);
                ga.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundga = MediaPlayer.create(DaftarHuruf.this, R.raw.ga);
                        soundga.start();
                        soundga.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton gi = (ImageButton) view.findViewById(R.id.gi);
                gi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundgi = MediaPlayer.create(DaftarHuruf.this, R.raw.gi);
                        soundgi.start();
                        soundgi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton gu = (ImageButton) view.findViewById(R.id.gu);
                gu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundgu = MediaPlayer.create(DaftarHuruf.this, R.raw.gu);
                        soundgu.start();
                        soundgu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ge = (ImageButton) view.findViewById(R.id.ge);
                ge.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundge = MediaPlayer.create(DaftarHuruf.this, R.raw.ge);
                        soundge.start();
                        soundge.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton go = (ImageButton) view.findViewById(R.id.go);
                go.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundgo = MediaPlayer.create(DaftarHuruf.this, R.raw.go);
                        soundgo.start();
                        soundgo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnnga = (ImageButton) findViewById(R.id.ngaa);
        btnnga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_nga, null);

                ImageButton nga = (ImageButton) view.findViewById(R.id.nga);
                nga.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnga = MediaPlayer.create(DaftarHuruf.this, R.raw.nga);
                        soundnga.start();
                        soundnga.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ngi = (ImageButton) view.findViewById(R.id.ngi);
                ngi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundngi = MediaPlayer.create(DaftarHuruf.this, R.raw.ngi);
                        soundngi.start();
                        soundngi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ngu = (ImageButton) view.findViewById(R.id.ngu);
                ngu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundngu = MediaPlayer.create(DaftarHuruf.this, R.raw.ngu);
                        soundngu.start();
                        soundngu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton nge = (ImageButton) view.findViewById(R.id.nge);
                nge.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnge = MediaPlayer.create(DaftarHuruf.this, R.raw.nge);
                        soundnge.start();
                        soundnge.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ngo = (ImageButton) view.findViewById(R.id.ngo);
                ngo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundngo = MediaPlayer.create(DaftarHuruf.this, R.raw.ngo);
                        soundngo.start();
                        soundngo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });



        ImageButton btnpa = (ImageButton) findViewById(R.id.paa);
        btnpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_pa, null);

                ImageButton pa = (ImageButton) view.findViewById(R.id.pa);
                pa.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundpa = MediaPlayer.create(DaftarHuruf.this, R.raw.pa);
                        soundpa.start();
                        soundpa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton pi = (ImageButton) view.findViewById(R.id.pi);
                pi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundpi = MediaPlayer.create(DaftarHuruf.this, R.raw.pi);
                        soundpi.start();
                        soundpi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton pu = (ImageButton) view.findViewById(R.id.pu);
                pu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundpu = MediaPlayer.create(DaftarHuruf.this, R.raw.pu);
                        soundpu.start();
                        soundpu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton pe = (ImageButton) view.findViewById(R.id.pe);
                pe.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundpe = MediaPlayer.create(DaftarHuruf.this, R.raw.pe);
                        soundpe.start();
                        soundpe.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton po = (ImageButton) view.findViewById(R.id.po);
                po.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundpo = MediaPlayer.create(DaftarHuruf.this, R.raw.po);
                        soundpo.start();
                        soundpo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnba = (ImageButton) findViewById(R.id.baa);
        btnba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ba, null);

                ImageButton ba = (ImageButton) view.findViewById(R.id.ba);
                ba.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundba = MediaPlayer.create(DaftarHuruf.this, R.raw.ba);
                        soundba.start();
                        soundba.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton bi = (ImageButton) view.findViewById(R.id.bi);
                bi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundbi = MediaPlayer.create(DaftarHuruf.this, R.raw.bi);
                        soundbi.start();
                        soundbi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton bu = (ImageButton) view.findViewById(R.id.bu);
                bu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundbu = MediaPlayer.create(DaftarHuruf.this, R.raw.bu);
                        soundbu.start();
                        soundbu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton be = (ImageButton) view.findViewById(R.id.be);
                be.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundbe = MediaPlayer.create(DaftarHuruf.this, R.raw.be);
                        soundbe.start();
                        soundbe.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton bo = (ImageButton) view.findViewById(R.id.bo);
                bo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundbo = MediaPlayer.create(DaftarHuruf.this, R.raw.bo);
                        soundbo.start();
                        soundbo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnma = (ImageButton) findViewById(R.id.maa);
        btnma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ma, null);

                ImageButton ma = (ImageButton) view.findViewById(R.id.ma);
                ma.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundma = MediaPlayer.create(DaftarHuruf.this, R.raw.ma);
                        soundma.start();
                        soundma.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton mi = (ImageButton) view.findViewById(R.id.mi);
                mi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundmi = MediaPlayer.create(DaftarHuruf.this, R.raw.mi);
                        soundmi.start();
                        soundmi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton mu = (ImageButton) view.findViewById(R.id.mu);
                mu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundmu = MediaPlayer.create(DaftarHuruf.this, R.raw.mu);
                        soundmu.start();
                        soundmu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton me = (ImageButton) view.findViewById(R.id.me);
                me.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundme = MediaPlayer.create(DaftarHuruf.this, R.raw.me);
                        soundme.start();
                        soundme.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton mo = (ImageButton) view.findViewById(R.id.mo);
                mo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundmo = MediaPlayer.create(DaftarHuruf.this, R.raw.mo);
                        soundmo.start();
                        soundmo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnta = (ImageButton) findViewById(R.id.taa);
        btnta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ta, null);

                ImageButton ta = (ImageButton) view.findViewById(R.id.ta);
                ta.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundta = MediaPlayer.create(DaftarHuruf.this, R.raw.ta);
                        soundta.start();
                        soundta.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ti = (ImageButton) view.findViewById(R.id.ti);
                ti.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundti = MediaPlayer.create(DaftarHuruf.this, R.raw.ti);
                        soundti.start();
                        soundti.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton tu = (ImageButton) view.findViewById(R.id.tu);
                tu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundtu = MediaPlayer.create(DaftarHuruf.this, R.raw.tu);
                        soundtu.start();
                        soundtu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton te = (ImageButton) view.findViewById(R.id.te);
                te.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundte = MediaPlayer.create(DaftarHuruf.this, R.raw.te);
                        soundte.start();
                        soundte.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton to = (ImageButton) view.findViewById(R.id.to);
                to.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundto = MediaPlayer.create(DaftarHuruf.this, R.raw.to);
                        soundto.start();
                        soundto.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnda = (ImageButton) findViewById(R.id.daa);
        btnda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_da, null);

                ImageButton da = (ImageButton) view.findViewById(R.id.da);
                da.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundda = MediaPlayer.create(DaftarHuruf.this, R.raw.da);
                        soundda.start();
                        soundda.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton di = (ImageButton) view.findViewById(R.id.di);
                di.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer sounddi = MediaPlayer.create(DaftarHuruf.this, R.raw.di);
                        sounddi.start();
                        sounddi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton du = (ImageButton) view.findViewById(R.id.du);
                du.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer sounddu = MediaPlayer.create(DaftarHuruf.this, R.raw.du);
                        sounddu.start();
                        sounddu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton de = (ImageButton) view.findViewById(R.id.de);
                de.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundde = MediaPlayer.create(DaftarHuruf.this, R.raw.de);
                        soundde.start();
                        soundde.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton doo = (ImageButton) view.findViewById(R.id.doo);
                doo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer sounddoo = MediaPlayer.create(DaftarHuruf.this, R.raw.doo);
                        sounddoo.start();
                        sounddoo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnna = (ImageButton) findViewById(R.id.naa);
        btnna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_na, null);

                ImageButton na = (ImageButton) view.findViewById(R.id.na);
                na.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundna = MediaPlayer.create(DaftarHuruf.this, R.raw.na);
                        soundna.start();
                        soundna.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ni = (ImageButton) view.findViewById(R.id.ni);
                ni.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundni = MediaPlayer.create(DaftarHuruf.this, R.raw.ni);
                        soundni.start();
                        soundni.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton nu = (ImageButton) view.findViewById(R.id.nu);
                nu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnu = MediaPlayer.create(DaftarHuruf.this, R.raw.nu);
                        soundnu.start();
                        soundnu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ne = (ImageButton) view.findViewById(R.id.ne);
                ne.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundne = MediaPlayer.create(DaftarHuruf.this, R.raw.ne);
                        soundne.start();
                        soundne.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton no = (ImageButton) view.findViewById(R.id.no);
                no.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundno = MediaPlayer.create(DaftarHuruf.this, R.raw.no);
                        soundno.start();
                        soundno.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnca = (ImageButton) findViewById(R.id.caa);
        btnca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ca, null);

                ImageButton ca = (ImageButton) view.findViewById(R.id.ca);
                ca.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundca = MediaPlayer.create(DaftarHuruf.this, R.raw.ca);
                        soundca.start();
                        soundca.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ci = (ImageButton) view.findViewById(R.id.ci);
                ci.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundci = MediaPlayer.create(DaftarHuruf.this, R.raw.ci);
                        soundci.start();
                        soundci.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton cu = (ImageButton) view.findViewById(R.id.cu);
                cu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundcu = MediaPlayer.create(DaftarHuruf.this, R.raw.cu);
                        soundcu.start();
                        soundcu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ce = (ImageButton) view.findViewById(R.id.ce);
                ce.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundce = MediaPlayer.create(DaftarHuruf.this, R.raw.ce);
                        soundce.start();
                        soundce.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton co = (ImageButton) view.findViewById(R.id.co);
                co.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundco = MediaPlayer.create(DaftarHuruf.this, R.raw.co);
                        soundco.start();
                        soundco.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnja = (ImageButton) findViewById(R.id.jaa);
        btnja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ja, null);

                ImageButton ja = (ImageButton) view.findViewById(R.id.ja);
                ja.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundja = MediaPlayer.create(DaftarHuruf.this, R.raw.ja);
                        soundja.start();
                        soundja.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ji = (ImageButton) view.findViewById(R.id.ji);
                ji.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundji = MediaPlayer.create(DaftarHuruf.this, R.raw.ji);
                        soundji.start();
                        soundji.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ju = (ImageButton) view.findViewById(R.id.ju);
                ju.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundju = MediaPlayer.create(DaftarHuruf.this, R.raw.ju);
                        soundju.start();
                        soundju.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton je = (ImageButton) view.findViewById(R.id.je);
                je.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundje = MediaPlayer.create(DaftarHuruf.this, R.raw.je);
                        soundje.start();
                        soundje.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton jo = (ImageButton) view.findViewById(R.id.jo);
                jo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundjo = MediaPlayer.create(DaftarHuruf.this, R.raw.jo);
                        soundjo.start();
                        soundjo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnnya = (ImageButton) findViewById(R.id.nyaa);
        btnnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_nya, null);

                ImageButton nya = (ImageButton) view.findViewById(R.id.nya);
                nya.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnya = MediaPlayer.create(DaftarHuruf.this, R.raw.nya);
                        soundnya.start();
                        soundnya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton nyi = (ImageButton) view.findViewById(R.id.nyi);
                nyi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnyi = MediaPlayer.create(DaftarHuruf.this, R.raw.nyi);
                        soundnyi.start();
                        soundnyi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton nyu = (ImageButton) view.findViewById(R.id.nyu);
                nyu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnyu = MediaPlayer.create(DaftarHuruf.this, R.raw.nyu);
                        soundnyu.start();
                        soundnyu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton nye = (ImageButton) view.findViewById(R.id.nye);
                nye.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnye = MediaPlayer.create(DaftarHuruf.this, R.raw.nye);
                        soundnye.start();
                        soundnye.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton nyo = (ImageButton) view.findViewById(R.id.nyo);
                nyo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundnyo = MediaPlayer.create(DaftarHuruf.this, R.raw.nyo);
                        soundnyo.start();
                        soundnyo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnya = (ImageButton) findViewById(R.id.yaa);
        btnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ya, null);

                ImageButton ya = (ImageButton) view.findViewById(R.id.ya);
                ya.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundya = MediaPlayer.create(DaftarHuruf.this, R.raw.ya);
                        soundya.start();
                        soundya.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton yi = (ImageButton) view.findViewById(R.id.yi);
                yi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundyi = MediaPlayer.create(DaftarHuruf.this, R.raw.yi);
                        soundyi.start();
                        soundyi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton yu = (ImageButton) view.findViewById(R.id.yu);
                yu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundyu = MediaPlayer.create(DaftarHuruf.this, R.raw.yu);
                        soundyu.start();
                        soundyu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ye = (ImageButton) view.findViewById(R.id.ye);
                ye.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundye = MediaPlayer.create(DaftarHuruf.this, R.raw.ye);
                        soundye.start();
                        soundye.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton yo = (ImageButton) view.findViewById(R.id.yo);
                yo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundyo = MediaPlayer.create(DaftarHuruf.this, R.raw.yo);
                        soundyo.start();
                        soundyo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnra = (ImageButton) findViewById(R.id.raa);
        btnra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ra, null);

                ImageButton ra = (ImageButton) view.findViewById(R.id.ra);
                ra.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundra = MediaPlayer.create(DaftarHuruf.this, R.raw.ra);
                        soundra.start();
                        soundra.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ri = (ImageButton) view.findViewById(R.id.ri);
                ri.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundri = MediaPlayer.create(DaftarHuruf.this, R.raw.ri);
                        soundri.start();
                        soundri.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ru = (ImageButton) view.findViewById(R.id.ru);
                ru.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundru = MediaPlayer.create(DaftarHuruf.this, R.raw.ru);
                        soundru.start();
                        soundru.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton re = (ImageButton) view.findViewById(R.id.re);
                re.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundre = MediaPlayer.create(DaftarHuruf.this, R.raw.re);
                        soundre.start();
                        soundre.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ro = (ImageButton) view.findViewById(R.id.ro);
                ro.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundro = MediaPlayer.create(DaftarHuruf.this, R.raw.ro);
                        soundro.start();
                        soundro.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnla = (ImageButton) findViewById(R.id.laa);
        btnla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_la, null);

                ImageButton la = (ImageButton) view.findViewById(R.id.la);
                la.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundla = MediaPlayer.create(DaftarHuruf.this, R.raw.la);
                        soundla.start();
                        soundla.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton li = (ImageButton) view.findViewById(R.id.li);
                li.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundli = MediaPlayer.create(DaftarHuruf.this, R.raw.li);
                        soundli.start();
                        soundli.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton lu = (ImageButton) view.findViewById(R.id.lu);
                lu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundlu = MediaPlayer.create(DaftarHuruf.this, R.raw.lu);
                        soundlu.start();
                        soundlu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton le = (ImageButton) view.findViewById(R.id.le);
                le.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundle = MediaPlayer.create(DaftarHuruf.this, R.raw.le);
                        soundle.start();
                        soundle.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton lo = (ImageButton) view.findViewById(R.id.lo);
                lo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundlo = MediaPlayer.create(DaftarHuruf.this, R.raw.lo);
                        soundlo.start();
                        soundlo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnwa = (ImageButton) findViewById(R.id.waa);
        btnwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_wa, null);

                ImageButton wa = (ImageButton) view.findViewById(R.id.wa);
                wa.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundwa = MediaPlayer.create(DaftarHuruf.this, R.raw.wa);
                        soundwa.start();
                        soundwa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton wi = (ImageButton) view.findViewById(R.id.wi);
                wi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundwi = MediaPlayer.create(DaftarHuruf.this, R.raw.wi);
                        soundwi.start();
                        soundwi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton wu = (ImageButton) view.findViewById(R.id.wu);
                wu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundwu = MediaPlayer.create(DaftarHuruf.this, R.raw.wu);
                        soundwu.start();
                        soundwu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton we = (ImageButton) view.findViewById(R.id.we);
                we.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundwe = MediaPlayer.create(DaftarHuruf.this, R.raw.we);
                        soundwe.start();
                        soundwe.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton wo = (ImageButton) view.findViewById(R.id.wo);
                wo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundwo = MediaPlayer.create(DaftarHuruf.this, R.raw.wo);
                        soundwo.start();
                        soundwo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnsa = (ImageButton) findViewById(R.id.saa);
        btnsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_sa, null);

                ImageButton sa = (ImageButton) view.findViewById(R.id.sa);
                sa.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundsa = MediaPlayer.create(DaftarHuruf.this, R.raw.sa);
                        soundsa.start();
                        soundsa.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton si = (ImageButton) view.findViewById(R.id.si);
                si.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundsi = MediaPlayer.create(DaftarHuruf.this, R.raw.si);
                        soundsi.start();
                        soundsi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton su = (ImageButton) view.findViewById(R.id.su);
                su.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundsu = MediaPlayer.create(DaftarHuruf.this, R.raw.su);
                        soundsu.start();
                        soundsu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton se = (ImageButton) view.findViewById(R.id.se);
                se.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundse = MediaPlayer.create(DaftarHuruf.this, R.raw.se);
                        soundse.start();
                        soundse.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton so = (ImageButton) view.findViewById(R.id.so);
                so.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundso = MediaPlayer.create(DaftarHuruf.this, R.raw.so);
                        soundso.start();
                        soundso.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btna = (ImageButton) findViewById(R.id.aa);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_a, null);

                ImageButton a = (ImageButton) view.findViewById(R.id.a);
                a.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer sounda = MediaPlayer.create(DaftarHuruf.this, R.raw.a);
                        sounda.start();
                        sounda.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton i = (ImageButton) view.findViewById(R.id.i);
                i.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundi = MediaPlayer.create(DaftarHuruf.this, R.raw.i);
                        soundi.start();
                        soundi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton u = (ImageButton) view.findViewById(R.id.u);
                u.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundu = MediaPlayer.create(DaftarHuruf.this, R.raw.u);
                        soundu.start();
                        soundu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton e = (ImageButton) view.findViewById(R.id.e);
                e.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer sounde = MediaPlayer.create(DaftarHuruf.this, R.raw.e);
                        sounde.start();
                        sounde.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton o = (ImageButton) view.findViewById(R.id.o);
                o.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundo = MediaPlayer.create(DaftarHuruf.this, R.raw.o);
                        soundo.start();
                        soundo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });

        ImageButton btnha = (ImageButton) findViewById(R.id.haa);
        btnha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DaftarHuruf.this);
                View view = getLayoutInflater().inflate(R.layout.huruf_ha, null);

                ImageButton ha = (ImageButton) view.findViewById(R.id.ha);
                ha.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundha = MediaPlayer.create(DaftarHuruf.this, R.raw.ha);
                        soundha.start();
                        soundha.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton hi = (ImageButton) view.findViewById(R.id.hi);
                hi.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundhi = MediaPlayer.create(DaftarHuruf.this, R.raw.hi);
                        soundhi.start();
                        soundhi.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton hu = (ImageButton) view.findViewById(R.id.hu);
                hu.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundhu = MediaPlayer.create(DaftarHuruf.this, R.raw.hu);
                        soundhu.start();
                        soundhu.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton he = (ImageButton) view.findViewById(R.id.he);
                he.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundhe = MediaPlayer.create(DaftarHuruf.this, R.raw.he);
                        soundhe.start();
                        soundhe.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                ImageButton ho = (ImageButton) view.findViewById(R.id.ho);
                ho.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        final MediaPlayer soundho = MediaPlayer.create(DaftarHuruf.this, R.raw.ho);
                        soundho.start();
                        soundho.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                mp.release();
                            }
                        });
                    }
                });

                builder.setView(view);
                AlertDialog dialog = builder.create();
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });




    }
}
