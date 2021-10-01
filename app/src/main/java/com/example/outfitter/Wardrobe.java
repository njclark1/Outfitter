package com.example.outfitter;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class Wardrobe extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ImageView hatView;
    ImageView shirtView;
    ImageView pantView;
    ImageView shoeView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wardrobe);

        hatView = findViewById(R.id.hatView);
        shirtView = findViewById(R.id.shirtView);
        pantView = findViewById(R.id.pantView);
        shoeView = findViewById(R.id.shoeView);

        Spinner hatSpinner = findViewById(R.id.hatSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Hats, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hatSpinner.setAdapter(adapter);
        hatSpinner.setOnItemSelectedListener(this);

        Spinner shirtSpinner = findViewById(R.id.shirtSpinner);
        ArrayAdapter<CharSequence> shirtAdapter = ArrayAdapter.createFromResource(this, R.array.Shirts, android.R.layout.simple_spinner_item);
        shirtAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shirtSpinner.setAdapter(shirtAdapter);
        shirtSpinner.setOnItemSelectedListener(this);

        Spinner pantSpinner = findViewById(R.id.pantSpinner);
        ArrayAdapter<CharSequence> pantAdapter = ArrayAdapter.createFromResource(this, R.array.Pants, android.R.layout.simple_spinner_item);
        pantAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pantSpinner.setAdapter(pantAdapter);
        pantSpinner.setOnItemSelectedListener(this);

        Spinner shoeSpinner = findViewById(R.id.shoeSpinner);
        ArrayAdapter<CharSequence> shoeAdapter = ArrayAdapter.createFromResource(this, R.array.Shoes, android.R.layout.simple_spinner_item);
        shoeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        shoeSpinner.setAdapter(shoeAdapter);
        shoeSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //image assets
        String bootsImage = "https://lh3.googleusercontent.com/zqltpmt1P_fi-54iOgbwHfe0d3K6HnH3agilaP4bD7Zd5mY6cvpCNsz_SJcq7CDRBQ7foxI5DUUnoTf0PVOi4chdGN5z0TDDxYyDRXfLFzoiJrTGOlpLgAJrgR8ZkRLvtxu5D7kcMyfQAYZw0aiSsSZp2cyTgDlwurFwr1gIANDw7IzYzKfVnitOD4J0ZVLIQnT85x5JXVSTHYkl4aRQp2iRhGP-W4tw0D-5yQTUEbS8r9vElLxoFB1R6i2gAqKVOXB6P_X1VU6ybPpv5BNJM6G35NkSR8rSqu7uc2952KrLsghkYZ-mItJxBHZd41-smIAJf71EtseB5PSLsQgwOkJQmZKMpR8ooWUdhywwAA8OsCD670tCLIuv1WeoaEeprdXYe7wsyj5sjUIBsh5h1vUPpZBzGdVdl8AT8NM5W2QTOVdDMME_LNJN2KcgOrHpsgc-HfJBLoS1XQ1gPAUVVyZXgWY1NbC8AbjXy5X-YeCoLSZJq7VPD4gA3rbEy3Z-vsG6TzUxehm61YannDL2t3ZBDWFG379VzhIQZXLnIMR_s5V1Ez3L8cTFUyeMOoMDXvRgMR84pUbHqkraHBPkEKm6n8vrizq6UYdkXYjvXiLh0Op-p89G0KHrDslaON3Fpcqq1IRc848PPNsjlnbstVX8S670p078B6FMY8UJZ7cYAaxfGG5EzP2GRG88O1xmZztQm3rXmC0hdbPrut-cPnmb=w433-h577-no?authuser=0";
        String shortsImage = "https://lh3.googleusercontent.com/dBOJxPiJ4ph_TexQamo-f0-LM9GRIMKyLEGFRjWddGNEUmeh6SbjADMJj8xmNFyZ6UEK-jLbt9eJiG97DVbG-LKllcrm2CPULY3KH5OlEcat1suqbX8j6dVG5Ac4SiLrrOrO0TJADuSFejPQhHmsZv97ZSZc2dn7EpuodTLKWuLS7w9zqGTlkDcrVAkvrdU9P_qV1aRPOB_nMevk5QGW4o9X28o8CZGz2mQwWBOev6_06bOp4lWUhIXlGrzkYlv7ZET3lJicAUiIwYXK2E5jaINJi_1OAy3NhFfuvOmgjU1mUJt_Hadoquv3kbm49f8h8_ctbD_sWYrk7avWVB_rDulOojJo1zQjBrHgdsT8EMYZcms1jb9xgh6IVNGG_ykErbvMnzZtmwjqmol2jGSNNdwULbST8-w86-_FFcgAyhX6fRzJrbLYN-u9r17MvJBh-vaAlnb-Z79QIdMHoKhiZ6wyF9sHSIxzasx3jDFQfaF-b6xl7IlhrhXB53zr-zeJTEUnQQ9DhNGOw6ZXfIasL4AeaMAAILmpqK1ohN5UqtnwyLpmvQHbyg_l4CK6-iYvo3DHhfNjWY6P6dCSOee58lcrLjxP4NKw6amrZ7G7tBEiXmwOFyt3Z132t18kUv_PpG7wEyJoPe804FbF2G2N6rFwrfOuyxRT9O4nyBaevQmt5grajzVy8kis_RJptmCWbRXeTfEZMUrhKz1bgSnv6Y7J=w433-h577-no?authuser=0";
        String jacketImage = "https://lh3.googleusercontent.com/ajM4GqcOFedSWlyO1Me8J9oXXxevUf7H9FB5H1P0OKh_uHWzYwEBFwHz9GYvQkayleeVj76L4bH9c8PTEG2zP7FxkNd4zUB0peuhUd06EhKrNhMBo-ITSQtEz9x9yXNzAMQPwUFdp6aJ2tx3BBP1qII93y0mRlCTvnH35ukEcdSnoeVL9DQV9IoKphXDzI_uh5fsq4gIE6QOBJHGVW67Vp8fTpIplPow9aHQlpxZMwWr4ksCxKfPoHnYExT3Wd2_Gp1cvgG8aEHYPvK5DKXOR0MQR7hF1obTFLQovzysLqccA1Zolyr8ySSUR8lj4phSQ9z7Sunp1812kXsCu-_r7XgmBsgtdgEgcbDj9W3p5XizVV2D0wtf1g5WRHnkRwRMQ7qHE6mG-wkbpAgAAgGmt5Bb0Btd1kvyYjwKVvkMwiwKa1g6sIRqT1Z_F7so3DGHMzz9TF0mMBy8N5tFwwoqzYYBbAo3bK84NITgc9z3UWqfneetyvoF2NlisCqg0HmbhN9Z8fTUltTcucLW2wjR4De_cAop8hyg6VamWzdn1Jr-g7Ptz1-Ce6ZKPKYTTEpQcQC-RfkxOoeS7JvDLXoKZ6C1AbZjE6HYQLqoHJRps5CcZ6sTUrFBOU_SypwaT3qe_V34aQN4ONpxIGjGH_nf7sSWuced6owRLJs8UV1BvLIC2Od4pIoxhetcaY8L_XOznJ_YekWoDlSBr3G3x8lUOdsM=w433-h577-no?authuser=0";
        String longsleeveShirt = "https://lh3.googleusercontent.com/IGrQloXDJeUBxQ8xnL14AClhDzJlPxt_ZU48ozu5Oomj5gnu7UWZEwDl-L0x2-LRWpduYPSZi8cs4CPbg4FuqmJN-NGsvBrYlacM1vU3XJwqvNjjGcl2yYxDbmsmb0SkX7tR0SBSxdva-uZ_CDI_X--I_5PJwOjsH5N2-dwhwcQax6HO2XSYUWXRzwqyEUjDwXyB1ERSY0AHlD7I4iTvjyXp3OWJBDLpF_JmFj0_b2CB7IuitAvMui5Zqcv8QS1aPt0R3gVMs7iHTiaF9frIVjBAuZXycjN56j6goSaMw99hgDc-TtSkbLLjk3Ek4UmIAV5hVPKtVPvNTcsvOc9T4fjm1ZeVvtYiy-snZCO9CeeBV-6X_d0QE2Tl8OL9WBmTnwBNnsv1z5xtExZqVjow404AxIuNpEyEc6PjlEeoLgltg9j9N7nUjCvtUBFiqorblZCeuXrDQ2FBEYoKQJDg12c1CHhLu_DrZ2ItYCNDSqae8nAXpDsFVzmimeLLfbhmNRySbsJqGPhYM6ZLTfIJGbsSydDQ1tJ84whPqHDYe1_Q7CIy3FQmAyaM2zoZWCUI-grvp69mnM7RMDjBcPsirh065OySB-eNyjD5vS8Dk5XiTv8JUqYaLE7dFp2Qxk0pPD5ga-f2K1QKv-_FD5VQUeSIPzDcuVYkZFTOj4LCuPs-NhsCq8t0eGIec3UlebzcmPj2NzGiCPbAVM0gYtxCWUXf=w287-h423-no?authuser=0";
        String happyPlaceholder = "https://lh3.googleusercontent.com/cTkVdu88uunam0d75JKFeQJ5fO-HxRH2NoUASXKaCuV-svZf2ivaR1Rtt63DGAWdLcVEU-gJ2wt0DNlOr2d3FtJMhLJvNXEiil2FV0-TYwVUCgGrWdzyP8O9DADepqQXLQV1FflbOMG7zBW1msKCMWD6pWlYIBn7JkJRjrNLmVwSN6NmNN0-SE-gXO0KOggLsv4HF50EcYR9ScXcwJasPE-pMOXfd5z-v7sS7zJqge-1J6C45YYZWFFX2SY-OPImdU0G6EOpZclw3gF8_V0FrkiHeMPXFNPmjrfyMafq4-1XB9ULOuZw-mNL1l31OwTtmCcuvs8E5HLKg1YC6g7fL1LDweKf2HDdN8PAFAi9MudsYkTjzsktta9mWIsv71ALUb6Q7ZvPDLx5Fqc0uslNk3PQVXzkEcITDvPz5r43pZUUOAodWNHhkV0o0PCraEGeFRk2UIOEufJZpucOfwiBxGx3-w8p9qZ5y13RNR4noOoCjSLH6LFkQOZwGHvyyj_Ab5aYmk8QeM7Pud4FLRr9_4il7uSeYpTs1nL1SGdyxPa0k9EmR1DpKw_0UA3hjGwoqLWbapZlxznTuNqNkKF37m_gHsyY9o5MoVh34GU3oCHBRqXf03Hc30o98_6VT2pysG58COPhfkRAO30Bmh4GKTc1MszUqiBHu5chHIWUz77MF-cbiT38I-uGU58YpPsY_6LWqp5raOiJr4JT8jAkCPN5=w433-h577-no?authuser=0";
        String PSHat = "https://lh3.googleusercontent.com/m_VbEOQtoyCKiyju32vH8CgPRc2H1NvonwIcjXrrem7Y92VTsao2RzwW0zJWGYw8urN4la6QrIdg8B3Ey6YKliyGyLIlACG2MJK-HE-lFV4Hcqw8gDN-0e_vQ_JrVDfgakkCy3AD2HxRftvvmPMasaadQuwW2f8Ymq7EfQxZnupl7kezyPbnicCSt8YCAgYOZDbBl0zLXnfqSSQ9iSKapSel4bVy5AXv1svQJcWoE2z9SOJ56Y5qCLCPFzol4mammmG_5pMQuhzLFH0FU4r-3R3Ma8xxmoJTthyLHv5gRI3UXI8FECQ-oDxZpO63gaOXFAJS0AHGXVXib5B3VHeHrJvv0qqS6PIot2NbXkwnbBSaI8u9KWIfMuKwQ3mNnp6TCPrXYXQl9gVpyF8-UWI1fRvvqUAAOsMkGFVbxewVz-oKqAk2tIbhh198nZUnRTMBfvLWwwAvXfJu_kNLfztPUqAyF6a2JS7goyKVXV8Os2fCoO-YbcfpVDCxLG9dYn26dgW1uIXgF1CW9kw4Vyzkld43XB2PMrkgEBbkrnkuLZyoNWZOHRMpBJOk_OQ0a7ehHs6YWBBB33ZsIxNbADoqRkHp0aYDZAUicTUHmd6Q9mgz30nvjWKGRNRTvJjGS5ajGNjzpNnEz2XDnAjzLsFvCD1j1OgvJF5AJmnRewBULUttW4nqY7bt-Vvkn2g1ORjYjvYR505CyC5-R3GtN0fG9ul_=w424-h438-no?authuser=0";
        String tubeTop = "https://lh3.googleusercontent.com/tcT2QrmXYq2XgJqm57RwLZ7QqDRc8jvhV3gu3RN3MGbHAli3mPHBnlob8_mVQJORzFJ6HViBaXEJbrTVJb8QUNl146vJDfRTyGsbdVGccEN19v5EJZv5zi6Oli1pQP8zK0kZWv3EuXzSu27kLGIBoGqnHxx6L4pzQkIGfymi49wq1fFheOlDqtahsGPAOTK7uj8m4grSlqv61ukcudL2QRXTxUFmz7CnGSHXH1RqXlV6UGwLtYc_cSa0fuHmGPkkrvS8sVVV5-o6jkzh5fEv9LKNeG6g942Limdilc-u8PEKrdLQoOv5O_YLYqAILd8iyNKjr0QIZ-gg6L-ewfK-VBUPxo_ajxZnag5fYQdWK0flKeqRfvp1y-WvVEaUfEOkaouOAw5iJ6xVywVM8HI74xoSYwmdGo11WM-sdMA0KI0q5zaWs9tPEwYG3HCQD60pywdGzDqRXhtF506brucS2VtEFMEM56er1UxVRni7D1zaRxLOWtoxuY5-7VUmVBhpkhZysIHINYgUlvhtQpNRzPggxpbtdRq6C1dSyDsoyU9O5HO5s2wIzJrpAR9gL4K6XizaWzuNcxwjM72u-ODQgYGVPZgmrheGxeoGxUumgNlhoBCPBk-FKeEKQVq_Gocb5oRArh63oeNgMEp9xxZkm6n3MN2H5unJLOsoVL2DJQk0aassrdZtRr4UxOWNKYGEBU0T_uret6UNXfTtBGrOnBo4=w433-h577-no?authuser=0";
        String flowerSkirt = "https://lh3.googleusercontent.com/lRY7_UnAZ2cBYBtm9RRzjnXLfFB5hifb-Tqqrdo7w21QYp6lT3s5rwmNfL3y6jHIlx1_vcNeoAKaVZgDCtpg_PEGrJpDd0zUSHiYAojdyFKtDmTnNJsi0ejuXE_qYn3gEuZEtjRwrEGqlALrPQu8i-ZRxrCx4LmbCDBlU8lwdUYgUHERaH3jzE13eukRoMWh1ae0tny9Oz40DYuHOX2cDUIteZ_nMw1xK1mF_Ksy3dDVEAIYo-l3_fD0q45Txx0s3Xe_v79kSh24xcv6jiVVbDmGKD_soQtH8E9rlCRRhGQWEJoIBJG8YaOH9_amyuYPBFKFOW5NwoPg0TGpHshEUPp46Tfqw5TabpeNSzHLlNAMiN31PlyboOuhX8UEqHq2mlWMmeSWB7NOPkr4DqeHmIZaVM86yCNucKusqKfH7X6W2M2MaRSvyZRLLTQ4XtJbclWJt_iWDogFfEd0t-btUBKb_UsdAWGWIVf-mcz2tiw_Or6b0d_5RpkPFJXE62fAEq4VX_PkbmeEB-9rxLHYnVgIUOWRF91eDWJGUDXFZrtBZ8pI-UoPGv8TzzmNEmXk_Yw-tJfrGieJjN4AP77_Cb55pZ06EGMcGXJmTAhrv6xZAyX7VNBZsjLN27GhgSrvv06sJhoo8fJwDVwMIQcSCncXYX3-mxqOi-87y7dx6V1C4Mt88ccHxLTk5wcs0ZuEGnzUGQs1-gaA2w1ysTyqh64G=w433-h577-no?authuser=0";
        String blackBenie = "https://lh3.googleusercontent.com/uzEOCSHsB6FZk0HPTdQ2HovorIXjd3ZzgJYNgvL7_De5BKK6NSO_XGZtpbfoC91rd1Wt7xINus_yuOkWau5CqL87ckXDnhU8F-6bsEo_Luzf6zDaE8bek0uH2oOd1sE5LcgC7ofQeEUmeX3Syb_-zFSWKu6iLUZvoMGd_w_BHX7YnCHy9lcY6MHJByOBWN2t_o5GQb87J9OiAX3dP4HVSuRiFNAwOHy18DhWHNVQPqR9CswT3Dv5yEk9lJ25ouxU0rLa63YV3QANMsy-mbo2XgmIWrTCWzA1iHes-UrcNi5xkkmor64Ejr0ylYXb6r7Rux9DhEYT5h4jEutLnvCsy1iU12pSqydUVwr7HYb-ZadzpQ9YXtXtVpm4KQ0a3pKLbEFjULwsYToFJeeq6TvK8ZJItRdUYpIwwu1jeOHI8v4B7T0S42z5SuDZRJljCxo9qQBbOCMvoh0XUzhpl81j-G9meZIPl1ic7Kt9hzc8ieCPGvtkp4LdYANmVWVmsp623mL01You4wwd6ZDeI42N8L6CqU8Op3m8kvu--Rmm17NOZ8xkA2la1V2vLZSdKbFz3W_z4iS2Kd6NpOfL9SdeKMA1I4ahHZfI_7COfGSpDKU_LDQmIwu_uQLavcqfwijlLMT2XmhXhQ89e7VwekSNob_9_ou86vMvzI-3RpYrzfeLrTSHJYymLSB5_4BysTnLkS_dJt0I146LJB9c15UxUKPC=w433-h577-no?authuser=0";
        String orangeSweater = "https://lh3.googleusercontent.com/J8UsLiTe8DEuvsaQ03--QMb7typ5eK1ego4iVkLYq9gMedaMzD5-I-9fepKEW_cwbPbf1WQHiNSmD1sjav7yyk4Vuj7CoZZ8ZM9zV07DJAcY1UgiG0y5U12C5jAWJzedB8O6HvT39QpTYrpKXvHXLh4UqVrfQMs0G_zsMLYGyEXZd2sM13gxkhC999TdvpbvhRvbo_prV-kWDbd6KUkgeT1ckzm8egjyR-xT0oKpZ1zt_DyHbjZcbAfCNqU_zHx-3_f1Es_JIJapgmQ4UnBkax-YxwEAL3eSKYNBnEAZX_V6Slf6qVd_CX32RTpRi_cJcZ_bk6dfSsRTD__YyoOMeqx9uX4ou-5HuFsDTXb3U2iwYl4fLvMuF6cEHAEB55MIWrUbpfI9aAo4vc1wg9WsQ9-oglqE5BLeZUYpFxJ6WSuD7uMGSyAlXlCHpZNpw4U7K_26rx1VMOW5JuJckxQMDb3ypOrrjpyEBP9ubisk12k7Bc1NOgg6Sixy2BX7O9ZfSovQ0e1nqhmDXbbkp3akohxs2SMVajlIbh65nbslTEBTpdYPZamjr9Bj_D8jPq3wKw05mKIwn2yZ4IzjE2orFAhUTgbOViunSlKvIA3NupuG5l3jKcCwGboOeukG8S_FbKoHMMcT5fm17mCsmD0ycmsLbAxxz_WBROc-oREpNtlKQWJIkwYEs3QLxEBTJk7KoPcPY83-c0NtfVkq_Fk_yEFS=w433-h577-no?authuser=0";
        String purpleSweater = "https://lh3.googleusercontent.com/fife/AAWUweWGXVBWOIyqecMUKbIAztw48o5em1a0AhOwRKMoKGAKI5iIHj2dhbVJqh3ByRY4F2hifUhM5uTIQ_KSRXr2TixFJ9SbcMD4DpfDS-lq_Edx3zp7rxeatvlmTa1Nu-sR7wwFiq2kfMivAjDYe8Gl3-YkNiZuAWG5zXtYM6YpyKdGWqEkj5X1mPQu5Pg7C1N_v-FdXwXHWruyrQUn-eDail3IQGQ2uXr5wUgSXbGVe0UhAFAoXTceZBujRjNG0pLENtiu617AL88q0_CWxzmpIvBL-RNhiFrZPQXk7GnMLanBAVrTgtRj6vpxSCQdu1Bbkpoj9T9fKh_Bz8H-CrgkMPBiPrF4BkO9rgDvW-8TOh28R0lVHHvPjczsl6ii24Kixxn_slZMXq-wIbM0UvgdRqjLnXas2QnJ2bLA_4ktsvJUHOAXuB99SlcwSrUhfpr-9piJwGsLxG2gC62R6Lh0zdCNn-1fIlN8oaxY8PGuSvmI8_wMuexpssNvnvTz94TYwbbBiWFUWK0a7Er0BeoQ81tML9wg9J7ddk0I0ZPMkAzRb430VoP4yk5EfVPzfzPUVfm7TMJis2GkbBiOc5RWvST8WxP6nPyXjPxQ3ib67yFCRUVgcq_ppvKB9EQaCS82ytktiMY7q-UeMsYPa5-jDMAiD4OLLiWdy70XfTZDi28GtTnEobDGg75bkpCHAKadx2RKXV-M8mtprH5LwNVWWktL=w433-h577-no?authuser=0";
        String blueJeanShorts = "https://lh3.googleusercontent.com/fife/AAWUweX8APqTKKywKhRhWKlqgHE4jQwRk45-lRTiG7s-d-Y2wFpc1Kn8HL1X1zlB7C-s0Nv8X2gt0BxBQy5evdiL7VXW9Zbp0RXFFJrJwNoGpjVrIPmrLMewyLNwQ6s1_rYJKTDtuhoqkhD4E7mZqq8fhKDQMcN0M3yvpoadcmp0-dxq5XuXodR21_tDONk7aIUkvpqnOlTzFJLuXIlQ6LmYmUSpM8FJV93QFB14_8tvUeTfkLVK209lKdiCq-axHBAVjx6s_aa8zGCNfWaAdBihg57GjuD6tiHGChaIDyuiKKRqR64ZE4Vd8VW2atZKklct9SDygHXrO_oBEff8YaFlPqMeYxUJZFPzn3Ao5s9a_CWhnjrjYU06wrlrOQ2azNgu3MlTAZGmRp5xgeHWFWIaxuw_hAblyof7X28s4FpEhapIRygi9NXgLojUGzRh-NxTqDzadqFvlBQIU-jeIiAyNTymzHRgoMwPTC7-ZZeFwiauNFY9XwYJcnsDVgyEx29B1RDKO-LoNp1o1ygW2sCP14PMDQ3GF0Bh6iU3_iCH1emMc3QQGQSNV0_UYgg0DG1w84QyFs8WHjVA5YT2MnnqVp9hLYGphlCf8WsAAXHHcjNg8txGbZKlZ7-adSdQgbJpYxzK120ffUoyDS3kmHWjF9IJbuXKiPiP1hOiSldqgPQRENx2fTX1bBn3eCJn9VAT1stnQEYD0hzi7hmarV5i317c=w433-h577-no?authuser=0";
        String nudeBlouse = "https://lh3.googleusercontent.com/NHuCLmoQnC0hu2SAxn_smblOIDTqn3T8-xxiN6qO7rj6qesj5lP-ABZFjjWTV8wsajXvyiizTP2BfFqBe8YSojmwV-fIhDA0d_AhVVgJAV8glWg9JMUxL9VGu-UzwoYUrMILMVemjDQ3dTfOYPYTZdl0rrZV6TiZpRg20lKe72-7QUINGqaYbfjsBd_o4V1t0IqugcBah9-q78i8zs9j1qzE4c8e5-nd6fpNIU3D4NrsPKiiQ5zaY9fLxBC7uRHYuY84uYPUTKBer1yP9qR2dHWaBE6lGsTKqTTRaKHm7ocfKAfqt5dgeOOQKiqitzcFNs2OjhbC2zj5rSWV8CM8VPP0jyqvco4TPptXjn5I-Zqoo2SvOg5BRfXyzhp7mzwwxLlnbOlNdSsrRO4aFaSJOcSKW4chhc3EzMuk2LZmOkmdTRV6YhK3WRZu_VDM-IRjGLahnvcbwuYMvtA_0YJYCYIw8kRtmMB1RtA5sWO6L3t19CXK6z_kX6_G9Pb-tZrHKaN4i5o_Z0CEu9fwUomWHl04pKb5Tqn8lB_UrNesGGLHBCJHCDjItl47BY9QHm9E0q8QVU2LaEPgZJhlVzFA3G777yhgEgU1jtNLeXMK7iszml2kfauuN7omAEH6rL68Sg_p47dsDEdzfFdie0zKPLpBmq7L5Cs8qo9SDbhE1YwF0WAC1KrpLQPbYbYXnTZvy6CVotXbA2d--AocFPGc5SLu=w433-h577-no?authuser=0";
        String brownSweater = "https://lh3.googleusercontent.com/c5pJYEMAlza_XiwWEMlAh0M0qRsxHpw2uoTmyu4vqpDu7phzuWO_zlsWvW38-sHPfJFBsmgDwruLVPERTn06u4WLdf2CzF7LplZlcWDarKva0mA1H8_vUtLTeT_wT9LAQKxQsaOi83fmPWirzm5MCUe9etBAv0rz0xhLOoaExzIjpT3hcWCddnfiH3qbuYd7i5NMkS6qtXDBQFrv9LgwdgkT9K9y4WF--srtBD82t8iqWsCFF2qsYSdjF5xdgHWdkFxkk84O1vSFjg6cWnzSdtN2wMSh4Sch5Dpl0TAQbjoMHYA-Vivxdhbgn94f1aGOEvhbuSHDKY9SaV7H_n0-OcpcMEKKhE5oBvGSElEK-arSdv1OXqrZLOw4HKTR0a1y19kG5UyfJhB_VVPbzUFJwKho6swmDpUiHpE-djlAC31UNeLXfzV1OXRKzP0Uzouv_Ckm-47Dz1WhWns7VZ676uDch9FRp7AWr5kKJwfvZwRtHNGzUO0bimpeQ9n_HqGlr1qWClx54osegpDQfE3WfeF7_whPYoNyggsGUCefBdNJUTmDqXTPki3ueCUGUWxE4XExk9PkMfIKaKCb2AYziRqRrIK_btlqv6aQY-g_yKTBnkuFh5QEtP10ZdcM9YekomGV7rq-NU7evdk98vzkOpOKWUXSSbAkFh_qkdTRqwNojHcBWlCydfVthGHygAnle8H8-zaWuUH7yJSlvMy6arQo=w433-h577-no?authuser=0";
        String whiteTank = "https://lh3.googleusercontent.com/-FL9zk_Tqb3RYf-b_PieQfw0YRen2bEFnqc9gi4PBI503bYFnMYgeVxmZyiPc0385pPk-0s0vHhXg6isS5Sr27v_1eotkZPhVyRdlBC1hh9bg0AQanVWmVRvI9NiE0tFVOR5Z8VghFSOOu5Wd5fyHML-mV-c142KS7PZjrkXB_4_07e_ACIZ_5W7vYPWoWoAnO-P66t9IXo7ytMzzlsu7EvOpVN84c7mSg3dNi53qYTwkZK0aYZsHD8Xpvhu_3Xq1Q4KtJzk0odorEu-CafnVVPd7D8UG0uxDXU7BF8x-19fDFKVAz0wDtn_Fx6hKRdhyhS-8eaQwKsehSBFrY81uQzieHhvJcJdCkFzlunnkPTBU0Q5_Fg4CzA2c8RUI6arCBVG09LqLrlZU7JYrVxMhMscPDfAvFB8i34Q0k6qZ1YO0BnCh2-n60wDCa2jZ60WRD-GKjVYdpqVU2MW1MqrmqlmpsnwdOLDr9wK7Waq53utccB5XvllfoYKAbXGhWodRbNFwYBOc0xuEO7uKk8thXBJtfJme6LXste16_qSiolyMOS0808mm5b8DN4YmJcEd80-NV9UGfq3jURw6Up3uTXokD-BeCTa3udhVux9b-MlAmLKAX_sFlMpPEWhpIDmnnjGiBuhIAwxdGAjHxYrupkAaAUjE_Zgjb3rjHrhh0Fazfo7IsNYTwiap0U_JCg10aQZ6SAM-Gz4UldQdJcIrxkM=w433-h577-no?authuser=0";
        String pinkTank = "https://lh3.googleusercontent.com/lWmhoFDoilPzMHT2a1LK-huoCzN9e0qFyvp8Y4tdVLvHAkY5Qm9Zte8WcsP_je8gWrE6U32eXedFO_M0Elj3PfGl_NLlKcpLFQ8wibxCYJCDHRXFDsnwQu9Yh7DOmcyAl9GnZLSEm-X5-540gSnJ6fUKTgbChkAAne1jrGhfNamCXMLZqabSyQxXyiDr_ibsUL7bgoZzIuDKzwOoQOdgAJr5hNvMaJ2AEUO0Uk_Pna1mH939G1gxm9Z5TWAOC3Kd2QQTmYNTiFdW9QWVTUHDf6CfItJtlQy7sVYF_Yk1wZyCdfh7Uafa9BszrnFIA09dJ3cta2EZt23p8xpUSiov2XuvROENUVsqt8-SZzJw8GOOe9VtbZSWT0piuUVynx2r8T42G-tB7buz0W5F-hArUrEBd2P4qj-W7icCjVEhr2FI5nSQq3N4-APxZUHaaGc_yC0jTjj6BT8j-25IP0bpGpcRAYPPwYVHCjmG_d0nWLRQ9Qg9aebxE4n-_KyVEurv9DbiczPiiuleoPWXbxS2spL-DgvMcCFjlIIzENPDEstnJ1FOheuQH-C51nGABAeP8_v7fJDB34vsPc_0YhavqLRdNOsldIy3EOFGxxND9rPXEXsPFaOjeLZ-aDY9BMaIY0SPbS-hdUoekmciSMqCZI_7xxpe1w2wo_LE3SUT4VIjkKaW4if5FOK-sc531fTIWW7bgk63tF_csmN_nfHbeJH1=w433-h577-no?authuser=0";


        switch (parent.getId()) {
            case R.id.hatSpinner:
                if (position == 1) {
                    Glide.with(this).load(PSHat).into(hatView);
                } else if (position == 2) {
                    Glide.with(this).load(blackBenie).into(hatView);
                }
                break;
            case R.id.shirtSpinner:
                if (position == 1) {
                    Glide.with(this).load(longsleeveShirt).into(shirtView);
                } else if (position == 2) {
                    Glide.with(this).load(jacketImage).into(shirtView);
                } else if (position == 3) {
                    Glide.with(this).load(tubeTop).into(shirtView);
                } else if (position == 4) {
                    Glide.with(this).load(orangeSweater).into(shirtView);
                } else if (position == 5) {
                    Glide.with(this).load(purpleSweater).into(shirtView);
                } else if (position == 6) {
                    Glide.with(this).load(brownSweater).into(shirtView);
                } else if (position == 7) {
                    Glide.with(this).load(whiteTank).into(shirtView);
                } else if (position == 8) {
                    Glide.with(this).load(pinkTank).into(shirtView);
                } else if (position == 9) {
                    Glide.with(this).load(nudeBlouse).into(shirtView);
                }
                break;
            case R.id.pantSpinner:
                if (position == 1) {
                    Glide.with(this).load(shortsImage).into(pantView);
                } else if (position == 2) {
                    Glide.with(this).load(flowerSkirt).into(pantView);
                } else if (position == 3) {
                    Glide.with(this).load(blueJeanShorts).into(pantView);
                }
                break;
            case R.id.shoeSpinner:
                if (position == 1) {
                    Glide.with(this).load(bootsImage).into(shoeView);
                } else if (position == 2) {
                    Glide.with(this).load(happyPlaceholder).into(shoeView);
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(getApplicationContext(), "nothing selected", Toast.LENGTH_LONG).show();
    }
}