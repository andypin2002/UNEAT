namespace PruebaSoap1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.title = new System.Windows.Forms.Label();
            this.mode1 = new System.Windows.Forms.CheckBox();
            this.mode2 = new System.Windows.Forms.CheckBox();
            this.subtitle = new System.Windows.Forms.Label();
            this.fromBox = new System.Windows.Forms.TextBox();
            this.toBox = new System.Windows.Forms.TextBox();
            this.convertButton = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // title
            // 
            this.title.AutoSize = true;
            this.title.Font = new System.Drawing.Font("Microsoft Sans Serif", 30F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.title.Location = new System.Drawing.Point(122, 29);
            this.title.Name = "title";
            this.title.Size = new System.Drawing.Size(548, 58);
            this.title.TabIndex = 0;
            this.title.Text = "Temperature Converter";
            this.title.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            this.title.Click += new System.EventHandler(this.label1_Click);
            // 
            // mode1
            // 
            this.mode1.AutoSize = true;
            this.mode1.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mode1.Location = new System.Drawing.Point(287, 159);
            this.mode1.Name = "mode1";
            this.mode1.Size = new System.Drawing.Size(91, 24);
            this.mode1.TabIndex = 2;
            this.mode1.Text = "F° to C°";
            this.mode1.UseVisualStyleBackColor = true;
            this.mode1.CheckedChanged += new System.EventHandler(this.mode1_CheckedChanged);
            // 
            // mode2
            // 
            this.mode2.AutoSize = true;
            this.mode2.Font = new System.Drawing.Font("Microsoft Sans Serif", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mode2.Location = new System.Drawing.Point(410, 159);
            this.mode2.Name = "mode2";
            this.mode2.Size = new System.Drawing.Size(91, 24);
            this.mode2.TabIndex = 3;
            this.mode2.Text = "C° to F°";
            this.mode2.UseVisualStyleBackColor = true;
            this.mode2.CheckedChanged += new System.EventHandler(this.mode2_CheckedChanged);
            // 
            // subtitle
            // 
            this.subtitle.AutoSize = true;
            this.subtitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.subtitle.Location = new System.Drawing.Point(282, 111);
            this.subtitle.Name = "subtitle";
            this.subtitle.Size = new System.Drawing.Size(219, 29);
            this.subtitle.TabIndex = 4;
            this.subtitle.Text = "Conversion mode:";
            this.subtitle.Click += new System.EventHandler(this.label2_Click);
            // 
            // fromBox
            // 
            this.fromBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.fromBox.Location = new System.Drawing.Point(225, 240);
            this.fromBox.Name = "fromBox";
            this.fromBox.Size = new System.Drawing.Size(111, 45);
            this.fromBox.TabIndex = 5;
            this.fromBox.TextChanged += new System.EventHandler(this.fromBox_TextChanged);
            // 
            // toBox
            // 
            this.toBox.Font = new System.Drawing.Font("Microsoft Sans Serif", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.toBox.Location = new System.Drawing.Point(451, 240);
            this.toBox.Name = "toBox";
            this.toBox.Size = new System.Drawing.Size(111, 45);
            this.toBox.TabIndex = 6;
            this.toBox.Enabled = false;
            // 
            // convertButton
            // 
            this.convertButton.Image = ((System.Drawing.Image)(resources.GetObject("convertButton.Image")));
            this.convertButton.Location = new System.Drawing.Point(357, 240);
            this.convertButton.Name = "convertButton";
            this.convertButton.Size = new System.Drawing.Size(75, 45);
            this.convertButton.TabIndex = 7;
            this.convertButton.UseVisualStyleBackColor = true;
            this.convertButton.Click += new System.EventHandler(this.convertButton_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 347);
            this.Controls.Add(this.convertButton);
            this.Controls.Add(this.toBox);
            this.Controls.Add(this.fromBox);
            this.Controls.Add(this.subtitle);
            this.Controls.Add(this.mode2);
            this.Controls.Add(this.mode1);
            this.Controls.Add(this.title);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label title;
        private System.Windows.Forms.CheckBox mode1;
        private System.Windows.Forms.CheckBox mode2;
        private System.Windows.Forms.Label subtitle;
        private System.Windows.Forms.TextBox fromBox;
        private System.Windows.Forms.TextBox toBox;
        private System.Windows.Forms.Button convertButton;
    }
}

