namespace GestionAlmacenFormAsync
{
    partial class AddPale
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
            this.AddPaleFormLabel = new System.Windows.Forms.Label();
            this.productOptions = new System.Windows.Forms.ComboBox();
            this.PaleProductLabel = new System.Windows.Forms.Label();
            this.PesoLabel = new System.Windows.Forms.Label();
            this.numericUpDown1 = new System.Windows.Forms.NumericUpDown();
            this.AddPaleButton = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).BeginInit();
            this.SuspendLayout();
            // 
            // AddPaleFormLabel
            // 
            this.AddPaleFormLabel.AutoSize = true;
            this.AddPaleFormLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 15F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.AddPaleFormLabel.Location = new System.Drawing.Point(53, 36);
            this.AddPaleFormLabel.Name = "AddPaleFormLabel";
            this.AddPaleFormLabel.Size = new System.Drawing.Size(160, 29);
            this.AddPaleFormLabel.TabIndex = 0;
            this.AddPaleFormLabel.Text = "Agregar Pale";
            // 
            // productOptions
            // 
            this.productOptions.FormattingEnabled = true;
            this.productOptions.Location = new System.Drawing.Point(58, 130);
            this.productOptions.Name = "productOptions";
            this.productOptions.Size = new System.Drawing.Size(121, 24);
            this.productOptions.TabIndex = 1;
            // 
            // PaleProductLabel
            // 
            this.PaleProductLabel.AutoSize = true;
            this.PaleProductLabel.Location = new System.Drawing.Point(55, 111);
            this.PaleProductLabel.Name = "PaleProductLabel";
            this.PaleProductLabel.Size = new System.Drawing.Size(61, 16);
            this.PaleProductLabel.TabIndex = 2;
            this.PaleProductLabel.Text = "Producto";
            // 
            // PesoLabel
            // 
            this.PesoLabel.AutoSize = true;
            this.PesoLabel.Location = new System.Drawing.Point(55, 190);
            this.PesoLabel.Name = "PesoLabel";
            this.PesoLabel.Size = new System.Drawing.Size(39, 16);
            this.PesoLabel.TabIndex = 3;
            this.PesoLabel.Text = "Peso";
            // 
            // numericUpDown1
            // 
            this.numericUpDown1.Location = new System.Drawing.Point(58, 209);
            this.numericUpDown1.Name = "numericUpDown1";
            this.numericUpDown1.Size = new System.Drawing.Size(120, 22);
            this.numericUpDown1.TabIndex = 5;
            // 
            // AddPaleButton
            // 
            this.AddPaleButton.Location = new System.Drawing.Point(58, 278);
            this.AddPaleButton.Name = "AddPaleButton";
            this.AddPaleButton.Size = new System.Drawing.Size(121, 33);
            this.AddPaleButton.TabIndex = 6;
            this.AddPaleButton.Text = "Agregar Pale";
            this.AddPaleButton.UseVisualStyleBackColor = true;
            this.AddPaleButton.Click += new System.EventHandler(this.AddPaleButton_Click);
            // 
            // AddPale
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(248, 382);
            this.Controls.Add(this.AddPaleButton);
            this.Controls.Add(this.numericUpDown1);
            this.Controls.Add(this.PesoLabel);
            this.Controls.Add(this.PaleProductLabel);
            this.Controls.Add(this.productOptions);
            this.Controls.Add(this.AddPaleFormLabel);
            this.Name = "AddPale";
            this.Text = "AddPale";
            ((System.ComponentModel.ISupportInitialize)(this.numericUpDown1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label AddPaleFormLabel;
        private System.Windows.Forms.ComboBox productOptions;
        private System.Windows.Forms.Label PaleProductLabel;
        private System.Windows.Forms.Label PesoLabel;
        private System.Windows.Forms.NumericUpDown numericUpDown1;
        private System.Windows.Forms.Button AddPaleButton;
    }
}